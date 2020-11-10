package oop;
class Person {
    String name;
    String email;
    String phone;

    void walk() {
        System.out.println(name + " is walking");
    }

    void eat() {
        System.out.println(email);
    }

    void sleep(){
        System.out.println(name + " is sleeping");
    }
}
public class Demo {

    public static void main(String[] args) {
        //Instantiating an object
        Person person1 = new Person();

        //Define some properties
        person1.name   = "Joe";
        person1.email  = "joe@test.com";
        person1.phone  = "0822224444";

        //Abstraction
        person1.walk();
        person1.eat();;
        person1.sleep();

        Person person2 = new Person();

        person2.name = "Sarah";
        person2.email  = "sarah@test.com";
        person2.phone  = "0826667777";

        person2.walk();
        person2.eat();
        person2.sleep();

//        //Person
//        //Attributes, variables, adjectives
//        String name = "Joe";
//        String email = "joe@test.com";
//        String phone = "0822224444";
//
//        //Action, activity, behaviour
//        //System.out.println(name + " is walking");
//        walking(name);
//        System.out.println(name + " is eating");
//
//        //What if we wanted to do this for another person?
//        String name2 = "Sarah";
//        String email2 = "sarah@test.com";
//        String phone2 = "0823335555";
//
//        //Action, activity, behaviour
//        //System.out.println(name2 + " is walking");
//        walking(name2);
//        System.out.println(name2 + " is eating");
//
//        //What about binding attributes and properties together?
//
//    }
//
//    //Enhance by adding functions to minimize code
//    static void walking(String name){
//        System.out.println(name + " is walking");
    }
}
