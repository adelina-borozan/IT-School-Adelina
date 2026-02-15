package exercitii;

public class Test {
    int age;
    String name;

    public Test(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public void displayInfo() {
        System.out.println(this.name + " has " + this.age + " years old");
    }

    public static void main() {
        Test t1 = new Test(25, "Ana");
        t1.displayInfo();
    }
}
