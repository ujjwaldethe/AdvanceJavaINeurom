package FileHandling;

import java.io.*;

public class Practise3 {
        public static void main (String[]args) throws IOException {

            BufferedReader b1 = new BufferedReader(new FileReader("C:\\Users\\krish\\IdeaProjects\\AdvanceJavaINeurom\\src\\FileHandling\\input.txt"));

            PrintWriter p = new PrintWriter(new FileWriter("C:\\Users\\krish\\IdeaProjects\\AdvanceJavaINeurom\\src\\FileHandling\\output.txt"));

            p.flush();
            b1.close();
            p.close();
        }

}