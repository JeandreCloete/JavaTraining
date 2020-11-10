package basics;

public class SalaryCalculator {

    public static void main(String[] args)
    {
        //Lets create a variable to define our career
        //Declare a variable
        String career;
        System.out.println("Program is starting");

        //Defined a variable
        career = "Software Developer";
        System.out.println("My career is: " + career);

        //Declare and define a variable
        int hoursPerWeek = 40;
        int weeksPerYear = 50;
        double rate = 42.50;

        //Compute our annual salary
        //rate * hoursPerWeek * weeksPerYear
        double salary = rate * hoursPerWeek * weeksPerYear;
        System.out.println("My salary as a " + career + " at the rate of R" + rate + " per hour is R" + salary + " per year");
    }
}
