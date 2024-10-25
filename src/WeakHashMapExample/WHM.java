package WeakHashMapExample;

import java.util.WeakHashMap;

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
public class WHM {
    public static void main(String[] args) {
        Emplye e = new Emplye();
        WeakHashMap whm = new WeakHashMap();
        whm.put(1,"Ujjwal");
        e=null;
        System.gc();
    }
}
