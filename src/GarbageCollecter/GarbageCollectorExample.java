package GarbageCollecter;

import java.util.HashMap;
import java.util.*;
import java.util.Map;

class Emplye{
    private int empid;
    private String name;
    private String empAddr;
    public int getEmpid() {
        return empid;
    }

    public void setEmpid(int empid) {
        this.empid = empid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmpAddr() {
        return empAddr;
    }

    public void setEmpAddr(String empAddr) {
        this.empAddr = empAddr;
    }
    @Override
    public String toString()
    {
        return "hyder";
    }
    @Override
    public void finalize()
    {
        System.out.println("Garbage Collector Called");
    }
}
public class GarbageCollectorExample {
    public static void main(String[] args) {
        Hashtable ht1 = new Hashtable();
        ht1.put(1,"ujwal");
        ht1.put(2,"krishna");
        System.out.println(ht1);



    }
}
