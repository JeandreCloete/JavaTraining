package lab2;

public class StudentApp {

    public static void main(String[] args){

        Student person = new Student("Jeandre", "8202020022087");
        person.setDetails("0827467987", "Centurion", "Gauteng");
        System.out.println(person.toString());
        person.getDetails();

        person.enroll("Chemistry");
        person.checkBalance();
        person.pay(2500.00);
    }
}
