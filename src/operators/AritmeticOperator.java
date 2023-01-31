package operators;

public class AritmeticOperator {
    public static void main(String[] args) {
        int number1 = 50;
        int number2 = 20;
        int result = number1 + number2;
        System.out.println("Sayı 1 : " + number1 + " + Sayı 2 : " + number2 + " = " + result);
        result = number1 - number2;
        System.out.println("Sayı 1 : " + number1 + " - Sayı 2 : " + number2 + " = " + result);
        result = number1 * number2;
        System.out.println("Sayı 1 : " + number1 + " * Sayı 2 : " + number2 + " = " + result);
        double result2 = number1 / number2;
        System.out.println("Sayı 1 : " + number1 + " / Sayı 2 : " + number2 + " = " + result2);
        result2 = (double)number1 / (double)number2;
        System.out.println("Sayı 1 : " + number1 + " / Sayı 2 : " + number2 + " = " + result2);


    }
}
