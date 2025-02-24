package ConnectionPoolingApp;
import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

import java.sql.*;
public class HikaricpConnetionPooling {
    public static void main(String[] args) {

        String configFile = "C:\\Users\\krish\\IdeaProjects\\AdvanceJavaINeurom\\src\\ConnectionPoolingApp\\db.properties";
        HikariConfig config = new HikariConfig(configFile);

        try(HikariDataSource dataSource = new HikariDataSource(config)){
            Connection conn = dataSource.getConnection();
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("select * from students");
            while(rs.next())
            {
                System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getInt(3)+"\t"+rs.getString(4));
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
}
