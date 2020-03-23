package text;

import java.sql.*;

public class DB_text {
    public Connection con;
    private PreparedStatement prst;
    private ResultSet rs;

    private String url = "jdbc:mysql://localhost:3306/db_oms";
    private String user = "root";
    private String password = "kyrie123";

    public Connection getConn(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("数据库驱动加载成功");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        try {
            con = DriverManager.getConnection(url,user,password);
            System.out.println("数据库连接成功");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return con;
    }

    public ResultSet chaxun(String sql){
        try {
            prst = con.prepareStatement(sql);
            rs = prst.executeQuery();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return rs;   //小bug，如果查询未成功，则rs是空指
    }

    public static void main(String args[]) throws SQLException {
        DB_text db = new DB_text();
        db.getConn();
        String sql = "select * from user where name = 'xu'";
        ResultSet rss = db.chaxun(sql);
        if (rss == null){
            System.out.print("sss");
        }
        while(rss.next()){
            System.out.print(rss.getString(1));
        }
    }
}
