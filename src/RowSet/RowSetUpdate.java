package RowSet;

import javax.sql.rowset.JdbcRowSet;
import javax.sql.rowset.RowSetFactory;
import javax.sql.rowset.RowSetProvider;
import java.sql.SQLException;
import java.util.Scanner;

public class RowSetUpdate {
    public static void main(String[] args) throws SQLException {
        RowSetFactory rsf = RowSetProvider.newFactory();
        JdbcRowSet jrs = rsf.createJdbcRowSet(); //Same As ResultSet but it is scrollable and updatable

        //Setting url,username,password
        jrs.setUrl("jdbc:mysql:///test");
        jrs.setUsername("root");
        jrs.setPassword("9370");

        //setting a command for execution
        jrs.setCommand("select * from students");
        jrs.execute();
        while (jrs.next())
        {
            int actualAge = jrs.getInt(3);
            if(actualAge>22)
            {
                actualAge-=5;
                jrs.updateInt(3,actualAge);
                jrs.updateRow();
            }
        }
        jrs.beforeFirst();
        System.out.println("Retrieving The Records In Forward Direction");
        System.out.println("Id\tName\tAge\tAddress");
        while (jrs.next())
        {
            System.out.println(jrs.getInt(1)+"\t"+jrs.getString(2)+"\t"+jrs.getInt(3)+"\t"+jrs.getString(4));
        }

    }
}
