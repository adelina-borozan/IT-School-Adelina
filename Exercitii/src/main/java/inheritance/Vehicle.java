package inheritance;

public class Vehicle {
    private String brand;

    public void start() {
        System.out.println("Vehicle started");
    }


    public static void main(String[] args) {
        Vehicle v = new Vehicle();
        v.start();

        Car c = new Car();
        c.start();
        c.drive();
    }
}
