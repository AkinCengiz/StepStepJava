package review;

import java.util.Scanner;

public class MultiplayLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int result = 1;
        int number = 0;
        int counter = 0;
        while (true)
        {
            System.out.print("Çarpan giriniz : ");
            number = scanner.nextInt();
            if(number == 0)
            {
                System.out.println("Girilen " + counter + " sayının çarpımı : " + result);
                break;
            }
            result *= number;
            counter++;
        }
    }
}
