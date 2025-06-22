package IS_A_Relationship.ManyToOne;

public class ManyToOneDriver {
    public static void main(String[] args) {
        Branch b = new Branch();
        b.setBid("1");
        b.setBname("Computer");

        Student s1 = new Student();
        s1.setSid("1");
        s1.setSname("Ujjwal");
        s1.setSaddr("CSN");

        Student s2 = new Student();
        s2.setSid("2");
        s2.setSname("Ujjwal");
        s2.setSaddr("CSN");

        Student s3 = new Student();
        s3.setSid("3");
        s3.setSname("Ujjwal");
        s3.setSaddr("CSN");

        System.out.println("Student Name "+s1.getSname());
        System.out.println("Student Age "+s1.getSid());
        System.out.println("Student Address "+s1.getSaddr());

        System.out.println("Student Name "+s2.getSname());
        System.out.println("Student Age "+s2.getSid());
        System.out.println("Student Address "+s2.getSaddr());

        System.out.println("Student Name "+s3.getSname());
        System.out.println("Student Age "+s3.getSid());
        System.out.println("Student Address "+s3.getSaddr());

    }
}
