package FileHandling;

import java.io.File;
import java.io.IOException;

class Student{
    private Integer sid;
    private String sname;
    private  Integer age;
    Student(Integer sid,String sname,Integer age){
       this.sid=sid;
       this.sname=sname;
       this.age=age;
    }
    public String toString(){
        return "id :"+sid+" name : "+sname+" age : "+age;
    }
}
//java.io api classes are built using the standards of unix os.
//In linux/unix os there is no difference between file and directory
public class FileHandlingEx {
    public static void main(String[] args) throws IOException {

        String fileName = "abc.txt";
        String directortName = "IPL";
        /*
        * This line will check whether the file called "abc.txt" exists or not
        * if it is available then it would go and point to that file
        * otherwise it will represent a java file object, not a physical file.
        * */
        File f = new File("C:\\Users\\krish\\IdeaProjects\\AdvanceJavaINeurom\\src\\FileHandling",fileName);
        File f1 = new File(directortName);
        System.out.println(f.exists());
        f.createNewFile();//it will create a physical file
        //if the file does not eeKxists for th java file object
        System.out.println(f.exists());
        f1.mkdir();//This Will Create Directory
        Student s1 = new Student(1,"Ujjwal",22);
        Student s2 = new Student(2,"Krishna",23);
        System.out.println(s1+"\n"+s2);

    }
}
