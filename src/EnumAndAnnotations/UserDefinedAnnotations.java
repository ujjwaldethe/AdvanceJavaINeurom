package EnumAndAnnotations;
@interface CricketPlayer{
    String country();
    int runs();
}
class ViratKohli{
    private  int innings;

    public int getInnings() {
        return innings;
    }

    public void setInnings(int innings) {
        this.innings = innings;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;
}
public class UserDefinedAnnotations {
    public static void main(String[] args) {

    }
}
