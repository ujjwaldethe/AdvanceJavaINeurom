package FileHandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferefReaderEx {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("C:\\Users\\krish\\IdeaProjects\\AdvanceJavaINeurom\\src\\FileHandling\\bw.txt");
        FileReader fr1 = new FileReader("C:\\Users\\krish\\IdeaProjects\\AdvanceJavaINeurom\\src\\FileHandling\\bw.txt");
        BufferedReader br = new BufferedReader(fr);
        BufferedReader br2 = new BufferedReader(fr1);
        String line = br.readLine();
        while (line!=null)
        {
            System.out.println(line);
            line = br.readLine();
        }
        int character;
        while ((character = br2.read()) != -1) {  // Read until end of file (-1)
            System.out.print((char)character);  // Cast to char to display the actual character
        }
        br.close( );
    }
}
