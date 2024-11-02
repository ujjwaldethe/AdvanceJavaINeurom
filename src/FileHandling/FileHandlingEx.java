package FileHandling;

import javax.management.timer.Timer;
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
        File f1 = new File("C:\\Users\\krish\\IdeaProjects\\AdvanceJavaINeurom\\src\\FileHandling",directortName);
        System.out.println(f.exists());
        f.createNewFile();//it will create a physical file
        //if the file does not .exists for th java file object
        System.out.println(f.exists());
        f1.mkdir();//This Will Create Directory

        System.out.println("Is File :  "+f.isFile());
        System.out.println("Is Directory :  "+f.isDirectory());

        Student s1 = new Student(1,"Ujjwal",22);
        Student s2 = new Student(2,"Krishna",23);
        System.out.println(s1+"\n"+s2);

        File f3 = new File("C:\\Users\\krish\\IdeaProjects\\AdvanceJavaINeurom\\src");
        String[] names1 = f3.list();
        int fcount=0,dcount=0;
        for(String files : names1)
        {
            File fname = new File(f3,files);
            if(fname.isFile())
            {
                fcount++;
            }
            if(fname.isDirectory())
            {
                dcount++;
            }
            if(files.endsWith(".txt"))
            {
                System.out.println("Exists");
            }
            System.out.println(files);
        }
        System.out.println("Total Files : "+fcount);
        System.out.println("Total Directory : "+dcount);
        f1.delete();//directory delete
        //f.delete();//file deleted

    }
}
