package JDBC;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class DynamicInput {
    public static void main(String[] args) throws SQLException {


        String url = "jdbc:mysql://localhost:3306/curd";
        String user = "root";
        String password = "9370";

        Connection conn =  DriverManager.getConnection(url,user,password);

        int rowAffected;
        String sql;
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
        // First Approach
        // sql ="insert into student (`firstname`,`lastname`,`age`,`city`,`country`,`number`) values ('"+fname+"','"+lname+"',"+age+",'"+city+"','"+country+"',"+no+")";

        //Second Approach
        //fname = "'"+fname+"'";
        // lname = "'"+lname+"'";
        // city = "'"+city+"'";
        // country = "'"+country+"'";
        // sql = "insert into student(`firstname`,`lastname`,`age`,`city`,`country`,`Number`) values ("+fname+","+lname+","+age+","+city+","+country+","+no+")";

        //Third Approach
        sql = String.format(
                "insert into student(`firstname`,`lastname`,`age`,`city`,`country`,`Number`) values ('%s','%s',%d,'%s','%s',%d)",
                fname, lname, age, city, country, no);

        Statement s = conn.createStatement();

        rowAffected = s.executeUpdate(sql);

        s.close();
        conn.close();
        System.out.println("Closing Resources");
    }
}
