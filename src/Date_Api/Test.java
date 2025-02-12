package Date_Api;
import java.util.Date;
import java.sql.*;
public class Test {
    public static void main(String[] args) {
        //java.util.Date --> we use to store both Date and Time Information
        Date d = new Date();
        System.out.println(d);

        long t = d.getTime();
        //java.sql.Date ->we use to store Date Information
        java.sql.Date sqlDate = new java.sql.Date(d.getTime());

        System.out.println(t);
        System.out.println(sqlDate);
    }
}
