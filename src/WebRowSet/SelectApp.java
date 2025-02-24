package WebRowSet;

import javax.sql.rowset.RowSetFactory;
import javax.sql.rowset.RowSetProvider;
import javax.sql.rowset.WebRowSet;
import java.io.FileWriter;

public class SelectApp {
    public static void main(String[] args) throws  Exception{
        RowSetFactory rsf = RowSetProvider.newFactory();
        WebRowSet wrs = rsf.createWebRowSet();

        wrs.setUrl("jdbc:mysql:///test");
        wrs.setUsername("root");
        wrs.setPassword("9370");

        wrs.setCommand("select * from students");
        wrs.execute();

        FileWriter fw = new FileWriter("C:\\Users\\krish\\IdeaProjects\\AdvanceJavaINeurom\\src\\WebRowSet\\std.xml");
        wrs.writeXml(fw);
        System.out.println("Student Data Transferred To Std.xml File...");
        fw.close();


    }
}
