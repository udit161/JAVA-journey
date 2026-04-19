package NestedStatements;

public class Main {
    public static void main(String[] args) {
        boolean isStudent = true;
        boolean isSenior = false;
        double price = 10.0;

        if (isStudent) {
            System.out.println("You get a student's discount!");
            price = price - 2.0;
        } else {

            if (isSenior) {
                System.out.println("You get a senior's discount!");
                price = price - 3.0;
            } else {
                System.out.println("You do not get a discount.");
                price = price - 1.0;
            }
        }

        System.out.println("Your final price is: $" + price);
    }
}