package FileHandling;

import java.io.FileReader;
import java.io.IOException;

public class FileReaderEx  {
    public static void main(String[] args)  throws IOException {
        try {
            FileReader f = new FileReader("C:\\Users\\krish\\IdeaProjects\\AdvanceJavaINeurom\\src\\FileHandling\\abc.txt ");
            int i = f.read();
            while (i!= -1) {
                //Reading Character One By One
                System.out.print((char) i);
                i=f.read();
            }
            //Reading All Character Data At One Time


        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

    }
}
