package EnumAndAnnotations;
//NORTH SOUTH EAST WEST
//MALE FEMALE OTHERS
//SUN MON TUE WED THU FRI SAT
//JAN FEB MARCH ____ DEC
//PASS FAIL NO RESULT
enum Result{
    PASS,FAIL,NR; //by default it is static and final
    //fields ->instance variables ->properties.
    //methods
    //Constructor
}
enum Gender{
    MALE,FEMALE,OTHERS;
}
enum Compass{
    NORTH,SOUTH,EAST,WEST;
}//FOR EACH ENUM SEPERATE .CLASS FILE IS GENERATED.
public class EnumExample {
    public static void main(String[] args) {
        enum Gender{
            MALE,FEMALE,OTHERS;
        }
    }
}
