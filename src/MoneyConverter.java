import java.util.Scanner;

public class MoneyConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the amount inputted from the user
        System.out.print("Enter the amount in dollars: $");
        double amount = scanner.nextDouble();

        // Convert the amount times 100 for easier calculations
        int cents = (int) (amount * 100);

        // Calculate the number of quarters, dimes, nickels, and pennies
        int quarters = cents / 25;
        cents %= 25;

        int dimes = cents / 10;
        cents %= 10;

        int nickels = cents / 5;
        cents %= 5;

        int pennies = cents;

        // Display the result
        System.out.println("For $" + amount + ", you get:");
        System.out.println(quarters + " quarters");
        System.out.println(dimes + " dimes");
        System.out.println(nickels + " nickels");
        System.out.println(pennies + " pennies");

        scanner.close();
    }
}
