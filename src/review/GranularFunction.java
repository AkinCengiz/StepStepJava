package review;

import java.util.Scanner;

public class GranularFunction {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int result = 0;
        System.out.print("X değerini giriniz : ");
        int x = scanner.nextInt();
        System.out.print("Y değerini giriniz : ");
        int y = scanner.nextInt();

        if(x > 0 && y < 0)
        {
            result = 4 * x + 2 * y + 4;
            System.out.println("f(x,y) = 4x + 2y + 4");
            System.out.println("4x"+x+" + 2."+y+" + 4 = " + result);
        }else if(x > 0 && y == 0)
        {
            result = 2 * x - y + 3;
            System.out.println("f(x,y) = 2x - y + 3");
            System.out.println("2 . "+x+" - "+y+" + 3 = " + result);
        }else if(x > 0 && y > 0)
        {
            result = 3 * x + 2 * y - 2;
            System.out.println("f(x,y) = 3x + 2y - 4");
            System.out.println("3 . "+x+" + 2 . "+y+" - 2 = " + result);
        }
        else if(x < 0 && y < 0)
        {
            result = -3 * x - 2 * y -3;
            System.out.println("f(x,y) = -3x - 2y - 3");
            System.out.println("-3 . "+x+" - 2 . "+y+" - 3 = " + result);
        }
        else if(x < 0 && y == 0)
        {
            result = 3 * x + 7;
            System.out.println("f(x,y) = 3x + 7");
            System.out.println("3 . "+x+" + 7 = " + result);
        }
        else if(x < 0 && y > 0)
        {
            result = -5 * x + 4 * y - 5;
            System.out.println("f(x,y) = -5x + 4y - 5");
            System.out.println("-5 . "+x+" + 4 . "+y+" - 5 = " + result);
        }else if(x == 0 && y < 0)
        {
            result = -3 * y;
            System.out.println("f(x,y) = -3y");
            System.out.println("-3 . "+y+" = " + result);
        }else if (x == 0 && y > 0)
        {
            result = 5 * y - 4;
            System.out.println("f(x,y) = 5y - 4");
            System.out.println("5 . "+y+" - 4 = " + result);
        }else
        {
            result = 3;
            System.out.println("f(x,y) = 3");
            System.out.println(result);
        }
    }
}
