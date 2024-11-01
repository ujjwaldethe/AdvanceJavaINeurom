package StreamApi;
class Sample{
    private String s;
    Sample(String s){
        this.s=s;
        System.out.println("\nConstructor Executed !"+s+"\n");
    }
}
@FunctionalInterface
interface intefc{
    public Sample get(String s);
    //if public void get(String s);
    //them use line 17
}
public class Test {
    public static void main(String[] args) {
       // intefc i =s->System.out.println(i);
         intefc i =s-> new Sample(s);
         i.get("From Lambda Expression.");

         intefc i1 = Sample::new;
         i1.get("From Constructor Reference ");





    }
}
