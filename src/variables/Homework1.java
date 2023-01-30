package variables;

public class Homework1 {
    public static void main(String[] args) {
        //HOMEWORK I
        String stringVariable = "150";
        int intDegisken = Integer.parseInt(stringVariable);
        int intDegisken2 = Integer.valueOf(stringVariable);

        System.out.println("intDegisken Değeri\t\t: " + intDegisken);
        System.out.println("intDegisken2 Değeri\t\t: " + intDegisken2);
        stringVariable = String.valueOf(intDegisken);
        System.out.println("stringVariable Değeri\t: " + stringVariable);
        System.out.println("*******************************");

        //HOMEWORK II
        int number1 = 5 / 3;
        float number2 = 5f / 3f;
        double number3 = 5d / 3d;
        int number4 = 8;
        int number5 = 3;
        float number6 =8f;
        float number7 = 3f;

        System.out.println("number1\t: " + number1);
        System.out.println("number2\t: " + number2);
        System.out.println("number3\t: " + number3);
        System.out.println("number4 / number5\t: " + number4 / number5);
        System.out.println("number4 / number7\t: " + number4 / number7);
        System.out.println("number6 / number7\t: " + number6 / number7);
        System.out.println("number4 / number5\t: " + number6 / number5);
        System.out.println("*******************************");

        //HOMEWORK III
        System.out.println(1.0 - 0.1 - 0.1 - 0.1 - 0.1 - 0.1);
        System.out.println(1.0 - 0.9);
        System.out.println("*******************************");

        //HOMEWORK IV
        int intNumber1 = 1, intNumber2 = 2;
        double average = (intNumber1 + intNumber2) / 2;
        double average2 = (intNumber1 + intNumber2) / 2.0;
        System.out.println("Average \t: " + average);
        System.out.println("Average2\t: " + average2);
        System.out.println("*******************************");
    }
}
