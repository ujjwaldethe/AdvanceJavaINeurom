package FileHandling;

import java.io.*;

public class Practise {
    public static void main(String[] args) throws IOException {


        BufferedReader b1 = new BufferedReader( new FileReader("C:\\Users\\krish\\IdeaProjects\\AdvanceJavaINeurom\\src\\FileHandling\\file1.txt"));

        PrintWriter p = new PrintWriter( new FileWriter("C:\\Users\\krish\\IdeaProjects\\AdvanceJavaINeurom\\src\\FileHandling\\file3.txt"));
        String line = b1.readLine();
        while(line!=null)
        {
            p.println(line);
            line = b1.readLine();
        }
        b1 = new BufferedReader(new FileReader("C:\\Users\\krish\\IdeaProjects\\AdvanceJavaINeurom\\src\\FileHandling\\file2.txt"));
        line = b1.readLine();
        while(line!=null)
        {
            p.println(line);
            line= b1.readLine();
        }
        p.flush();
        b1.close();
        p.close();


    }
}
