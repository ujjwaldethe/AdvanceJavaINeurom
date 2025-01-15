package EnumAndAnnotations;

import java.security.DrbgParameters;

//NORTH SOUTH EAST WEST
//MALE FEMALE OTHERS
//SUN MON TUE WED THU FRI SAT
//JAN FEB MARCH ____ DEC
//PASS FAIL NO RESULT
enum Result{
    PASS,FAIL,NR; //bydefault it is static and final
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
        Result res = Result.PASS;
        System.out.println(res);
        Result resArr[] = Result.FAIL.values();
        for(Result dataex : resArr)
        {
            System.out.println(dataex.ordinal()+" : " +dataex);
        }
    }
}
