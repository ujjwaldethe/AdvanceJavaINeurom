package Arrays;

public class StudentDb {
    public static void main(String[] args) {
        Student db[] = new Student[5];
        db[0]  = new Student("Ujjwal",123,12,"Sapkal Knowledge Hub");
        db[1]  = new Student("Ujjwal",123,12,"Sapkal Knowledge Hub");
        db[2]  = new Student("Ujjwal",123,12,"Sapkal Knowledge Hub");
        db[3] = new Student("Ujjwal",123,12,"Sapkal Knowledge Hub");
        db[4] = new Student("Ujjwal",123,12,"Sapkal Knowledge Hub");
        for(int i=0;i<db.length;i++)
        {
            System.out.println(db[i]);
        }
    }
}
