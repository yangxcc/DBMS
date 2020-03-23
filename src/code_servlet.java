import javax.imageio.ImageIO;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

/*验证码的检查需要用到session*/
public class code_servlet extends HttpServlet {
    String message;

    @Override
    public void init() throws ServletException {
        message = "ooooooooo";
        System.out.println(message);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        /*PrintWriter out = resp.getWriter();
        out.println("<html><h1>It works!!</h1></html>");*/

        char[] str = new char[4];  //为了存储验证码中的字符
        HttpSession session = req.getSession();

        BufferedImage bi = new BufferedImage(100,35,BufferedImage.TYPE_INT_RGB); //创建一个画布
        Graphics graphics = bi.getGraphics();  //创建一支画笔
        graphics.setColor(Color.red);   //将画笔定义为红色
        graphics.fillRect(0,0,100,25); //画出一个红色矩形

        graphics.setColor(Color.white);    //将画笔定义为白色
        graphics.setFont(new Font("宋体",Font.BOLD,25));  //目的是将验证码中的字符写成白色

        String regex = "1234567890qwertyuioplkjhgfdsazxcvbnm";   //正则表达式怎么弄？
        Random myr = new Random();
        int position = 20;
        int rlength = regex.length();

        /*向画布中写入字符串*/
        for(int i = 0;i < 4;i++){
            int j = myr.nextInt(rlength);
            str[i] = regex.charAt(j);
            graphics.drawString(regex.charAt(j)+"",position,20);
            position += 20;
        }
        /*添加干扰线*/
        for(int i = 0; i< 10; i++){
            graphics.setColor(Color.BLACK);
            graphics.drawLine(myr.nextInt(110),myr.nextInt(25),myr.nextInt(110),myr.nextInt(25));
        }

        ImageIO.write(bi,"jpeg",resp.getOutputStream());
        System.out.println(str);
        session.setAttribute("check_node",new String(str));

    }
}
