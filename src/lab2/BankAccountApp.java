package lab2;

import jdk.swing.interop.SwingInterOpUtils;

public class BankAccountApp {

    public static void main(String[] args){
        BankAccount acc1 = new BankAccount("1234567891", 1000.00);
        BankAccount acc2 = new BankAccount("1987654321", 2000.00);
        BankAccount acc3 = new BankAccount("5861657315", 2500.00);

        acc1.setName("Jim");
        System.out.println(acc1.getName());

        acc1.makeDeposit(500.00);
        acc1.makeDeposit(600.00);
        acc1.payBill(1000.00);
        acc1.accrue();
        System.out.println(acc1.toString());
    }
}

class BankAccount implements IInterest {
    //Properties of bank account
    private static int ID = 1000;                 //Internal ID
    private String accountNumber;   //ID + random 2 digit number + first 2 of ssn
    private static final String routingNumber = "005400657";
    private String name;
    private String ssn;
    private double balance;

    //Constructors
    public BankAccount(String ssn, double deposit){
        this.ssn = ssn;
        ID++;
        setAccountNumber();
        balance = deposit;
    }

    private void setAccountNumber(){
        int random = (int) (Math.random() * 100);
        accountNumber = ID + "" + random + ssn.substring(0,2);
        System.out.println("Your account number is : " + accountNumber);
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void payBill(double amount){
        balance = balance - amount;
        System.out.println("Paying Bill R" + amount);
        showBalance();
    }

    public void makeDeposit(double amount){
        balance = balance + amount;
        System.out.println("Making deposit R" + amount);
        showBalance();
    }

    public void showBalance(){
        System.out.println("Balance R" + balance);
    }

    @Override
    public void accrue(){
        balance = balance * ( 1 + (rate/100));
        showBalance();
    }

    public String toString(){
        return "[Name " + name + "]\n[Account number: " + accountNumber + "]\n" + "[Routing number: " + routingNumber + "]\n" + "[Balance " + balance + "]";
    }
}
