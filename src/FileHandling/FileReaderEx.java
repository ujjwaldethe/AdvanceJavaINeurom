package FileHandling;

import java.io.FileReader;
import java.io.IOException;

public class FileReaderEx  {
    public static void main(String[] args)  throws IOException {
        try {
            FileReader f = new FileReader("abc.txt");

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

    }
}
