package GenericsClassExample;
class Gen<T>{
    T obj;
    Gen(T obj){
        this.obj=obj;
    }
    public void show(){
        System.out.println("Object Type : "+obj.getClass().getName());
    }
    T Obj(){
        return obj;
    }
}
public class UserDefinedGenericClass {
    public static void main(String[] args) {
        Gen<Integer> g1 = new Gen<Integer>(10);
        g1.show();
        System.out.println(g1.Obj());
    }
}
