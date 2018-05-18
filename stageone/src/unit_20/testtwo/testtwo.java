package unit_20.testtwo;

import unit_20.testone.Conn;

import java.sql.*;

public class testtwo {
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
            cc = DriverManager.getConnection("jdbc:mysql://localhost:3306/unit?useUnicode=true&characterEncoding=utf8","root","123456");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return cc;
    }
    public static void main(String[] args){
        Conn c = new Conn();
        con = c.getConnection();
        try{
            sql = con.prepareStatement("select * from tb_stu");
            res = ((PreparedStatement) sql).executeQuery();
            sql = con.prepareStatement("insert into tb_stu values (?,?,?,?)");
            ((PreparedStatement) sql).setString(1,"01d05");
            ((PreparedStatement) sql).setString(2,"李静");
            ((PreparedStatement) sql).setString(3,"女");
            ((PreparedStatement) sql).setString(4,"1999-10-20");
            ((PreparedStatement) sql).executeUpdate();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
