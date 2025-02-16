package ImageInsertIntoDatabase;
import JDBC.*;

import java.io.File;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class ImageIo {
    public static void main(String[] args) throws Exception {
        Connection conn = null;
        PreparedStatement pstmt = null;
        String name = null;
        String imageLoc = null;
        Scanner sc = null;

        conn = JDBCStandardApp2.getJDBCConnection();
        String sql = "insert into ImageIo (`name`,`image`) values(?,?)";
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
                System.out.println("Enter Image Location : ");
                imageLoc = sc.next();
            }

            pstmt.setString(1,name);
            pstmt.setBinaryStream(2,new FileInputStream(new File(imageLoc)));

            int rowAffected = pstmt.executeUpdate();
            System.out.println("Rows Affected : "+rowAffected);
        }
    }
}
