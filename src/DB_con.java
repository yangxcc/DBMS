import java.sql.*;

public class DB_con {
    private Connection con;
    private PreparedStatement prst;
    private ResultSet rs;

    private String url = "jdbc:mysql://localhost:3306/db_oms";
    private String user = "root";
    private String password = "kyrie123";

    public DB_con() {
    }

    protected Connection getConn(){
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
    private void chaxun(String sql){
        try {
            prst = con.prepareStatement(sql);
            rs = prst.executeQuery();
            while(rs.next()){
                System.out.println("先输出第一个："+rs.getString(1));  //bug
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private void add(String sql){
        try {
            prst = con.prepareStatement(sql);
          //  prst.setString(1,"xxxx");   //bug
            prst.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private void delete(String sql){
        try {
            prst = con.prepareStatement(sql);
            prst.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private void update(String sql){
        try {
            prst = con.prepareStatement(sql);
            prst.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
