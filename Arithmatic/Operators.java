public class Operators{
    public static void main(String[] args) {

        // ARITHMATIC OPERATORS

        int x = 10;
        int y = 5;
        int z;

        z= x + y;

        System.out.println("The addition of x and y is :" + z);

        int a = 20;
        int b = 10;

        int c;
        int d;
        int f;
        c= a - b;
        d= a * b;
        f= a / b;

        // % modulus operator is used for remainder in divisior and for checkinf the given number is even or not

        System.out.println(c);
        System.out.println(d);
        System.out.println(f);


      // ARGUEMENTED assignment operators 
      int m = 15;
      int n = 3;
      m += n;  // m = m + n
      System.out.println(m);
      m -= n;
      System.out.println(m);
      m *= n;
      System.out.println(m);
      m /= n;
      System.out.println(m);

      // INCREAMENT AND DECREAMENT OPERATORS :


      int p = 10;
      int q = 10;
      p++;  // p = p + 1
      q--;  // q = q - 1

      System.out.println(p);
      System.out.println(q);

      
      // ORDER OF OPERATIONS [P-E-M-D-A-S]


      double result = 3 + 4 * (7-5) / 2.0;
      System.out.println(result);

    }
}