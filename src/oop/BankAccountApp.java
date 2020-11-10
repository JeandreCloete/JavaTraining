package oop;

public class BankAccountApp {

    public static void main(String[] args) {
        //Creating a new bank account >> think instantiate an object
        BankAccount acc1 = new BankAccount();

//        acc1.name = "Joe";
        //With encapsulation : public API method
        acc1.setName("John");
        System.out.println("The name is " + acc1.getName());
        acc1.setSsn("2222");
        System.out.println("SSN is " + acc1.getSsn());
        acc1.setRate();
        acc1.increaseRate();

        acc1.accountNumber = "000001";
        acc1.balance = 500.00;

//        acc1.deposit(500.00);
//        acc1.deposit(500.00);
//        acc1.deposit(500.00);
//        acc1.withdraw(250.00);

        //Polymorphism through overriding
        System.out.println(acc1.toString());

        //Polymorphism through overloading
        BankAccount acc2 = new BankAccount("Cheque");
        acc2.accountNumber = "000002";

        BankAccount acc3 = new BankAccount("Savings", 1500.00);
        acc3.accountNumber = "000003";
        acc3.checkBalance();
//
//        //Demo for inheritance
//        CDAccount cd1 = new CDAccount();
//        cd1.balance = 3000.00;
//        cd1.name = "Juan";
//        cd1.accountType = "CD Account";
//        System.out.println(cd1.toString());
//        cd1.interestRate = 4.5;
//        cd1.compound();
    }

}
