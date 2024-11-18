package JDBC;
import java.sql.*;

public class Test {
    public static void main(String[] args) {
        Connection conn = null;
        Statement s = null;

        ResultSet rs = null;
        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/curd","root","9370");
            System.out.println("Driver Is Loaded");
            String sqlSelect = " select * from student";
            s = conn.createStatement();
            rs = s.executeQuery(sqlSelect);
            while (rs.next())
            {
                System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+
                        rs.getString(3)+" "+rs.getInt(4)+" "+
                        rs.getString(5)+" "+rs.getString(6)+" "+rs.getInt(7));
            }

        }
        catch ( SQLException e){
            e.printStackTrace();
        }
    }
}
