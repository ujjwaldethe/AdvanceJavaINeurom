package ImageInsertIntoDatabase;

import JDBC.JDBCStandardApp2;
import org.apache.commons.io.IOUtils;

import java.io.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class RetrievePdf {

    public static void main(String[] args) throws SQLException {
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        PrintWriter pr = null;
        Reader r = null;

        try {
            conn = JDBCStandardApp2.getJDBCConnection();
            String sql = "SELECT * FROM imgio2 WHERE id = ?";

            if (conn != null) {
                ps = conn.prepareStatement(sql);
            }

            if (ps != null) {
                System.out.println("Enter Id: ");
                ps.setInt(1, new Scanner(System.in).nextInt());
                rs = ps.executeQuery();
            }

            if (rs != null && rs.next()) {
                int id = rs.getInt(1);
                String name = rs.getString(2);
                r = rs.getCharacterStream(3);

                System.out.println("Id: " + id + "\tName: " + name);

                pr = new PrintWriter(new File("C:\\Users\\krish\\IdeaProjects\\AdvanceJavaINeurom\\src\\ImageInsertIntoDatabase\\history.txt"));
                IOUtils.copy(r, pr);
                System.out.println("Data written to file successfully.");
            } else {
                System.out.println("Records not available for the given Id.");
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // Close resources in finally block to ensure they are always closed
            try {
                if (pr != null) pr.close();
                if (r != null) r.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            JDBCStandardApp2.cleanUp(conn, ps, rs);
            System.out.println("Connection closed.");
        }
    }
}
/*
* package ImageInsertIntoDatabase;

import JDBC.JDBCStandardApp2;
import org.apache.commons.io.IOUtils;

import java.io.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class RetrievePdf {

    public static void main(String[] args) throws SQLException {
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        InputStream binaryStream = null;
        FileOutputStream fileOutputStream = null;

        try {
            // Get database connection
            conn = JDBCStandardApp2.getJDBCConnection();
            String sql = "SELECT * FROM imgio2 WHERE id = ?";

            if (conn != null) {
                ps = conn.prepareStatement(sql);
            }

            if (ps != null) {
                // Prompt user for ID
                System.out.println("Enter Id: ");
                ps.setInt(1, new Scanner(System.in).nextInt());
                rs = ps.executeQuery();
            }

            if (rs != null && rs.next()) {
                int id = rs.getInt(1);
                String name = rs.getString(2);
                binaryStream = rs.getBinaryStream(3); // Retrieve binary data

                System.out.println("Id: " + id + "\tName: " + name);

                // Define output file path
                String outputFilePath = "C:\\Users\\krish\\IdeaProjects\\AdvanceJavaINeurom\\src\\ImageInsertIntoDatabase\\output.pdf";
                fileOutputStream = new FileOutputStream(outputFilePath);

                // Copy binary data from database to file
                IOUtils.copy(binaryStream, fileOutputStream);
                System.out.println("Binary data written to file successfully: " + outputFilePath);
            } else {
                System.out.println("Records not available for the given Id.");
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // Close resources in finally block to ensure they are always closed
            try {
                if (fileOutputStream != null) fileOutputStream.close();
                if (binaryStream != null) binaryStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            JDBCStandardApp2.cleanUp(conn, ps, rs);
            System.out.println("Connection closed.");
        }
    }
}*/