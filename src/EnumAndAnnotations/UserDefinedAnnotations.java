package EnumAndAnnotations;
@interface CricketPlayer{
    String country() default "India";
    int runs() default 2000;
}
@CricketPlayer
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
        ViratKohli vk = new ViratKohli();
        vk.setInnings(200);
        vk.setName("Virat");
        System.out.println(vk.getInnings());
        System.out.println(vk.getName());
    }
}
