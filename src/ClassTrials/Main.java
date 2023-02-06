package ClassTrials;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Circle circle = new Circle();
        System.out.print("Çemberin yarıçap uzunluğunu giriniz : ");
        double radius = scanner.nextDouble();
        circle.setRadius(radius);


        double area = circle.areaCalculate();
        double perimeter = circle.perimeterCalculate();
        System.out.println("Yarıçap uzunuluğu : " + circle.getRadius() + " birim olan çemberin alanı\t: " + area + " birim karedir...");
        System.out.println("Yarıçap uzunuluğu : " + circle.getRadius() + " birim olan çemberin çevresi\t: " + perimeter + " birimdir...");
    }
}
