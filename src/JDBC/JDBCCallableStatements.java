package JDBC;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Types;
import java.util.Scanner;

public class JDBCCallableStatements {
    private  static  final String sPC = "{CALL P_GET_PRODUCT_DETAILS_BY_ID (?,?,?,?)}";
    public static void main(String[] args) {
        Connection conn = null;
        CallableStatement cs = null;
        ResultSet rs = null;
        String region = null;
        Integer id = null;
        //CALL P_GET_PRODUCT_DETAILS_BY_ID(1, @name, @rate, @qnt);

        try
        {
            conn = JDBCStandardApp2.getJDBCConnection();
            if(conn!=null)
            {
                cs = conn.prepareCall(sPC);
            }
            //Setting Input Values
            if(cs!=null)
            {
                System.out.println("Enter Id : ");
                id = new Scanner(System.in).nextInt();
                cs.setInt(1,id);
            }
            ///Setting Output Values
            if(cs!=null)
            {
                cs.registerOutParameter(2, Types.VARCHAR);
                cs.registerOutParameter(3,Types.INTEGER);
                cs.registerOutParameter(4,Types.INTEGER);
            }
            if(cs!=null)
            {
                cs.execute();
            }
            //Retrieve The Result
            if(cs!=null)
            {
                System.out.println("Product Name : "+cs.getString(2));
                System.out.println("Product Cost : "+cs.getInt(3));
                System.out.println("Product Quantity : "+cs.getInt(4));
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
