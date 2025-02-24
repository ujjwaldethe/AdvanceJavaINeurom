package JdbcWithoutConnection;

import JDBC.JDBCStandardApp2;

import javax.sql.rowset.CachedRowSet;
import javax.sql.rowset.RowSetFactory;
import javax.sql.rowset.RowSetProvider;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class InsertApp {
    public static void main(String[] args) throws Exception {

        Connection conn = JDBCStandardApp2.getJDBCConnection();
        Statement st = conn.createStatement();
        ResultSet rs = st.executeQuery("Select * from students");
        RowSetFactory rsf = RowSetProvider.newFactory();
        CachedRowSet crs = rsf.createCachedRowSet(); //Disconnected RowSet

        crs.populate(rs);
       // conn.close();//Operation Not Allowed After ResultSet Closed
        System.out.println("Retrieving Records");
        while (crs.next())
        {
            System.out.println(crs.getInt(1)+"\t"+crs.getString(2)+"\t"+crs.getInt(3)+"\t"+crs.getString(4));
        }
        crs.moveToInsertRow();
        crs.updateInt(1,20);
        crs.updateString(2,"Ujjwal");
        crs.updateInt(3,21);
        crs.updateString(4,"CSB");
        crs.insertRow();
        crs.acceptChanges();
        System.out.println("Retrieving Records");

    }
}
