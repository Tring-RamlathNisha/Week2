abstract class Vehicle{
    abstract void start_engine();
}
class Car extends Vehicle{
    void start_engine(){
        System.out.println("Car Engine Started... ");
    }
}
class Bike extends Vehicle{
    void start_engine(){
        System.out.println("Bike Engine Started... ");
    }
}
public class Abstraction{
    public static void main(String[] args) {
        Vehicle bike = new Bike();
        Vehicle car = new Car();
        bike.start_engine();
        car.start_engine();
    }
}