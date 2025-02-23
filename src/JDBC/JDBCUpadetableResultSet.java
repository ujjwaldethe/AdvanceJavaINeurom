package JDBC;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

 class JDBCUpdetableResultSet {
    public static void main(String[] args) {
        // Declaring database resources
        Connection conn = null;
        Statement st = null;
        Scanner sc = null;
        ResultSet rs = null;

        try {
            // Establishing a database connection
            conn = JDBCStandardApp2.getJDBCConnection();
            if (conn != null) {
                // Creating a statement that allows scrolling and is updatable
                st = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
            }

            // SQL query to select all records from the 'players' table
            String sqlQuery = "SELECT id, name, age, team FROM players";
            if (st != null) {
                // Executing the query and storing the result in ResultSet
                rs = st.executeQuery(sqlQuery);
            }

            if (rs != null) {
                // Displaying records before updating
                System.out.println("Records before updation");
                System.out.println("\tID\tName\tAge\tTeam");

                // Iterating through the result set and printing the records
                while (rs.next()) {
                    System.out.println("\t" + rs.getInt(1) + "\t" + rs.getString(2) + "\t" + rs.getInt(3) + "\t" + rs.getString(4));
                }

                System.out.println();

                // Pausing execution to allow manual database updates
                System.in.read(); // Wait for user input before proceeding
                System.out.println("Application Is In Pausing State, Please Update Database");

                // Waiting for another user input before proceeding further
                System.in.read();

                System.out.println("Records After Updation");

                // Moving the cursor back to the first row
                rs.beforeFirst();

                // Iterating again to fetch updated records
                while (rs.next()) {
                    rs.refreshRow(); // Refreshing the row to reflect database updates
                    System.out.println("\t" + rs.getInt(1) + "\t" + rs.getString(2) + "\t" + rs.getInt(3) + "\t" + rs.getString(4));
                }


                rs.moveToInsertRow();

                rs.updateString(2,"Ujjwal");
                rs.updateInt(3,21);
                rs.updateString(4,"RCD");
                rs.insertRow();
                System.out.println("Records After Insertion");

                // Moving the cursor back to the first row
                rs.beforeFirst();

                // Iterating again to fetch updated records
                while (rs.next()) {
                    rs.refreshRow(); // Refreshing the row to reflect database updates
                    System.out.println("\t" + rs.getInt(1) + "\t" + rs.getString(2) + "\t" + rs.getInt(3) + "\t" + rs.getString(4));
                }
                System.out.println("After Updating");
                rs.beforeFirst();
                while (rs.next())
                {
                    int age = rs.getInt(3);
                    if(age>35)
                    {
                        int incrAge = age+5;
                        rs.updateInt(3,incrAge);
                        rs.updateRow();
                    }
                }
                // Moving the cursor back to the first row
                rs.beforeFirst();

                // Iterating again to fetch updated records
                while (rs.next()) {
                    rs.refreshRow(); // Refreshing the row to reflect database updates
                    System.out.println("\t" + rs.getInt(1) + "\t" + rs.getString(2) + "\t" + rs.getInt(3) + "\t" + rs.getString(4));
                }

            }
        } catch (Exception e) {
            e.printStackTrace(); // Handling any exceptions by printing stack trace
        } finally {
            try {
                // Closing resources to prevent memory leaks
                if (rs != null) rs.close();
                if (st != null) st.close();
                if (conn != null) conn.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
