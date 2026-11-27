import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // array = a collection of values of the same data type
        // * think of it as a variable that can store more than 1 value*

        String[] fruits = { "apple", "orange", "banana", "kiwi", "coconut" };

        fruits[0] = "pineapple";
        int numOfFruits = fruits.length;

        Arrays.sort(fruits);
        Arrays.fill(fruits, "dragonfruit");

        System.out.println(numOfFruits);

        for (int i = 0; i < fruits.length; i++) {
            System.out.print(fruits[i] + " ");

        }
        // Enhanced for loop
        for (String fruit : fruits) {
            System.out.println(fruit);

        }

    }
}