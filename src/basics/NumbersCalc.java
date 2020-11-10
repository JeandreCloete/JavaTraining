package basics;

public class NumbersCalc {

    public static void main(String[] args) {
        System.out.println("Program is starting");
        printName();
        System.out.println();

        int numA = 10;
        int numB = 20;
        addNumbers(numA,numB);
        System.out.println();

        int product = multiplyNumbers(numA, numB);
        System.out.println("The product of " + numA + " and " + numB + " is " + product);
        //System.out.println("The product of " + numA + " and " + numB + " is " + multiplyNumbers(numA, numB));
    }

    static void printName(){
        System.out.println("My name is Jeandre");
    }

    static void addNumbers(int numA, int numB){
        //This function will add two numbers
        int sum = numA + numB;
        System.out.println("The sum of numbers " + numA + " and " + numB + " is " + sum);
    }

    static int multiplyNumbers(int numA, int numB){
        int product = numA * numB;
        addNumbers(product + 50,product);
        return product;
    }
}
