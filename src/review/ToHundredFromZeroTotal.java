package review;

import java.util.Scanner;

public class ToHundredFromZeroTotal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Başlangıç sayısı\t: ");
        int startNumber = scanner.nextInt();
        System.out.print("Bitiş sayısı\t: ");
        int finishNumber = scanner.nextInt();
        int total = 0;
        for(int i = startNumber; i <= finishNumber; i++)
        {
            total += i;
        }
        System.out.println(startNumber + " dan " + finishNumber + " e kadar olan sayıların toplamı : " + total);
        total = 0;
        for(int i = 1; i <= 100; i++)
        {
            total += i;
        }
        System.out.println("0 dan 100 e kadar olan sayıların toplamı : " + total);
    }
}
