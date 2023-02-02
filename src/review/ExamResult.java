package review;

import java.util.Scanner;

public class ExamResult {
    public static void main(String[] args) {
        int midtermNote, finalNote;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Vize sınavı notunu giriniz\t: ");
        midtermNote = scanner.nextInt();
        System.out.print("Final sınavı notunu giriniz\t: ");
        finalNote = scanner.nextInt();

        double result = (double)midtermNote * 0.4 + (double) finalNote * 0.6;

        System.out.println("Vize ve final sınavları sonucunda not ortalamanız : " + result);
        if(result >= 60)
        {
            System.out.println("Tebrikler dersi geçtiniz. Notunuz : " + result);
        }else {
            System.out.println("Üzgünüm dersi geçemediniz. Notunuz : " + result);
        }
    }
}
