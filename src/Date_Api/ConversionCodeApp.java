package Date_Api;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class ConversionCodeApp {
    public static void main(String[] args) throws ParseException {

        //Read The Input From The User
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Date : (dd-mm-yyyy) : ");
        String sdate = sc.next();

        //Convert The Date From String Format To java.util.Date
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        java.util.Date udate = sdf.parse(sdate);

        //Convert java.util.Date to java.sql.Date
        long value = udate.getTime();
        java.sql.Date sqlDate = new java.sql.Date(value);
        System.out.println("Enter Date (yyyy-MM-dd) : ");
        String standardInput = sc.next();
        java.sql.Date sqlIp = java.sql.Date.valueOf(standardInput);

        System.out.println("\n"+sqlDate);
        System.out.println("\n"+sqlIp);

    }
}
