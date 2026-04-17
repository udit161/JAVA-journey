public class Main {
    public static void main(String[] args) {
        // printf is an alternative of println

        String name = "Spongebob";
        char firstletter = 'S';
        int age = 30;
        double height = 60.5;
        boolean isEmployed = true;

        System.out.printf("Hello %s\n", name);
        System.out.printf("Your name starts with letter %c\n", firstletter);
        System.out.printf("You are %d years old\n ", age);
        System.out.printf("You are %f cm tall.\n", height);
        System.out.printf("Employed: %b\n", isEmployed);

        System.out.printf("%s is %d years old\n", name, age);

        // PRECISION:

        double price1 = 9.99;
        double price2 = 100.15;
        double price3 = -54.15;

        System.out.printf("%.1f\n", price1);
        System.out.printf("%.2f\n", price2);
        System.out.printf("%.1f\n", price3);

    }

}
