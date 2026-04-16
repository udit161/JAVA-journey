import java.util.Scanner;

public class Advance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // double a, b, c;
        // System.out.println("Enter the coffecient of A , B :");
        // a = scanner.nextDouble();
        // b = scanner.nextDouble();

        // c = Math.sqrt(a * a + b * b);

        // // c= Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));

        // System.out.println("The Hypotenuse is :" + c);

        double radius;
        System.out.println("Enter the radius of the circle : : ");

        radius = scanner.nextDouble();

        double circumference, area, volume;
        System.out.println("Enter the radius of the circle : : ");

        radius = scanner.nextDouble();

        circumference = 2 * Math.PI * radius;
        area = Math.PI * Math.pow(radius, 2);
        volume = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);

        System.out.println("Circumference of the circle : " + circumference);
        System.out.println("Area of the circle : " + area);
        System.out.println("Volume of the sphere : " + volume);
        scanner.close();

    }

}
