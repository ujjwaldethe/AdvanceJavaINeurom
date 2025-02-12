package JDBC;

import java.sql.*;
public class InsertTest {
    public static void main(String[] args) throws Exception {

        String url = "jdbc:mysql://localhost:3306/curd";
        String user = "root";
        String password = "9370";
        Connection conn =  DriverManager.getConnection(url,user,password);
        Statement s = conn.createStatement();
        String sql = "insert into student (`firstname`,`lastname`,`age`,`city`,`country`,`number`) values ('Sidharth','Shisath',21,'Nashik','India',1254832144)";
        int rowAffected = s.executeUpdate(sql);
        System.out.println("No Of Rows Affected Is : "+rowAffected);
        s.close();
        conn.close();
        System.out.println("Closing Resources");
    }
}
