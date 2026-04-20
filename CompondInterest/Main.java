
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double principal;
        double rate;
        double time;
        double amount;
        double compoundInterest;

        System.out.println(" Compound Interest Calculator ");

        System.out.print("Enter the principal amount: ");
        principal = sc.nextDouble();

        System.out.print("Enter the annual rate of interest (in %): ");
        rate = sc.nextDouble() / 100;

        System.out.print("Enter the time period (in years): ");
        time = sc.nextDouble();
        amount = principal * Math.pow((1 + rate), time);
        compoundInterest = amount - principal;

        System.out.println("\nResults:");
        System.out.printf("Total Amount: %.2f\n", amount);
        System.out.printf("Compound Interest: %.2f\n", compoundInterest);

        sc.close();
    }
}
