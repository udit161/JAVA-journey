public class Main {
    public static void main(String[] args) {
        // && AND logical operator
        double temp = 20;
        boolean isSunny = false;

        if (temp <= 30 && temp >= 0 && isSunny) {
            System.out.println(" the weather is good");
            System.out.println("all the condition satisfied");
            // ! NOT logical operator
        } else if (temp <= 30 && temp >= 0 && !isSunny) {
            System.out.println(" the weather is good");
            System.out.println("it is cloudy");
            // || OR operator
        } else if (temp > 30 || temp < 0) {
            System.out.println("The weather is bad");

        }
    }
}