package GenericsClassExample;
class Genrics<T extends Number>//Number->X
{
    //x -> class means, we can pass either X type or its Child Type
    //x -> interface means, we can pass either X or its implementation class.
}
class Sample<T extends Runnable>
{

}
public class LimitingUserDefinecGenericClass {
    public static void main(String[] args) {

    }
}
