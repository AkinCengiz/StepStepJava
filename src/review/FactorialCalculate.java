package review;

import java.util.Scanner;

public class FactorialCalculate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Faktöriyeli hesaplanacak sayıyı giriniz : ");
        int number = scanner.nextInt();
        int result = 1;
        for(int i = 2; i <= number; i++)
        {
            result *=i;
        }

        System.out.println(number + " sayısının faktörüyeli = " + result);
    }
}
