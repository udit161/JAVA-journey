import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // loop that execute certain amt of times
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter how many times you want to loop: ");
        int max = scanner.nextInt();
        for (int i = 0; i < max; i++) {
            System.out.println(i);

            scanner.close();

        }

    }

}
