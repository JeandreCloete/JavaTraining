package lab2;

import java.util.Random;

public class Student {

    private String name;
    private String SSN;
    private String eMail;
    private static final String emailAppend = "@student.com";
    private static int ID = 1000;
    private String userID;

    private String phone;
    private String city;
    private String state;

    private String className;
    private double balance;

    private Random r = new Random();
    private int low = 1000;
    private int high = 9000;
    private int randomResult = r.nextInt(high - low) + low;

    Student(String name, String SSN){
        this.name = name;
        this.SSN = SSN;
        setEmail();
        setStudentID();
        balance = 10000;
    }

    private void setEmail(){
        this.eMail = name.toLowerCase() + ID + emailAppend;
    }
    public void setDetails(String phone, String city, String state){
        this.phone = phone;
        this.city  = city;
        this.state = state;
    }

    public void getDetails(){
        System.out.println("Phone: " + phone);
        System.out.println("City : " + city);
        System.out.println("State: " + state);
    }

    private void setStudentID(){
        this.userID = String.valueOf(ID) + randomResult + SSN.substring(SSN.length()-4,SSN.length());
        ID++;
    }

    public void enroll(String className){
        this.className = className;
        System.out.println(name + " has enrolled in " + className);
    }

    public void pay(double amount){
        balance = balance - amount;
        System.out.println(name + " has paid R" + amount);
        checkBalance();
    }

    public void checkBalance(){
        System.out.println("The balance on the account is R" + balance);
    }

    public String toString(){
        return "[Student name:" + name + "]\n[Student SSN :" + SSN + "]\n[Student mail:" + eMail + "]\n[Student ID  :" + userID + "]\n";
    }

    public void showCourses(){
    }
}
