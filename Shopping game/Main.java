import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        // SHOPPING KART PROGRAM
        
        Scanner scanner = new Scanner(System.in);


        String item  ;
        double price;
        int quantity;
        char currency = '$';
        double totalCost = 0.0;

        System.out.println("WELCOME ! What items would you like to have ?: ");
        item = scanner.nextLine();
        System.out.println("what is the price for each ? :");
        price = scanner.nextDouble();
        System.out.println("How many would you like to have? :");
        quantity = scanner.nextInt();
        

        totalCost = price * quantity ;
        System.out.println("You have ordered " + quantity + " " + item + "(s) at " + currency + price + " each.");
        System.out.println("your total cost is " + currency + totalCost);

        scanner.close();
    }
}