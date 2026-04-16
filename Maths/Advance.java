import java.util.Scanner;

public class Advance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double a, b, c;
        System.out.println("Enter the coffecient of A , B :");
        a = scanner.nextDouble();
        b = scanner.nextDouble();

        c = Math.sqrt(a * a + b * b);

        // c= Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));

        System.out.println("The Hypotenuse is :" + c);

        scanner.close();

    }

}
