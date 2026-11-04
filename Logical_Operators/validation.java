import java.util.Scanner;

public class validation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String username;
        System.out.print("Enter your username: ");
        username = scanner.nextLine();

        if (username.length() < 4 || username.length() > 12) {
            System.out.println("Invalid username");
            System.out.println("Username must be between 4 and 12 characters long");
        }
        else if (username.contains(" ") || username.contains("_")) {
            System.out.println("invalid");
        }
        else {
            System.out.println("welcome " + username);
        }

        scanner.close();
    }
}
