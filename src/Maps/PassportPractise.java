package Maps;

import java.sql.SQLOutput;
import java.util.*;

class Information{
    private String name;
    private  int age;
    private String fatherName;
    private String address;
    public Information(String name,int age,String fatherName,String address)
    {
        this.name = name;
        this.age = age;
        this.fatherName=fatherName;
        this.address=address;
    }
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    public String getFatherName() {
        return fatherName;
    }
    @Override
    public String toString()
    {
        return name + " " + age + " " + fatherName + " " + address;
    }
}
//class Key{
//    int key;
//    public Key(int key)
//    {
//        this.key=key;
//    }
//}
public class PassportPractise {
    public static void main(String[] args) {
        Information info1 = new Information("Roshan Sharma",18,"Sharma ji","Delhi");
        Information info2 = new Information("Hyder Abbass",28,"Hussain Najati","Mumbai");
        Information info3 = new Information("Rohit Sharma",18,"Sharma ji","Nashik");

//        Key k = new Key(123);
        HashMap hm = new HashMap();
        hm.put(111,info1);
        hm.put(222,info2);
        hm.put(333,info3);

        Scanner sc = new Scanner(System.in);

        System.out.println("Please Enter The Passport Number : ");
        boolean flag=false;
        Integer k = sc.nextInt();
        Set s = hm.entrySet();
        Iterator itr = s.iterator();
        while (itr.hasNext())
        {
            Map.Entry passport =(Map.Entry)itr.next();
            Integer key = (Integer) passport.getKey();
            if(k==key)
            {
                System.out.println("Passport Number : "+passport.getKey()+" | Info : "+passport.getValue());
                flag=true;
                System.exit(0);
            }
        }
        if(flag==false)
        {
            System.out.println("Passport Number Not Found ");
        }
    }
}
