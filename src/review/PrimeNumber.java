package review;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isPrime = true;
        int counter = 0;
        System.out.print("Kaça kadar olan asal sayıları yazdırmak istiyorsunuz : ");
        int number = scanner.nextInt();
        for(int i = 2; i <= number; i++)
        {
            isPrime = true;
            if(i == 2 || i == 3)
            {
                System.out.print(i + ", ");
                counter++;
                continue;
            }
            for (int j = 2; j <= Math.sqrt(i); j++)
            {
                if(i % j == 0)
                {
                    isPrime = false;
                    break;
                }
            }
            if(isPrime)
            {
                System.out.print(i + ", ");
                counter++;
            }
        }
        System.out.println("\n" + number + " sayısına kadar olan asal sayıların sayısı = " + counter);
    }
}
