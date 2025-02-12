package JDBC;
import java.sql.*;//FROM JDBC 4.X AUTO-LOADING FEATURES IS ENABLED
public class SelectTest {
    public static void main(String[] args) throws Exception
    {

        String url = "jdbc:mysql://localhost:3306/curd";
        String user = "root";
        String password = "9370";
       Connection conn =  DriverManager.getConnection(url,user,password);
       Statement s = conn.createStatement();

       String sql = "Select * from student";
       String sql2 = "Desc student";
       ResultSet rs = s.executeQuery(sql);
        System.out.println("SID\t\tFIRSTNAME\t\tLASTNAME\t\tAGE\t\tCITY\t\tCOUNTRY\t\tNUMBER");
        while(rs.next())
        {
            System.out.println(rs.getInt(1)+"\t\t"+
                    rs.getString(2)+"\t\t\t"+
                    rs.getString(3)+"\t\t\t"
                    +rs.getInt(4)+"\t\t"+
                    rs.getString(5)+"\t\t\t"+
                    rs.getString(6)+"  \t\t"+
                    rs.getInt(7));
        }
        ResultSet rs2 = s.executeQuery(sql2);
        while(rs2.next())
        {
            String field = rs2.getString("Field");
            String type = rs2.getString("Type");
            System.out.println("Field: " + field + ", Type: " + type);
        }


    }
}
