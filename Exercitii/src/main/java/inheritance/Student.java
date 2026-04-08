package inheritance;

public class Student extends Person {
    private int grade;

    public Student(String name, int age) {
        super(name, age);
    }

    public Student(String name, int age, int grade){
        super(name, age);
        this.grade = grade;
    }

    public void displayStudentInfo(){
        System.out.println("Grade: " + this.grade);
    }

    public int getGrade() {
        return grade;
    }
}
