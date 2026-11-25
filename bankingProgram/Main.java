import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        // Java banking program for beginner
        // Declare Variables
        double balance = 600;
        boolean isRunning = true;
        int choice;

        while (isRunning) {
            // Display menu
            System.out.println("**************");
            System.out.println("BANKING Program");
            System.out.println("**************");
            System.out.println("1. Show Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. EXIT ");
            System.out.println("*************");

            System.out.print("Enter your choice 1-4: ");
            // Get and process users choice
            choice = scanner.nextInt();

            switch (choice) {
                case 1 -> showBalance(balance);
                case 2 -> balance += deposit();
                case 3 -> balance -= withdraw(balance);
                case 4 -> isRunning = false;
                default -> System.out.println("Invalid choice");
            }
        }

        System.out.println("******************************");
        System.out.println("Thank you! Have a nice day!");
        System.out.println("******************************");

        scanner.close();
    }

    // ShowBalance()
    static void showBalance(double balance) {
        System.out.println("******************************");
        System.out.printf("$%.2f\n", balance);
    }

    // Deposit()
    static double deposit() {
        double amount;
        System.out.println("******************************");
        System.out.print("Enter an amount to deposit: ");
        amount = scanner.nextDouble();

        if (amount < 0) {
            System.out.println("Amount can't be negative");
            return 0;
        }
        return amount;
    }

    // Withdraw()
    static double withdraw(double balance) {
        double amount;
        System.out.println("******************************");
        System.out.print("Enter an amount to withdraw: ");
        amount = scanner.nextDouble();

        if (amount > balance) {
            System.out.println("INSUFFICIENT FUNDS");
            return 0;
        } else if (amount < 0) {
            System.out.println("Amount can't be negative");
            return 0;
        }
        return amount;
    }
}
