package RowSet;

import javax.sql.rowset.JdbcRowSet;
import javax.sql.rowset.RowSetFactory;
import javax.sql.rowset.RowSetProvider;
import java.sql.SQLException;
import java.util.Scanner;

public class RowSetInsert {
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
        System.out.println("Retrieving The Records In Forward Direction");
        System.out.println("Id\tName\tAge\tAddress");
        while (jrs.next())
        {
            System.out.println(jrs.getInt(1)+"\t"+jrs.getString(2)+"\t"+jrs.getInt(3)+"\t"+jrs.getString(4));
        }
        Scanner sc = new Scanner(System.in);
        jrs.moveToInsertRow();
        while (true)
        {
            System.out.println("Enter Name : ");
            String name = sc.next();
            System.out.println("Enter Age : ");
            Integer age = sc.nextInt();
            System.out.println("Enter Address : ");
            String addrs = sc.next();

            jrs.updateString(2,name);
            jrs.updateInt(3,age);
            jrs.updateString(4,addrs);

            jrs.insertRow();
            System.out.println("want to continue : ");
            String opt = sc.next();
            if(opt.equalsIgnoreCase("no"))
            {
                break;
            }
        }
    }
}
