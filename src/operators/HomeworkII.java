package operators;

import java.util.Scanner;

public class HomeworkII {
    public static void main(String[] args) {
        //HOMEWORK - I
        System.out.println("====================HOMEWORK - I====================");
        int number1 = 15, number2 = 5;
        int result = 0;

        result = (number1 + number2 * 2 - number2)  + number2 - number1 * 4 + number1;
        System.out.println("Sonuç : " + result);
        result = (number1 * number2 + 4 / 2) + number1++ * number2 + number1;
        System.out.println("Sonuç : " + result);

        System.out.println("====================HOMEWORK - II====================");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Hesaplanacak saniyeyi giriniz : ");
        int second = scanner.nextInt();
        int minute = 0, lastSecond = 0;
        minute = second / 60;
        lastSecond = second % 60;

        System.out.println(second + " saniye : " + minute + " dakika " + lastSecond + " saniyeye eşittir...");
        /*
            Bir double değişken oluşturun ve bu değişkende fahrenheit cinsinden sıcaklığı
            saklayın.
            Sonrasında bu değerin kaç Celcius olduğunu hesaplayın.
            100 değeri için 37.777778 gibi bir değer elde etmelisiniz.
            Hesaplama formülü : celcius = 5/9 * (fahrenheit -32)
        */

        System.out.println("====================HOMEWORK - III====================");
        System.out.print("Dereceye çevrilecek fahrenheit değerini giriniz : ");
        double fahrenheit = scanner.nextDouble();
        double celcius = 5.0 / 9.0 * (fahrenheit - 32);
        System.out.println(fahrenheit + " fahrenheit = " + celcius + " celsius...");

        /*
            Bir yıl değerinin artık yıl olup olmadığını hesaplayın
            Bir yılın artık olması için ya 400 ile modu 0 olmalı yada 4 ile modu 0 olmalı
            e 100 ile modu 0 olmamalı
            4100 false değer vermeli.
         */
        System.out.println("====================HOMEWORK - IV====================");
        System.out.print("Artık olup olmadığı sorgulanacak yılı giriniz : ");
        int year = scanner.nextInt();
        if((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0))
        {
            System.out.println(year + " yılı artık bir yıldır...");
        }
        else {
            System.out.println(year + " yılı artık bir yıl değildir...");
        }
    }
}
