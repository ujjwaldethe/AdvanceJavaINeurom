package JDBC;

import java.sql.*;
import java.util.Scanner;

public class PreparedStateApp {
    public static void main(String[] args) throws Exception{
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        String sql;
        try {
            conn = JDBCStandardApp.getJDBCConnection();
            sql = "insert into student(`firstname`,`lastname`,`age`,`city`,`country`,`Number`) values (?,?,?,?,?,?)";

            if(conn!=null) {
                stmt = conn.prepareStatement(sql);
            }
            int rowAffected;
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter First Name : ");
            String fname = sc.next();

            System.out.println("Enter Last Name : ");
            String lname = sc.next();

            System.out.println("Enter Age : ");
            int age = sc.nextInt();

            System.out.println("Enter City : ");
            String city = sc.next();

            System.out.println("Enter Country : ");
            String country = sc.next();

            System.out.println("Enter Number : ");
            Long no = sc.nextLong();

            if(stmt!=null)
            {
                stmt.setString(1,fname);
                stmt.setString(2,lname);
                stmt.setInt(3,age);
                stmt.setString(4,city);
                stmt.setString(5,country);
                stmt.setLong(6,no);
                rowAffected = stmt.executeUpdate();
            }
            if(stmt!=null)
            {
                rs = stmt.executeQuery("Select * from student");
            }
            if(rs!=null)
            {
                while(rs.next()) 
                {
                    System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3)+"\t"+rs.getInt(4)+"\t"+rs.getString(5)+"\t"+rs.getString(6)+"\t"+rs.getLong(7));
                }
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        finally {
            //rs.close();
            stmt.close();
            conn.close();

            System.out.println("Closing Resources");
        }



    }
}
