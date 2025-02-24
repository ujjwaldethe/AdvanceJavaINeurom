package ConnectionPoolingApp;

import com.mysql.cj.jdbc.MysqlConnectionPoolDataSource;

import javax.swing.plaf.nimbus.State;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class ConnectionPoolApp {
    public static void main(String[] args) throws Exception {
        //Create an Object Of A Class Which Implements javax.sql.Datasoure()
        MysqlConnectionPoolDataSource dataSource = new MysqlConnectionPoolDataSource();
        dataSource.setURL("jdbc:mysql:///test");
        dataSource.setUser("root");
        dataSource.setPassword("9370");

        Connection conn = dataSource.getConnection();
        Statement st = conn.createStatement();
        ResultSet rs = st.executeQuery("Select * from students");
        while (rs.next())
        {
            System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getInt(3)+"\t"+rs.getString(4));
        }
        conn.close();

    }
}
