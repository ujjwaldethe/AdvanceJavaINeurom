package JDBC;
import java.sql.*;

public class Test {
    public static void main(String[] args) {
        Connection conn = null;
        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/curd","root","9370");
            System.out.println("Driver Is Loaded");
        }
        catch ( SQLException e){
            e.printStackTrace();
        }
    }
}
