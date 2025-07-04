package Polymorphism.ConpileTimePolymorphism;
class Test
{
    public void add(float w,float... a)// JVM internally uses Array Representation to hold the values of x
    {
        float sum = 0;
        for(float num : a)
            sum += num;
        System.out.println(sum);
    }
}
public class Ex1 {
    public static void main(String[] args) {
        Test t = new Test();
        t.add(10,10,10);
        t.add(10,10);
        t.add(10,10);
        t.add(3.4f);//0
    }
}
