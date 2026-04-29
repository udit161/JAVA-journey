package TempratureCovertor;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double temp;
        double newTemp;
        String unit;

        System.out.println("ENTER THE TEMPRATURE: ");
        temp = sc.nextDouble();

        System.out.println("Convert to Celcius or Fahrenhite: ");
        unit = sc.next().toUpperCase();

        newTemp = (unit.equals("C")) ? (temp - 32) * 5/9 : (temp * 9/5 + 32);

        System.out.println(newTemp + unit);

        sc.close();

    }
}
