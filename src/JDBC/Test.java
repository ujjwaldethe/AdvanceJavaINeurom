package JDBC;
import java.sql.*;

public class Test {
    public static void main(String[] args) {
        Connection conn = null;
        Statement s = null;
        ResultSet rs = null;

        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/shirts_db","root","9370");
            System.out.println("Driver Is Loaded");
            String sqlSelect = " select * from shirts";
            System.out.println("The implementation class name is : "+conn.getClass().getName());

            System.out.println("");
            s = conn.createStatement();
            rs = s.executeQuery(sqlSelect);
            System.out.println("The implementation class name is : "+s.getClass().getName());
            System.out.println("The implementation class name is : "+rs.getClass().getName());
            while (rs.next())
            {
                System.out.println(rs.getInt(1)+"            "+rs.getString(2)+"            "+
                        rs.getString(3)+"          "+rs.getString(4)+"             "+
                        rs.getInt(5));
            }

        }
        catch ( SQLException e){
            e.printStackTrace();
        }
        finally {
            if (conn!=null)
            {
                try {
                    conn.close();
                    System.out.println("Connection Closed");
                }
                catch (Exception e)
                {
                    e.printStackTrace();
                }
            }
        }
    }
}
