package FileHandling;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileReader2 {
    public static void main(String[] args) throws IOException {
        File f = new File("C:\\Users\\krish\\IdeaProjects\\AdvanceJavaINeurom\\src\\FileHandling\\abc.txt ");
        FileReader f1 = new FileReader(f);
        char ch[] = new char[(int)f.length()];
        f1.read(ch);
        for(char data : ch)
        {
            System.out.print(data);
        }

    }
}
