package inheritance;

public class Developer extends Employee {

    public Developer(String name){
        super(name);
    }

    @Override
    public void work(String aplicatie) {
        System.out.println(name + " develoeaza " + aplicatie + ".");
    }
}
