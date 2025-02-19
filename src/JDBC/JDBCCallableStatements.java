package JDBC;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Types;
import java.util.Scanner;

public class JDBCCallableStatements {
    private  static  final String sPC1 = "{CALL P_GET_PRODUCT_DETAILS_BY_ID (?,?,?,?)}";
    private  static  final String sPC2 = "{CALL P_GET_PRODUCT_BY_NAME (?,?)}";
    public static void main(String[] args) {
        Connection conn = null;
        CallableStatement cs1 = null;
        CallableStatement cs2 = null;
        ResultSet rs = null;
        String region = null;
        Integer id = null;
        String name1 = null;
        String name2 = null;
        //CALL P_GET_PRODUCT_DETAILS_BY_ID(1, @name, @rate, @qnt);

        try
        {
            conn = JDBCStandardApp2.getJDBCConnection();
            if(conn!=null)
            {
                cs1 = conn.prepareCall(sPC1);
                cs2 =conn.prepareCall(sPC2);
            }
            //Setting Input Values
            if(cs1!=null)
            {
                System.out.println("Enter Id : ");
                id = new Scanner(System.in).nextInt();
                cs1.setInt(1,id);
            }
            if(cs2!=null)
            {
                System.out.println("Enter Name 1 : ");
                name1 = new Scanner(System.in).next();
                System.out.println("Enter Name 2 : ");
                name2 = new Scanner(System.in).next();

            }
            if(cs2!=null) {
                cs2.setString(1, name1);
                cs2.setString(2, name2);
            }
            ///Setting Output Values
            if(cs1!=null)
            {
                cs1.registerOutParameter(2, Types.VARCHAR);
                cs1.registerOutParameter(3,Types.INTEGER);
                cs1.registerOutParameter(4,Types.INTEGER);
            }
            if(cs1!=null)
            {
                cs1.execute();
            }
            if(cs2!=null)
            {
                cs2.execute();
                rs = cs2.getResultSet();
            }
            //Retrieve The Result
            if(cs1!=null)
            {
                System.out.println("Product Name : "+cs1.getString(2));
                System.out.println("Product Cost : "+cs1.getInt(3));
                System.out.println("Product Quantity : "+cs1.getInt(4));
            }
            if(rs!=null)
            {
                while(rs.next())
                {
                    System.out.println(rs.getString(1)+"\t"+rs.getString(2)+"\t"+rs.getInt(3)+"\t"+rs.getInt(4));
                }
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}