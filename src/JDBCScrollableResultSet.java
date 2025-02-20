import JDBC.JDBCStandardApp2;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class JDBCScrollableResultSet {
    public static void main(String[] args) {
        Connection conn = null;
        Statement st = null;
        Scanner sc = null;
        ResultSet rs = null;
        try {
            conn = JDBCStandardApp2.getJDBCConnection();
            if(conn!=null)
            {
                //Expecting ResultSet To Be Scrolled And Updatable.
                st = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);

            }
            String sqlQuery = "select id,name,age,team from players";
            if(st!=null)
            {
                rs = st.executeQuery(sqlQuery);
            }
            if(rs!=null)
            {
                System.out.println("Moving Cursor In Forward Direction");
                System.out.println("ID\tNAME\tAGE\tTEAM");
                while (rs.next())
                {
                    System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getInt(3)+"\t"+rs.getString(4));
                }

                System.out.println("Moving Cursor In Backward Direction");
                System.out.println("ID\tNAME\tAGE\tTEAM");
                while (rs.previous())
                {
                    System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getInt(3)+"\t"+rs.getString(4));
                }
                System.out.println();
                rs.first();//Fetching first record
                System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getInt(3)+"\t"+rs.getString(4));
                rs.last();//Fetching last record
                System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getInt(3)+"\t"+rs.getString(4));
                rs.absolute(3); //from begining of row set to 3
                System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getInt(3)+"\t"+rs.getString(4));
                rs.relative(3);//from current position move downwards
                System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getInt(3)+"\t"+rs.getString(4));
                rs.absolute(-4);//from begining to move upwards
                System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getInt(3)+"\t"+rs.getString(4));
                rs.relative(-1);//from current position move upwards
                System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getInt(3)+"\t"+rs.getString(4));

            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
