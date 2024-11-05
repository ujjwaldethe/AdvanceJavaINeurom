package FileHandling;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterEx {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("C:\\Users\\krish\\IdeaProjects\\AdvanceJavaINeurom\\src\\FileHandling\\bw.txt");
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write(106);
        bw.write("Neuron");
        char ch[]={'a','b','d','f','s','e','g'};
        bw.newLine();
        bw.write(ch);
        bw.newLine();
        bw.write("krishna");
        bw.write(Integer.toString(9370));
        bw.flush();
        bw.close();
    }
}
