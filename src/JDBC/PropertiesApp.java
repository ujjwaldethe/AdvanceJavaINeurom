package JDBC;

import java.io.FileInputStream;
import java.util.Properties;

public class PropertiesApp {
    public static void main(String[] args) throws Exception {
        FileInputStream f = new FileInputStream("C:\\Users\\krish\\IdeaProjects\\AdvanceJavaINeurom\\src\\JDBC\\application.properties");
        Properties properties = new Properties();
        properties.load(f);
        String url = properties.getProperty("url");
        String user = properties.getProperty("user");
        String password = properties.getProperty("password");
        System.out.println(url);
        System.out.println(user);
        System.out.println(password);
    }
}
