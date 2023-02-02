package review;

import java.util.Scanner;

public class LargestCommonDivisor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("1. Sayıyı giriniz : ");
        int number1 = scanner.nextInt();
        System.out.print("2. Sayıyı giriniz : ");
        int number2 = scanner.nextInt();
        int smallNumber = (number1 < number2) ? number1 : number2;
        for (int i = smallNumber; i >= 1; i--)
        {
            if(number1 % i == 0 && number2 % i == 0)
            {
                System.out.println(number1 + " ile " + number2 + " sayılarının en büyük ortak böleni...\nEBOB(" + number1 + "," + number2 + ") = " + i);
                break;
            }
        }
    }
}
