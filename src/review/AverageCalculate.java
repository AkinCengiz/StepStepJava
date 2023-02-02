package review;

import java.util.Scanner;

public class AverageCalculate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ortalaması alınacak 1. sayı : ");
        int total = scanner.nextInt();
        System.out.print("Ortalaması alınacak 2. sayı : ");
        total += scanner.nextInt();
        System.out.print("Ortalaması alınacak 3. sayı : ");
        total += scanner.nextInt();

        double average = (double)total / 3.0;
        System.out.println("Üç sayının toplamı\t\t: " + total + "\nÜç sayının ortalaması\t: " + average);
    }
}
