import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double weight;
        double newWeight;
        int choice;

        System.out.println("Weight Conversion Program ");
        System.out.println("1: Convert lbs to kgs");
        System.out.println("2: Convert kgs to lbs :");

        System.out.println("Enter your choice (1 or 2):");

        choice = sc.nextInt();

        if (choice == 1) {
            System.out.println("Enter weight in lbs :");
            weight = sc.nextDouble();
            newWeight = weight * 0.453592;
            System.out.println("Weight in Kgs" + newWeight);
        } else if (choice == 2) {
            System.out.println("Enter the weight in kgs :");
            weight = sc.nextDouble();
            newWeight = weight * 2.20462;
            System.out.println("Weight in lbs :" + newWeight);
        } else {
            System.out.println("Invalid choice");
        }

        sc.close();

    }
}
