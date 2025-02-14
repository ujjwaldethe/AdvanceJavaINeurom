package JDBC;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class DataRetrievalApp {
    public static void main(String[] args) {
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        String region = null;
        try {
            conn = JDBCStandardApp2.getJDBCConnection();
            String str = "select id ,name,dob,dom ,country from dataop where id=?";
            if(conn!=null)
            {
                ps = conn.prepareStatement(str);
            }
            if(ps!=null)
            {
                System.out.println("Enter Id : ");
                int id = new Scanner(System.in).nextInt();
                ps.setInt(1,id);

                rs = ps.executeQuery();

            }
            if(rs!=null)
            {

                if(rs.next())
                {
                    region=rs.getString(5);

                    if(region.equals("IND")) {
                        System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + new SimpleDateFormat("dd/MM/yyyy").format(rs.getDate(3)) + " " + new SimpleDateFormat("dd/MM/yyyy").format(rs.getDate(4))+" "+ rs.getString(5));
                    }
                    else {
                        System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + new SimpleDateFormat("yyyy/MM/dd").format(rs.getDate(3)) + " " + new SimpleDateFormat("yyyy/MM/dd").format(rs.getDate(4))+" "+ rs.getString(5)
);
                    }
                }
                else
                {
                    System.out.println("Record Not Available for the given id.");
                }
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

    }
}
