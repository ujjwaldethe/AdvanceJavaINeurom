package ComparableAndComparatorInterfaces;

import java.util.Comparator;
import java.util.TreeSet;
class Customize implements Comparator{
    @Override
    public int compare(Object obj1,Object obj2){
        Employee e1 = (Employee) obj1;
        Employee e2 = (Employee) obj2;
        String s1 = e1.name;
        String s2 = e2.name;
        return s1.compareTo(s2);
    }
}
class Employee implements Comparable{
    String name;
    int eid;
    Employee(int eid,String name)
    {
        this.eid=eid;
        this.name=name;
    }
    public String toString(){
        return eid+" ===> "+name;
    }
    @Override
    public int compareTo(Object obj){
        int id1 = this.eid;
        Employee e = (Employee) obj;
        int id2 = e.eid;

        if(id1<id2){
            return -1;
        }
        else if(id1>id2){
            return +1;
        }
        else {
            return 0;
        }
    }
}
public class CustomSortingEmploye {
    public static void main(String[] args) {
        TreeSet t = new TreeSet();
        Employee e1 = new Employee(1,"ujjwal");
        Employee e2 = new Employee(2,"krish");
        Employee e3 = new Employee(4,"Dethe");
        Employee e4 = new Employee(3,"Boom");
        t.add(e1);
        t.add(e2);
        t.add(e3);
        t.add(e4);
        System.out.println(t);
        TreeSet t1 = new TreeSet(new Customize());
        t1.add(e1);
        t1.add(e2);
        t1.add(e3);
        t1.add(e4);
        System.out.println(t1 );
    }
}
