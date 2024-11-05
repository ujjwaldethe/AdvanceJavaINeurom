package FileHandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class Practise4 {
    public static void main(String[] args) {
        // Use try-with-resources to ensure the resources are closed automatically
        try (BufferedReader b1 = new BufferedReader(new FileReader("C:\\Users\\krish\\IdeaProjects\\AdvanceJavaINeurom\\src\\FileHandling\\io.txt"));
             BufferedReader b2 = new BufferedReader(new FileReader("C:\\Users\\krish\\IdeaProjects\\AdvanceJavaINeurom\\src\\FileHandling\\del.txt"));
             PrintWriter p = new PrintWriter("C:\\Users\\krish\\IdeaProjects\\AdvanceJavaINeurom\\src\\FileHandling\\op.txt")) {

            String line;
            while ((line = b1.readLine()) != null) {
                boolean isRepeated = false;

                // Reset b2 to the beginning for each line of b1
                b2.mark(1000); // Mark the current position
                String line2;
                while ((line2 = b2.readLine()) != null) {
                    if (line.equals(line2)) {
                        isRepeated = true;
                        break;
                    }
                }
                b2.reset(); // Reset b2 to the marked position

                if (!isRepeated) {
                    p.println(line); // Write the line to op.txt if it's not repeated
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
