package ImageInsertIntoDatabase;

import JDBC.JDBCStandardApp2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class COLBIMG {
    public static void main(String[] args) throws Exception {
            Connection conn = null;
            PreparedStatement pstmt = null;
            String name = null;
            String pdfLoc = null;
            Scanner sc = null;

            conn = JDBCStandardApp2.getJDBCConnection();
            String sql = "insert into imgio2 (`name`,`history`) values(?,?)";
            if(conn!=null)
            {
                pstmt = conn.prepareStatement(sql);
            }
            if(pstmt!=null)
            {
                sc= new Scanner(System.in);
                if(sc!=null)
                {
                    System.out.println("Enter Name : ");
                    name = sc.next();
                    System.out.println("Enter Pdf Location : ");
                    pdfLoc = sc.next();
                }
                pstmt.setString(1,name);
                pstmt.setCharacterStream(2,new FileReader(new File(pdfLoc)));

                int rowAffected = pstmt.executeUpdate();
                System.out.println("Rows Affected : "+rowAffected);
            }
        }
}

