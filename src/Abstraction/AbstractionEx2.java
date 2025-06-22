package Abstraction;

abstract class Loan
{
    abstract public void dispInt();
    public void welcomeNote()
    {
        System.out.println("Welcome To Dark");
    }
}
class HomeLoad extends Loan{
    @Override
    public void dispInt()
    {
        System.out.println("Home Loan");
    }
}
class EducationLoad extends Loan
{
    @Override
    public void dispInt()
    {
        System.out.println("Education Loan");
    }
}

public class AbstractionEx2 {
    public static void main(String[] args) {
        Loan l = new HomeLoad();
        l.welcomeNote();
        l.dispInt();
        l = new EducationLoad();
        l.welcomeNote();
        l.dispInt();
        // We cannot create object of abstract class
    }
}
