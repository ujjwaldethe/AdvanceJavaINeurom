package ImageInsertIntoDatabase;

import JDBC.JDBCStandardApp2;
import org.apache.commons.io.IOUtils;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class RetrieveImage {
    public static void main(String[] args) {
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        FileOutputStream fos = null;
        String sql =null;
        int id = 0;
        String name = null;
        InputStream is = null;
        try
        {
            conn = JDBCStandardApp2.getJDBCConnection();
            sql ="Select * from ImageIo where id=?";
            if(conn!=null)
            {
                ps = conn.prepareStatement(sql);
            }
            if(ps!=null)
            {
                System.out.println("Enter Id : ");
                ps.setInt(1,new Scanner(System.in).nextInt());
                rs =  ps.executeQuery();
            }
            if(rs!=null)
            {
                if(rs.next())
                {
                    id = rs.getInt(1);
                    name = rs.getString(2);
                    is = rs.getBinaryStream(3);
                    System.out.println(" Id : "+id+"\tName : "+name);
                    fos = new FileOutputStream(new File("C:\\Users\\krish\\IdeaProjects\\AdvanceJavaINeurom\\src\\ImageInsertIntoDatabase\\copied.jpg"));
                    // Performance Is Low
                    //                    int i = is.read();
//                    while(i!=-1)
//                    {
//                        fos.write(i);
//                        i = is.read();
//                    }
                    //Performance Is High
//                    byte[] b = new byte[1024];
//                    while (is.read(b)>0)
//                    {
//                        fos.write(b);
//                    }

                       //Copying the data from is to fos
                    IOUtils.copy(is,fos);
                }
                else {
                    System.out.println("Records Not Available For Following Id ");
                }
            }
            JDBCStandardApp2.cleanUp(conn,ps,rs);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        finally {
            System.out.println("Connection Closed");
        }
    }
}
