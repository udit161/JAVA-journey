import java.util.Scanner;

public class If_Statements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        if (age >= 18) {
            System.out.println("You are eligible to vote");
        } else if (age < 0) {
            System.out.println("Invalid age");
        } else if (age < 18) {
            System.out.println("You are a Minor");
        } else if (age == 0) {
            System.out.println("You are not born yet");
        } else {
            System.out.println("You are not eligible to vote");
        }
        scanner.close();
    }
}