public class Main2 {

    public static void main(String[] args) {
        // overloaded methods = methods that share the same name, but diffrent
        // parameters
        // signature = name + parameters

        String pizza = bakePizza("Flat bread");
        System.out.println(pizza);

    }

    static String bakePizza(String bread) {

        return bread + "pizza";

    }

}
