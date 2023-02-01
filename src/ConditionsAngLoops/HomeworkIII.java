package ConditionsAngLoops;

import java.util.Scanner;

public class HomeworkIII {
    public static void main(String[] args) {
        System.out.println("********************HOMEWORK I********************");
        Scanner scanner = new Scanner(System.in);
        double mass, length, bodyMassIndex;

        System.out.print("Kütlenizi giriniz - (kg)\t: ");
        mass = scanner.nextDouble();
        System.out.print("Boyunuzu giriniz - (m)\t: ");
        length = scanner.nextDouble();
        bodyMassIndex = mass / Math.pow(length,2);
        if(bodyMassIndex < 15)
        {
            System.out.println("Çok ciddi derece düşük kilolu..." + bodyMassIndex);
        }else if(bodyMassIndex < 16)
        {
            System.out.println("Ciddi derecede düşük kilolu..." + bodyMassIndex);
        }else if(bodyMassIndex < 18.5)
        {
            System.out.println("Düşük kilolu..." + bodyMassIndex);
        }else if(bodyMassIndex < 25)
        {
            System.out.println("Normal kilolu - SAĞLIKLI..." + bodyMassIndex);
        }else if(bodyMassIndex < 30)
        {
            System.out.println("Fazla kilolu..." + bodyMassIndex);
        }else if(bodyMassIndex < 35)
        {
            System.out.println("1. derece OBEZ..." + bodyMassIndex);
        }else if(bodyMassIndex <  40)
        {
            System.out.println("2. derece ODEZ..." + bodyMassIndex);
        }else
        {
            System.out.println("3. derece OBEZ..." + bodyMassIndex);
        }

        System.out.println("********************HOMEWORK II********************");
        int randomNumber = (int)(Math.random() * 100);
        System.out.println(randomNumber);
        System.out.print("Tahmininizi giriniz : ");
        int number = scanner.nextInt();
        if(number == randomNumber)
        {
            System.out.println("Tebrikler kazandınız. Ödülünüz 10.000 TL...");
        }else if((randomNumber%10 == number/10) && (number % 10 == randomNumber / 10))
        {
            System.out.println("Tebrikler kazandınız. Ödülünüz 5.000 TL...");
        }else if((randomNumber%10 == number%10) || (number / 10 == randomNumber / 10))
        {
            System.out.println("Tebrikler kazandınız. Ödülünüz 1.000 TL...");
        }else
        {
            System.out.println("Üzgünüm kaybettiniz...");
        }



    }
}
