package review;

import java.util.Scanner;

public class LoopsFiveNames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("İsminizi giriniz : ");
        String name = scanner.nextLine();
        for(int i = 1; i <= 5; i++)
        {
            System.out.println("For dongusu " + i + " " + name);
        }
        System.out.println("***************************************");
        int counter = 1;
        while (true)
        {
            if(counter == 6)
            {
                break;
            }
            System.out.println("While dongusu " + counter + " " + name);
            counter++;
        }
        System.out.println("***************************************");
        counter = 1;
        do{
            System.out.println("Do While dongusu " + counter + " " + name);
            counter++;
        }while (counter <=5);
        System.out.println("***************************************");
    }
}
