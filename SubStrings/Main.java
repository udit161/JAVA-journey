import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // String email = "Udit123@gmail.com";
        // String username = email.substring(0, email.indexOf("@"));
        // System.out.println(username);
        // String domain = email.substring(email.indexOf("@") + 1);
        // System.out.println(domain);
        Scanner src = new Scanner(System.in);
        String email;
        String username;
        String domain;

        System.out.println("Enter your email address: ");
        if (email.contains("@")) {
            email = src.nextLine();
            username = email.substring(0, email.indexOf("@"));
            domain = email.substring(email.indexOf("@") + 1);

            System.out.println("Username: " + username);
            System.out.println("Domain: " + domain);
        } else {
            System.out.println("Invalid email address");
        }

        src.close();

    }

}
