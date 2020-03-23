import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class index_login extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setCharacterEncoding("UTF-8");
        HttpSession session = req.getSession();

        String user_name = req.getParameter("user");
        String password = req.getParameter("pwd");
        String i_code = req.getParameter("image");
        String session_code = (String) session.getAttribute("check_node");

        Connection con = (new DB_con()).getConn();

        String sql = "select * from user where name =? and password=?";
        try(PrintWriter out = resp.getWriter()) {
            PreparedStatement prst = con.prepareStatement(sql);
            prst.setString(1,user_name);
            prst.setString(2,password);
            ResultSet rs = prst.executeQuery();
            if (rs.next() && i_code.equals(session_code)){
                String user_role = rs.getString(3);
                session.setAttribute("user_name",user_name);
                session.setAttribute("user_role",user_role);
                resp.sendRedirect("main.jsp");    //到时候在这里需要if语句，分出不同角色的不同界面
            }else {
                out.print("<script language='javascript' charset='UTF-8'>alert('Error occur between name and password!');window.location.href='index.jsp';</script>");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }



    }
}
