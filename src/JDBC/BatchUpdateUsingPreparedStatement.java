package JDBC;

import javax.sound.midi.Soundbank;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class BatchUpdateUsingPreparedStatement {
    public static void main(String[] args) throws Exception {
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        Scanner sc = null;
        String name = null;
        Integer age = null;
        String address = null;
        String option = null;
        conn = JDBCStandardApp2.getJDBCConnection();
        String sqlInsertQuery="insert into employees1 (`name`,`age`,`address`) values (?,?,?)";
        if(conn!=null)
        {
            pstmt = conn.prepareStatement(sqlInsertQuery);
        }
        if(pstmt!=null)
        {
            sc = new Scanner(System.in);

            while (true)
            {
                System.out.println("Enter The Name : ");
                name = sc.next();
                System.out.println("Enter Age : ");
                age = sc.nextInt();
                System.out.println("Enter Address : ");
                address = sc.next();
                pstmt.setString(1,name);
                pstmt.setInt(2,age);
                pstmt.setString(3,address);

                //one batch got created and query got added
                pstmt.addBatch();
                System.out.println("Do You Want To Insert One More Record: (Yes / No ) : ");
                option = sc.next();
                if(option.equalsIgnoreCase("No"))
                {
                    break;
                }
            }
        }
        //outside loop body
        pstmt.executeBatch();
    }
}
