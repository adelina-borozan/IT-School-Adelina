package Encapsulation;

public class Person {
    private String username;
    String password;

    public Person(String username) {
        this.username = username;
    }

    public String getUsername() {
        return this.username;
    }

    public void setUsername(String username) {
        this.username = username;
    }


    public static void main(String []args) {
        Person p = new Person("Adelina");
        p.username = "Adelina";

        p.getUsername();
    }

}
