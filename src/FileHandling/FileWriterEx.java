package FileHandling;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterEx
{
    public static void main(String[] args) throws IOException {
        FileWriter f = new FileWriter("C:\\Users\\krish\\IdeaProjects\\AdvanceJavaINeurom\\src\\FileHandling\\abc.txt",true);
        f.write("\n");
        f.write((Integer)101);
        f.write("\n\nHello Zoooto");
        char ch[] = {'a','3','b','x'};
        f.write(ch);

        f.flush();//making the data to write to the file
        f.close();//closing the file
    }
}
