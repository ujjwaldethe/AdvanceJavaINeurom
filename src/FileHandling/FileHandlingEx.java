package FileHandling;
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
public class FileHandlingEx {
    public static void main(String[] args) {
            Student s1 = new Student(1,"Ujjwal",22);
            Student s2 = new Student(2,"Krishna",23);
        System.out.println(s1+"\n"+s2);
    }
}
