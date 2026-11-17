public class main {
    public static void main(String[] args) {
        // method = a block of resuable code that is executed when called ()

        String name = "Bro";
        int age = 25;
        happyBirthday(name, age);
    }

    static void happyBirthday(String name, int age) {
        System.out.println("Happy Birthday to you");
        System.out.printf("Happy Birthday to %s\n", name);
        System.out.println("Happy Birthday to you");
        System.out.println("Happy Birthday to you");
    }
}