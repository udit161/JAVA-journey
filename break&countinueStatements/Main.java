public class Main {
    public static void main(String[] args) {

        // break = stop
        // countinue = Skip current iteration
        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                continue;
            }
            System.out.println(i);
        }
    }
}