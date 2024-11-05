package FileHandling;

import java.io.*;

public class Practise2 {
    public static void main(String[] args) throws IOException {

        BufferedReader b1 = new BufferedReader( new FileReader("C:\\Users\\krish\\IdeaProjects\\AdvanceJavaINeurom\\src\\FileHandling\\file1.txt"));

        PrintWriter p = new PrintWriter( new FileWriter("C:\\Users\\krish\\IdeaProjects\\AdvanceJavaINeurom\\src\\FileHandling\\file3.txt"));

        BufferedReader b2  = new BufferedReader(new FileReader("C:\\Users\\krish\\IdeaProjects\\AdvanceJavaINeurom\\src\\FileHandling\\file2.txt"));
        String line = b1.readLine();
        String line2 = b2.readLine();
        while(line!=null || line2!=null )
        {
            if(line!=null){
                p.println(line);
                line= b1.readLine();
            }
            if(line2!=null){
                p.println(line2);
                line2=b2.readLine();
            }
        }
        p.flush();
        b1.close();
        b2.close();
        p.close();
}
}
