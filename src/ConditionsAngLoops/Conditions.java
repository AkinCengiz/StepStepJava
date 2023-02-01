package ConditionsAngLoops;

import java.util.Scanner;

public class Conditions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("***************IF - ELSE IF - ELSE***************");
        System.out.print("Karşılaştırılacak birinci sayıyı giriniz\t: ");
        int number1 = scanner.nextInt();
        System.out.print("Karşılaştırılacak ikinci sayıyı giriniz\t\t: ");
        int number2 = scanner.nextInt();

        if(number1 >number2){
            System.out.println("Sayı 1 : " + number1 + "\nSayı 2 : " + number2);
            System.out.println(number1 + " > " + number2);
        }else if(number1 < number2){
            System.out.println("Sayı 1 : " + number1 + "\nSayı 2 : " + number2);
            System.out.println(number1 + " < " + number2);
        }else{
            System.out.println("Sayı 1 : " + number1 + "\nSayı 2 : " + number2);
            System.out.println(number1 + " = " + number2);
        }

        System.out.println("***************TERNARY OPERATOR***************");
        int a =10, b =8, c;
        c = (a > b) ? (a - b) : (a + b);
        System.out.println("Int a\t: " + a + ", Int b\t: " + b + ",\tInt c;");
        System.out.println("c = (a > b) ? (a - b) : (a + b)");
        System.out.println("c = " + c);

        System.out.println("***************TERNARY OPERATOR***************");
        System.out.print("Haftanın kaçıncı günü : ");
        int day = scanner.nextInt();
        switch (day){
            case 1 :
                System.out.println("Pazartesi");
                break;
            case 2 :
                System.out.println("Salı");
                break;
            case 3:
                System.out.println("Çarşamba");
                break;
            case 4:
                System.out.println("Perşembe");
                break;
            case 5:
                System.out.println("Cuma");
                break;
            case 6:
                System.out.println("Cumartesi");
                break;
            case 7:
                System.out.println("Pazar");
                break;
        }
    }
}
