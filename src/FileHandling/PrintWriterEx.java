package FileHandling;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class PrintWriterEx {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("C:\\Users\\krish\\IdeaProjects\\AdvanceJavaINeurom\\src\\FileHandling\\print.txt");
        PrintWriter out = new PrintWriter(fw);

        out.write(100);
        out.write('\n');
        out.println(100);
        out.println(true);
        out.println('c');
        out.println("DennisRitchie");
        out.flush();




        out.close();
    }
}
