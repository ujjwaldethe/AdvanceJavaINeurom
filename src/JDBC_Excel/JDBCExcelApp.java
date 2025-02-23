package JDBC_Excel;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class JDBCExcelApp {
    private static final String EXCEL_FILE = "select * from data.student";
    public static void main(String[] args) {
        String url = "jdbc:Excel:///C:\\Users\\krish\\IdeaProjects\\AdvanceJavaINeurom\\src\\JDBC_Excel";

        try(Connection conn = DriverManager.getConnection(url)){
            try (PreparedStatement psmt  = conn.prepareStatement(EXCEL_FILE)){
                try(ResultSet rs = psmt.executeQuery()){
                    while (rs.next())
                    {
                        System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3));
                    }
                }

            }
        }catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
