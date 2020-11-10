package basics;

public class Lab1 {
    public static void main(String[] args)
    {
        int n = 5;
        System.out.println("The sum of 1 to " + n + " is: " + sumOfNumbers(n));

        System.out.println();

        for (int i = 1; i < 5; i++){
            System.out.print(factorialValue(i) + " ");
        }

        System.out.println();
        System.out.println();

        int numbersArray[] = {5,10,42,1,25};
        System.out.println("The minimum value of the array is: " + minValue(numbersArray));
        System.out.println("The average of the array is: " + averageValue(numbersArray));
        System.out.println("The maximum value of the array is: " + maxValue(numbersArray));
    }

    public static int sumOfNumbers(int n)
    {
        int sum = 0;
        for (int i = 0; i <= n; i++) {

            sum = sum + i;
        }
        return sum;
    }

    public static int factorialValue(int n)
    {
        if (n==0) {
            return 1;
        }
        return (n*factorialValue(n-1));
    }

    public static int minValue(int[] numbersArray)
    {
        int number = numbersArray[0];
        for (int i = 1; i < numbersArray.length; i++)
        {
            if (number > numbersArray[i])
                number = numbersArray[i];
        }
        return number;
    }

    public static int averageValue(int[] numbersArray)
    {
        int sum = 0;
        for (int i = 0; i < numbersArray.length; i++) {
            sum = sum + numbersArray[i];
        }
        return sum/numbersArray.length;
    }

    public static int maxValue(int[] numbersArray)
    {
        int number = numbersArray[0];
        for (int i = 1; i < numbersArray.length; i++)
        {
            if (number < numbersArray[i])
                number = numbersArray[i];
        }
        return number;
    }
}
