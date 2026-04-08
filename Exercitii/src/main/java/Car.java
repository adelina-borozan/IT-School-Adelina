import Encapsulation.Person;

public class Car {

    String brand = "VW";
    String model;
    int year;
    boolean isSport;

    public Car(String brand, String model, int year, boolean isSport) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.isSport = isSport;
    }

    public Car(String model, int year, boolean isSport){
        this.model = model;
        this.year = year;
        this.isSport = isSport;
    }

    public void displayInfo(){
        System.out.println(brand);
        System.out.println(model);
        System.out.println(year);

        if(isSport) {
            System.out.println("Este masina sport");
        } else {
            System.out.println("Nu este masina sport");
        }
    }

    public boolean isOldCar() {
        if(year <= 2010) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String []args) {
        Car c1 = new Car("BMW", "X5", 2020, true);

        Car c2 = new Car("Golf", 2010, false);

        c1.displayInfo();
        c2.displayInfo();

        System.out.println(c1.isOldCar());
        System.out.println(c2.isOldCar());

        Person p = new Person("Adelina");

//        p.username = "Adelinaaaaa";
        p.getUsername();
    }
}
