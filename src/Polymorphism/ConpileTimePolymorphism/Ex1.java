package Polymorphism.ConpileTimePolymorphism;
class Test
{
    public void add(int... a)
    {
        int sum = 0;
        for(int num : a)
            sum += num;
        System.out.println(sum);
    }
}
public class Ex1 {
    public static void main(String[] args) {
        Test t = new Test();
        t.add(10,10,10);
        t.add(10,10);
        t.add(10);
    }
}
