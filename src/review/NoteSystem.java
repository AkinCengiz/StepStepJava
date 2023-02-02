package review;

import java.util.Scanner;

public class NoteSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Not ortalamasını giriniz : ");
        int note = scanner.nextInt();
        switch (note)
        {
            case 100, 99, 98, 97, 96, 95, 94, 93, 92, 91, 90 :
                System.out.println("Notunuz\t\t\t: " + note + "\nHarf Karşılığı\t: AA");
                break;
            case 89,88,87,86,85,84,83,82,81,80:
                System.out.println("Notunuz\t\t\t: " + note + "\nHarf Karşılığı\t: BA");
                break;
            case 79,78,77,76,75,74,73,72,71,70:
                System.out.println("Notunuz\t\t\t: " + note + "\nHarf Karşılığı\t: BB");
                break;
            case 69,68,67,66,65,64,63,62,61,60:
                System.out.println("Notunuz\t\t\t: " + note + "\nHarf Karşılığı\t: CB");
                break;
            case 59,58,57,56,55,54,53,52,51,50:
                System.out.println("Notunuz\t\t\t: " + note + "\nHarf Karşılığı\t: CC");
                break;
            default:
                System.out.println("Notunuz\t\t\t: " + note + "\nHarf Karşılığı\t: DC");
                break;
        }
    }
}
