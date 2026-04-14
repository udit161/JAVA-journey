import java.util.Scanner;

public class User_input {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Your Name:");
        String name = scanner.nextLine();

        System.out.println("Enter your age: ");
        int age = scanner.nextInt();

        System.out.println("enter your cgpa:");
        double cgpa = scanner.nextDouble();
        
        System.out.println("Are you a student? (true/false): ");
        boolean isStudent = scanner.nextBoolean();


        System.out.println("Hello, " + name + "!");
        System.out.println("You are " + age + " years old.");
        System.out.println("Your CGPA is " + cgpa + ".");
        System.out.println("are you a studdent ?" + isStudent );


        scanner.close();

    }
    
}
