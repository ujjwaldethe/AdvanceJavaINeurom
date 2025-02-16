package JDBC;

import java.io.FileInputStream;
import java.sql.*;
import java.util.Properties;

public class JDBCStandardApp2 {
    public static Connection getJDBCConnection() throws Exception {
        FileInputStream f = new FileInputStream("C:\\Users\\krish\\IdeaProjects\\AdvanceJavaINeurom\\src\\JDBC\\appplication2.properties");
        Properties properties = new Properties();
        properties.load(f);
        String url = properties.getProperty("url");
        String user = properties.getProperty("user");
        String password = properties.getProperty("password");
        Connection conn =  DriverManager.getConnection(url,user,password);
        System.out.println("Connection Established Success");
        return conn;
    }
    public static void cleanUp(Connection conn, PreparedStatement stmt , ResultSet rs) throws SQLException {
        if(conn!=null)
            conn.close();
        if(stmt!=null)
            stmt.close();
        if(rs!=null)
        {
            rs.close();
        }
    }
}
