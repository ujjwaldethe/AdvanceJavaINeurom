package Wrapper.parseXxx;

public class TestApp {
    public static void main(String[] args) {
        //parseXxx - > Convert String to any primitive type.
        int i = Integer.parseInt("10");
        boolean b1 = Boolean.parseBoolean("Ujjwal");
        System.out.println(i);
        System.out.println(b1); 
        //commandline arguments => String inputs = args[0],args[1]
        try
        {
            System.out.println(args[0]);
            System.out.println(args[1]);
        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println("No Arguments Found");
        }

    }
}
