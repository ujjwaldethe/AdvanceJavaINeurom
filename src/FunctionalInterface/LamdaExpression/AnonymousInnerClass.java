package FunctionalInterface.LamdaExpression;
interface Demo2
{
    void disp();
}
interface Sum
{
    int sum(int a,int b);
}
public class AnonymousInnerClass {
    public static void main(String[] args) {
        Demo2 d = new Demo2() {
            @Override
            public void disp() {
                System.out.println("Anonymous Inner Class");
            }
        };
        d.disp();
        Sum s=(a,b)->{
            return a+b;
        };
        System.out.println(s.sum(10,20));
    }
}
