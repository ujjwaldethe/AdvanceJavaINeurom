package EnumAndAnnotations;

import java.sql.SQLOutput;

enum Result2 {
    PASS, FAIL, NR;
    int courseID;

    public int getCourseID() {
        return courseID;
    }

    public void setCourseID(int courseID) {
        this.courseID = courseID;
    }
    //PASS --> public static final Result PASSS = new Result();
    Result2()
    {
        System.out.println("constructor is called.");
    }

}
public class EnumExample2 {
    public static void main(String[] args) {
        Result2 res = Result2.PASS; //OWN DATA TYPES
        System.out.println(res);
        Result2 res2[] = Result2.FAIL.values();
        System.out.println(res2);
        for(Result2 r : res2){
            System.out.println(r.ordinal()+" : "+r.name() );
        }
        Result2.FAIL.courseID=10;
        System.out.println(Result2.NR.getCourseID());
    }
}
