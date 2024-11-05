package FileHandling;

import java.io.*;
import java.util.HashSet;

public class Practise3 {
        public static void main (String[]args) throws IOException {

            BufferedReader b1 = new BufferedReader(new FileReader("C:\\Users\\krish\\IdeaProjects\\AdvanceJavaINeurom\\src\\FileHandling\\input.txt"));
            PrintWriter p = new PrintWriter(new FileWriter("C:\\Users\\krish\\IdeaProjects\\AdvanceJavaINeurom\\src\\FileHandling\\output.txt"));
            HashSet<String> h = new HashSet<String>();
            String line = b1.readLine();
            while (line!=null){
                h.add(line);
                line=b1.readLine();
            }
            for(String s : h)
            {
                p.println(s);
            }
            p.flush();
            b1.close();
            p.close();
        }

}