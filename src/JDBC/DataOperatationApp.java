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
        PreparedStatement pstmt1 = null;
        PreparedStatement pstmt2 = null;
        ResultSet rs = null;
        Scanner sc = null;
        String name =null ;
        String dob = null;
        String dom = null;
        String country = null;
        int id = 0;
        java.sql.Date sqlDob = null;
        java.sql.Date sqlDom = null;

        conn = JDBCStandardApp2.getJDBCConnection();
        String sqlInsertQuery="insert into dataop (name,dob,dom,country)values(?,?,?,?)";
        String sqlInsertQuery1="delete from dataop where id=1";
        String sqlInsertQuery2="select * from dataop";
        if(conn!=null)
        {

            pstmt = conn.prepareStatement(sqlInsertQuery);
            pstmt1 = conn.prepareStatement(sqlInsertQuery1);
            pstmt2 = conn.prepareStatement(sqlInsertQuery2);
        }
        if(pstmt!=null)
        {
            sc = new Scanner(System.in);
            if(sc!=null)
            {
                System.out.println("Enter Username : ");
                name = sc.next();
                System.out.println("Enter DOB (MM-dd-yyyy):");
                dob = sc.next();
                System.out.println("Enter DOM (yyyy-MM-dd) : ");
                dom = sc.next();
               // System.out.println("Enter id to delete : ");
               // id = sc.nextInt();
                System.out.println("Enter Country : ");
                country = sc.next();
            }
            if(dob!=null) {
//                Conversion Of String To SqlDate
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
            pstmt.setString(4,country);
           // pstmt1.setInt(1,id);
            int rowAffected = pstmt.executeUpdate();
            //int rowAffected1 = pstmt1.executeUpdate();
            System.out.println("Row Affected : "+rowAffected);
            //System.out.println("Row Affected : "+rowAffected1   );


            rs =pstmt2.executeQuery();
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
