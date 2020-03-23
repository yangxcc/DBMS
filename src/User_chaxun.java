import com.sun.xml.internal.ws.util.StringUtils;
import domain.User;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class User_chaxun extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setCharacterEncoding("GBK");
        String xxx = "xxx";
        req.setAttribute("lizi",xxx);

        String user_name = req.getParameter("usercx");
        String rol = req.getParameter("role");

        PreparedStatement prst = null;
        ResultSet rs = null;
        User user = null;
        ArrayList<User> userlist = new ArrayList<User>();

        String sql1 = "select * from user where name = ?";
        String sql2 = "select * from user where role = ?";
        String sql3 = "select * from user where name =? and role =?";
        String sql4 = "select * from user";

        Connection con = new DB_con().getConn();

        try (PrintWriter out = resp.getWriter()) {
//            out.println("<table border = 1>");
            if (user_name.length() >0 && rol.length() ==0){
                 prst = con.prepareStatement(sql1);
                prst.setString(1,user_name);
                rs = prst.executeQuery();

               // resp.sendRedirect("main.jsp");
                while (rs.next()){
                    user = new User();
                    user.setName(rs.getString("name"));
                    user.setPassword(rs.getString("password"));
                    user.setRole(rs.getString("role"));
                    userlist.add(user);
                    System.out.println(rs.getString(1));
                }
            }
            else if (rol.length() > 0 && user_name.length() ==0){
                 prst = con.prepareStatement(sql2);
                prst.setString(1,rol);
                 rs = prst.executeQuery();
                while (rs.next()){
                    user = new User();
                    user.setName(rs.getString("name"));
                    user.setPassword(rs.getString("password"));
                    user.setRole(rs.getString("role"));
                    userlist.add(user);
                    System.out.println(rs.getString(1));
                }
            }
            else if (user_name.length() > 0 && rol.length() > 0){
                 prst = con.prepareStatement(sql3);
                prst.setString(1,user_name);
                prst.setString(2,rol);
                 rs = prst.executeQuery();
               // resp.sendRedirect("main.jsp");
                while (rs.next()){
                    user = new User();
                    user.setName(rs.getString("name"));
                    user.setPassword(rs.getString("password"));
                    user.setRole(rs.getString("role"));
                    userlist.add(user);
                    System.out.println(rs.getString(1));
                }
            }
            else{
                 prst = con.prepareStatement(sql4);
                 rs = prst.executeQuery();
                while (rs.next()){
                    user = new User();
                    user.setName(rs.getString("name"));
                    user.setPassword(rs.getString("password"));
                    user.setRole(rs.getString("role"));
                    userlist.add(user);
                    System.out.println(rs.getString(1));
                }
            }
          //  req.setAttribute("value",rs);
            req.setAttribute("userlist",userlist);
            ArrayList aa = (ArrayList) req.getAttribute("userlist");
            for (int i = 0;i < aa.size();i++){
                User uu = (User) aa.get(i);
                System.out.println(uu.getPassword());
            }
            req.getRequestDispatcher("main.jsp").forward(req,resp);


        } catch (SQLException e) {
            e.printStackTrace();
        }
        }
}
