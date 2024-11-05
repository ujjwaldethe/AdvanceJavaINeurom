package FileHandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class Practise5 {
    public static void main(String[] args) throws IOException{
     BufferedReader b1 = new BufferedReader(new FileReader("C:\\Users\\krish\\IdeaProjects\\AdvanceJavaINeurom\\src\\FileHandling\\data.txt"));
     String data = b1.readLine();
     int maxLength = Integer.MIN_VALUE;
     String res = "";
     while (data!=null){
         int resultLength=data.length();
         if(maxLength<resultLength)
         {
             maxLength=resultLength;
             res=data;
         }
         data=b1.readLine();
     }
        System.out.println("Max Length : "+maxLength+"\n Data : "+res);




    }
}
