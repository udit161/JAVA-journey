
public class Main {
    public static void main(String[] args) {
        System.out.println(Math.PI);
        System.out.println(Math.E);

        double result;

        result = Math.pow(2, 3);
        System.out.println(result);

        result = Math.abs(-6);
        System.out.println(result);

        result = Math.sqrt(7.0);
        System.out.println(result);

        result = Math.ceil(3.14);
        // ceil rounds up to the nearest integer
        System.out.println(result);

        result = Math.floor(3.99);
        // floor rounds down to the nearest integer
        System.out.println(result);

        result = Math.max(2.99, 7.99);
        System.out.println(result);
        result = Math.min(2.99, 7.99);
        System.out.println(result);
    }
}
