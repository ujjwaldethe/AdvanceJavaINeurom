package RowSet;

import javax.sql.rowset.*;
import java.sql.SQLException;

public class RowSetSelect {
    public static void main(String[] args) throws SQLException {
//        RowSetFactory rsf = RowSetProvider.newFactory();
//        JdbcRowSet jrs = rsf.createJdbcRowSet();
//        CachedRowSet crs = rsf.createCachedRowSet();
//        WebRowSet wrs = rsf.createWebRowSet();
//        JoinRowSet jrrs = rsf.createJoinRowSet();
//        FilteredRowSet frs = rsf.createFilteredRowSet();
//        System.out.println(rsf.getClass().getName());
//        System.out.println(jrs.getClass().getName());
//        System.out.println(crs.getClass().getName());
//        System.out.println(wrs.getClass().getName());
//        System.out.println(jrrs.getClass().getName());
//        System.out.println(frs.getClass().getName());
        RowSetFactory rsf = RowSetProvider.newFactory();
        JdbcRowSet jrs = rsf.createJdbcRowSet(); //Same As ResultSet but it is scrollable and updatable

        //Setting url,username,password
        jrs.setUrl("jdbc:mysql:///test");
        jrs.setUsername("root");
        jrs.setPassword("9370");

        //setting a command for execution
        jrs.setCommand("select * from students");
        jrs.execute();
        System.out.println("Retrieving The Records In Forward Direction");
        System.out.println("Id\tName\tAge\tAddress");
        while (jrs.next())
        {
            System.out.println(jrs.getInt(1)+"\t"+jrs.getString(2)+"\t"+jrs.getInt(3)+"\t"+jrs.getString(4));
        }
        jrs.absolute(2);
        System.out.println(jrs.getInt(1)+"\t"+jrs.getString(2)+"\t"+jrs.getInt(3)+"\t"+jrs.getString(4));

    }
}
