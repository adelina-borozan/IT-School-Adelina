package Encapsulation;

public class TestClass {

    public static void main(String []args) {
        Person p = new Person("Adelina");

        String username = p.getUsername();
        System.out.println(username);

        p.setUsername("Andreea");
        System.out.println(p.getUsername());
    }

}
