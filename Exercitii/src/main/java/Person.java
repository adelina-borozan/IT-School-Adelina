public class Person {
    String name;
    int age;

    public Person(String nameParam) {
        this.name = nameParam;
    }

    public Person(int age) {
        this.age = age;
    }

    public Person(String nameParam, int ageParam) {
        this.name = nameParam;
        this.age = ageParam;
    }

    public void displayInfo() {
        System.out.println(this.name + " are " + this.age + " ani");
    }


    public static void main(String []args){
        Person p1 = new Person("Gratiela", 28);

        p1.name = "Anabella";
        p1.age = 38;

        Person p2 = new Person("Horatiu", 25);
//        p2.name = "Horatiu";
//        p2.age = 25;

        Person p3 = new Person("George");

        Person p4 = new Person(26);

        p1.displayInfo();
        p2.displayInfo();
        p3.displayInfo();
        p4.displayInfo();
    }
}
