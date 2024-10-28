package EnumAndAnnotations;
@FunctionalInterface
interface Trail{
    int getNum();

}
class JavaLearn{
    public void disp()
    {
        System.out.println("Parent Display");
    }
}
class Focus extends JavaLearn{
    @Override
    public void disp()
    {
        System.out.println("Child Display");
    }

}
public class AnnotationsEx {
    public static void main(String[] args) {
        Trail t =()->{
            return 10;
        };
    }
}
