package inheritance;

public class Developer extends Employee {

    public Developer(String name){
        super(name);
    }

    public void work(String aplicatie) {
        System.out.println(name + " develoeaza " + aplicatie + ".");
    }
}
