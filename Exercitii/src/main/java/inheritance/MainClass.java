package inheritance;

public class MainClass {

    public static void main(String[] args) {
//        Vehicle vehicle = new Vehicle();
//        vehicle.start();
//
//        Car car = new Car();
//
//        car.start();
//        car.drive();
//
//        Bike bike = new Bike();
//
//        bike.start();
//        bike.ride();


//        Person person = new Person("Ana", 15);
//
//        person.details();
//
//        Student student = new Student("Gratiela", 16, 9);
//
//        student.details();
//        student.displayStudentInfo();
//
//        String studentName = student.getName();
//        System.out.println("Student name: " + studentName);
//
//        int studentAge = student.getAge();
//        System.out.println("Student age: " + studentAge);
//
//        int studentGrade = student.getGrade();
//        System.out.println("Student grade: " + studentGrade);

        Employee employee = new Employee("Maria");

        Developer developer = new Developer("Ana");

        Tester tester = new Tester("Adelina");

        employee.work("ITist");

        developer.work("DemoQA");

        tester.work("Practice Software Testing");
        tester.work();

    }
}
