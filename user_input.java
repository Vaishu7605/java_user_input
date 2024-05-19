
import java.util.Scanner;

public class user_input {

    public static void main(String[] args) {
        // Get Integer Input From the User
        // create an object of Scanner
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        // take input from the user
        int number = input.nextInt();
        System.out.println("You entered " + number);

        // Getting float input
        System.err.println("Enter float: ");
        float myFloat = input.nextFloat();
        System.err.println("Float entered = " + myFloat);

        // Getting double input
        System.out.print("Enter double: ");
        double myDouble = input.nextDouble();
        System.out.println("Double entered = " + myDouble);

        // Getting String input
        System.out.print("Enter text: ");
        String myString = input.next();
        System.out.println("Text entered = " + myString);
    }
}
