package review;

import java.util.Scanner;

public class HotCold {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int randomNumber = (int)(Math.random() * 100) + 1;
        int number = 0;
        int counter = 0;
        while (true)
        {
            System.out.print("Sayı tahmininizi giriniz : ");
            number = scanner.nextInt();
            counter++;
            if(number < randomNumber)
            {
                System.out.println("Daha büyük bir sayı giriniz...");
            }else if(number > randomNumber)
            {
                System.out.println("Daha küçük bir sayı giriniz...");
            }else {
                System.out.println("Tebrikler....\nTahmininiz\t: " + number + "\nSeçilen\t:" + randomNumber);
                System.out.println("Toplam : " + counter + " sayıda tahminde bulundunuz...");
                break;
            }
        }
    }
}
