package JDBCTransactionsApp;

import JDBC.JDBCStandardApp2;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Savepoint;
import java.sql.Statement;
import java.util.Scanner;

public class TransactionApp {
    public static void main(String[] args) {
        Connection conn = null;
        Statement st = null;
        Scanner sc = null;
        ResultSet rs = null;
        try{
            conn = JDBCStandardApp2.getJDBCConnection();
            System.out.println("Transaction Begins");

            if(conn!=null)
                st = conn.createStatement();
            conn.setAutoCommit(false);

            st.executeUpdate("insert into politicians (`name`,`party`) values ('MODI','BJP')");
            st.executeUpdate("insert into politicians (`name`,`party`) values ('KCR','TRS')");

            Savepoint sp = conn.setSavepoint();
            st.executeUpdate("insert into politicians (`name`,`party`) values ('SIDDU','BJP')");
            System.out.println("Something Went Wrong");
            conn.rollback(sp);
            System.out.println("Operations Are Rolled Back To Savepoint");
            conn.commit();
            System.out.println("Transactions Done");
//            if(conn!=null)
//            {
//                st = conn.createStatement();
//            }
//            if(st!=null)
//            {
//               rs= st.executeQuery("select name,balance from accounts");
//            }
//            if(rs!=null)
//            {
//                while(rs.next())
//                {
//                    System.out.println("Name : "+rs.getString(1)+" Balance : "+rs.getInt(2));
//                }
//            }
//
//            //Transaction Begins
//            System.out.println("Transaction Begins");
//            conn.setAutoCommit(false);
//
//            //Prepare The Operation As A Single Unit
//            st.executeUpdate("update accounts set balance = balance-5000 where name = 'ujjwal'");
//            st.executeUpdate("update accounts set balance = balance+5000 where name = 'pratik'");
//            System.out.println("Yes / No : ");
//            sc = new Scanner(System.in);
//            String option = sc.next();
//            if(option.equalsIgnoreCase("yes"))
//            {
//                conn.commit();
//            }
//            else
//            {
//                conn.rollback();
//            }
//            System.out.println("data after a transaction");
//            ResultSet rs1 = st.executeQuery("select * from accounts");
//            if(rs1!=null)
//            {
//                while(rs1.next())
//                {
//                    System.out.println("Name : "+rs1.getString(1)+" Balance : "+rs1.getInt(2));
//                }
//            }
        }catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
