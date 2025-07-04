package FunctionalInterface.LamdaExpression;
interface IString
{
    int StringLength2(String str);
}
public class StringLengthImpl {
    public static void main(String[] args) {
        IString i = (str) -> str.length();
        System.out.println(i.StringLength2("Ujjwal"));
    }
}
