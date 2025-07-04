package FunctionalInterface.LamdaExpression;
interface Demo1
{
    int disp(int... a);
}
interface Demo2
{
    int disp(int... a);
}
interface Sum
{
    int sum(int a,int b);
}
public class AnonymousInnerClass {
    public static void main(String[] args) {
        Demo2 d = new Demo2() {
            @Override
            public int disp(int... a) {
                System.out.println("Anonymous Inner Class");
                return 0;
            }
        };
        d.disp();
        Sum s=(a,b)->{
            return a+b;
        };
        System.out.println(s.sum(10,20));

        Demo1 d2 = (int... a)->{
            System.out.println("Lambda With Array Representation");
            return 0;
        };
        System.out.println(d2.disp(10,20,30,40,04));
    }
}
