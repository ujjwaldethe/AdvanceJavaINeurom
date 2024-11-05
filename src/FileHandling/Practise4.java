package FileHandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class Practise4 {
    public static void main(String[] args) {
        // Use try-with-resources to ensure the resources are closed automatically
        try (BufferedReader b1 = new BufferedReader(new FileReader("C:\\Users\\krish\\IdeaProjects\\AdvanceJavaINeurom\\src\\FileHandling\\io.txt"));

             PrintWriter p = new PrintWriter("C:\\Users\\krish\\IdeaProjects\\AdvanceJavaINeurom\\src\\FileHandling\\op.txt")) {

            String line;
            while ((line = b1.readLine()) != null) {
                boolean isRepeated = false;
                BufferedReader b2 = new BufferedReader(new FileReader("C:\\Users\\krish\\IdeaProjects\\AdvanceJavaINeurom\\src\\FileHandling\\del.txt"));
                // Reset b2 to the beginning for each line of b1

                String line2;
                while ((line2 = b2.readLine()) != null) {
                    if (line.equals(line2)) {
                        isRepeated = true;
                        break;
                    }
                }


                if (!isRepeated) {
                    p.println(line); // Write the line to op.txt if it's not repeated
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
