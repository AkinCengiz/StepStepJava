package review;

import java.util.Scanner;

public class TriangleType {
    public static void main(String[] args) {
        int lineA, lineB, lineC;
        Scanner scanner = new Scanner(System.in);
        System.out.print("A kenar uzunluğunu giriniz : ");
        lineA = scanner.nextInt();
        System.out.print("B kenar uzunluğunu giriniz : ");
        lineB = scanner.nextInt();
        System.out.print("C kenar uzunluğunu giriniz : ");
        lineC = scanner.nextInt();

        if(lineA == lineB && lineA == lineC)
        {
            System.out.println("Kenar uzunlukları girilen üçgen EŞ KENAR üçgendir...");
        }else if(lineA == lineB || lineA == lineC || lineB == lineC)
        {
            System.out.println("Kenar uzunlukları girilen üçgen İKİZ KENAR üçgendir...");
        }else
        {
            System.out.println("Kenar uzunlukları girilen üçgen ÇEŞİT KENAR üçgendir...");
        }
    }

}
