package Polymorphism.RuntimePolymorphism;
class Plane
{
    public void takeOff()
    {
        System.out.println("Taking Off");
    }
    public void fly()
    {
        System.out.println("Plane Is Flying");
    }
    public void landing()

    {
        System.out.println("Plane Is Landing");
    }
}
class CargoPlane extends Plane
{
    public void takeOff()
    {
        System.out.println("Cargo Plane Is Taking Off");
    }
    public void fly()
    {
        System.out.println("Cargo Plane Is Flying");
    }
    public void landing()

    {
        System.out.println("Cargo Plane Is Landing");
    }
}
class PassengerPlane extends Plane
{
    public void takeOff()
    {
        System.out.println("Passenger Taking Off");
    }
    public void fly()
    {
        System.out.println("Passenger Plane Is Flying");
    }
    public void landing()
    {
        System.out.println("Passenger Plane Is Landing");
    }
}
class FighterPlane extends Plane
{
    public void takeOff()
    {
        System.out.println("Fighter Taking Off");
    }
    public void fly()
    {
        System.out.println("Fighter Plane Is Flying");
    }
    public void landing()
    {
        System.out.println("Fighter Plane Is Landing");
    }
}
class Airport
{
    public void permit(Plane plane)
    {
         plane.takeOff();
         plane.fly();
         plane.landing();
    }
}
public class RuntimePoly2 {
    public static void main(String[] args) {
        CargoPlane p = new CargoPlane();
        PassengerPlane pp = new PassengerPlane();
        FighterPlane fp = new FighterPlane();
        Airport a = new Airport();
        a.permit(p);
        a.permit(pp);
        a.permit(fp);
    }
}
//Runtime Polymorphism Means Creating Parent Type Reference(Loose Coupling)
