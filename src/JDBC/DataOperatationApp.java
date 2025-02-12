package JDBC;

import java.io.IOException;
import java.io.PipedReader;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class DataOperatationApp {
    public static void main(String[] args) throws Exception {
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        Scanner sc = null;
        String name =null ;
        String dob = null;
        String dom = null;
        java.sql.Date sqlDob = null;
        java.sql.Date sqlDom = null;

        conn = JDBCStandardApp2.getJDBCConnection();
        if(conn!=null)
        {
            String sqlInsertQuery="insert into dataop (name,dob,dom)values(?,?,?)";
            pstmt = conn.prepareStatement(sqlInsertQuery);
        }
        if(pstmt!=null)
        {
            sc = new Scanner(System.in);
            if(sc!=null)
            {
                System.out.println("Enter Username : ");
                name = sc.next();
                System.out.println("Enter DOB (mm-dd-yyyy):");
                dob = sc.next();
                System.out.println("Enter DOM (yyyy-mm-dd) : ");
                dom = sc.next();
            }
            if(dob!=null) {
                //Conversion Of String To SqlDate
                SimpleDateFormat sdf = new SimpleDateFormat("MM-dd-yyyy");
                java.util.Date udate = sdf.parse(dob);
                long value = udate.getTime();
                sqlDob = new java.sql.Date(value);
                System.out.println(sqlDob);
            }
            if(dom!=null)
            {
                sqlDom = java.sql.Date.valueOf(dom);
                System.out.println(sqlDom);
            }
            pstmt.setString(1,name);
            pstmt.setDate(2,sqlDob);
            pstmt.setDate(3,sqlDom);
            int rowAffected = pstmt.executeUpdate();
            System.out.println("Row Affected : "+rowAffected);
            rs =pstmt.executeQuery("select * from dataop");
        }

        if(rs!=null)
        {
            while(rs.next())
            {
                System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getDate(3)+"\t"+rs.getDate(4));
            }
        }
        JDBCStandardApp2.cleanUp(conn,pstmt,rs);

   }
}
