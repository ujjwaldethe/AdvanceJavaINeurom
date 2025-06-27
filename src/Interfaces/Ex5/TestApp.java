package Interfaces.Ex5;

interface IRemote
{
    //SRS

    int a = 10;
    int MIN_VOLUME = 0; //Common For All Implementation class
    int MAX_VOLUME = 15;//Common For All Implementation class
}

public class TestApp {

    public static void main(String[] args) {
        int a = 20;
        System.out.println(a);
        System.out.println(IRemote.a);
    }
}
