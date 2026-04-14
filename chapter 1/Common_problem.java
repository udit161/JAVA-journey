import java.util.Scanner;

public class Common_problem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("ENter your age:");
        int age = scanner.nextInt();
        System.out.println("Your age is: " + age);

        System.out.println("Enter your name:");
        scanner.nextLine(); // Consume the leftover newline
        String name = scanner.nextLine();
        System.out.println("Your name is: " + name);

       
        scanner.close();
    }
    
}
