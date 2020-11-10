package basics;

public class Strings {

    public static void main(String[] args){
        String bookTitle = "The Lord of the Rings";
        String wordChoice = "Ring";

        if (bookTitle.contains(wordChoice)){
            System.out.println("The book contains the word " + wordChoice);
        }

        String browser = "Chrome";
        if (browser.equalsIgnoreCase("chrome")){
            System.out.println("The browser is chrome");
        }

        String firstName = "Jeandre";
        String lastName = "Cloete";
        String SSN = "820202";

        //Print the initials plus last 4 digits of SSH
        System.out.print(firstName.substring(0,1));
        System.out.print(lastName.substring(0,1));
        System.out.println(SSN.substring(2));

        System.out.println("There are " + SSN.length() + " digits in your SSN");
    }
}
