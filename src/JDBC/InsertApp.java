package JDBC;

import java.sql.*;
import java.util.Scanner;

public class InsertApp {
    public static void main(String[] args) throws Exception {
      Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;
        try {

            conn = JDBCStandardApp.getJDBCConnection();
            if(conn!=null)
            {
                stmt = conn.createStatement();
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
            rs.close();
            stmt.close();
            conn.close();

            System.out.println("Closing Resources");
        }




    }
}
