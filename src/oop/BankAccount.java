package oop;

public class BankAccount implements IRate {
    //Define variables

    String accountNumber;
    //static >> belongs to the class not the object instance
    //final >> constant
    private static final String routingNumber = "22222";
    private String name;
    private String ssn;
    String accountType;
    double balance = 0;

    //Constructors definitions: unique methods
    //1. They are used to define/setup/initialize properties of an object
    //2. Constructors are IMPLICITLY called upon instantiation
    //3. The same name as the class itself
    //4. Constructors have no return type
    BankAccount(){
        System.out.println("New account created");
    }
    //Overloading: call same method name with different arguments
    BankAccount(String accountType) {
        System.out.println("New account " + accountType + " created");
    }
    BankAccount(String accountType, double initDeposit){
        System.out.print("New account " + accountType + " created. ");
        System.out.println("Initial deposit off R" + initDeposit );
        String Msg = null;

        if (initDeposit < 1000) {
            Msg = "ERROR : Initial deposit must be at least R 1 000";
        } else {
            Msg = ("Thanks for your initial deposit of R " + initDeposit);
        }
        System.out.println(Msg);
        balance = initDeposit;
    }

    //Getters and Setters
    //All the user to define the name
    public void setName(String name) {
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    //Interface methods
    public void setRate() {
        System.out.println("Setting Rate");
    }

    public void increaseRate(){
        System.out.println("Increasing Rate");
    }
    //Define methods
    public void deposit(double amount) {
        balance = balance + amount;
        showActivity("Deposit");
    }

    void withdraw(double amount) {
        balance = balance - amount;
        showActivity("Withdrawal");
    }

    private void showActivity(String activity){
        System.out.println("Showing recent activity " + activity);
        System.out.println("Your new balance is R" + balance);
    }
    void checkBalance() {
        System.out.println("Balance is R " + balance);
    }

    void getStatus() {

    }

    @Override
    public String toString(){
        return "[ " + name + ". " + accountNumber + ". Balance R" + balance + "]";
    }
}
