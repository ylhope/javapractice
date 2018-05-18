package unit_20.testone;
import java.sql.*;
public class Conn {
    Connection cc;
    static Connection con;
    static Statement sql;
    static ResultSet res;
    public Connection getConnection(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        try {
            cc = DriverManager.getConnection("jdbc:mysql://localhost/unit?useUnicode=true&characterEncoding=utf8","root","123456");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return cc;
    }
    public static void main(String[] args){
        Conn c = new Conn();
        con = c.getConnection();
        try{
            sql = con.createStatement();
            res = sql.executeQuery("select * from tb_emp where department = '销售部'");
            while (res.next()){
                String id = res.getString(1);
                String name = res.getString(2);
                System.out.println( id + ":" + name);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }

}
