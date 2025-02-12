package JDBC;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class UpdatTest {
    public static void main(String[] args) throws Exception{
        String url = "jdbc:mysql://localhost:3306/curd";
        String user = "root";
        String password = "9370";
        int rowAffected;
        Connection conn =  DriverManager.getConnection(url,user,password);
        Statement s = conn.createStatement();
        //String sql = "delete from student where id = 6";
        //rowAffected = s.executeUpdate(sql);
        //System.out.println("No Of Rows Affected Is : "+rowAffected);
        String sql1 = "update student set firstname='Pratik' where id=5";
        rowAffected = s.executeUpdate(sql1);
        System.out.println("No Of Rows Affected Is : "+rowAffected);
        s.close();
        conn.close();
        System.out.println("Closing Resources");
    }
}
