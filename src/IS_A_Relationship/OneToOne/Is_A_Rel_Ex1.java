package IS_A_Relationship.OneToOne;

class Student
{
    private String sname;
    private Integer aage;
    private Integer sid;

    public Student(String sname, Integer aage, Integer sid) {
        this.sname = sname;
        this.aage = aage;
        this.sid = sid;
    }

    public Integer getAage() {
        return aage;
    }
    public void setAage(Integer aage) {
        this.aage = aage;
    }
    public String getSname() {
        return sname;
    }
    public void setSname(String sname) {
        this.sname = sname;
    }
    public Integer getSid() {
        return sid;
    }
    public void setSid(Integer sid) {
        this.sid = sid;
    }

    @Override
    public String toString() {
        return "Student [ sname="+sname+"| sage="+aage+"| sid="+sid+" ]";
    }
}
public class Is_A_Rel_Ex1 {
    public static void main(String[] args) {
     Student student = new Student("Ujjwal",50,10);
        System.out.println(student);

    }
}
