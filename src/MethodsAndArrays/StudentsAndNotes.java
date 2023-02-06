package MethodsAndArrays;

import java.sql.SQLOutput;
import java.util.Scanner;

public class StudentsAndNotes {
    public static void main(String[] args) {
        /*
            Kullanıcının girdiği öğrenci sayısı ve kullanıcının girdiği toplam soru sayısına bağlı olarak, öğrencilerin
            soruya verdiği cevapları tutan bir matris düzenleyin. Bu değerleri rastgele olarak olusturun.
            Değerler A,B,C,D,E olmalı.
            Bir de doğru cevapları tutan tek boyutlu bir diziniz olsun. Bu da rastgele oluşturulmalı.
            Sonrasında bu değerleri karşılaştırarak her bir öğrencinin kaç doğru ve yanlışı olduğunu gösteren programı yazınız.
         */

        Scanner scanner = new Scanner(System.in);
        System.out.print("Öğrenci sayısını giriniz\t: ");
        int studentAmount = scanner.nextInt();
        System.out.print("Soru sayısını giriniz\t: ");
        int questionAmount = scanner.nextInt();
        String [][] studentsAnswers = createStringMatrix(studentAmount,questionAmount);



        getArray(studentsAnswers);
        String[] answersList = new String[questionAmount];
        System.out.println("\n*****************************\n");
        arrayFill(answersList);
        getArray(answersList);
        System.out.println("\n");

        int[] trueAnswerList = trueAnswer(studentsAnswers,answersList);
        getArray(trueAnswerList);
        System.out.println("\n**************************************\n");
        getState(studentsAnswers,answersList,trueAnswerList);

        System.out.println("\n**************************************\n");
        System.out.println("\n**************************************\n");
        System.out.println("\n**************************************\n");

        char[][] studentAnswers2 = createMatrix(studentAmount,questionAmount);
        getArray(studentAnswers2);
        char[] answersList2 = new char[questionAmount];
        System.out.println("\n*****************************\n");
        arrayFill(answersList2);
        getArray(answersList2);
        System.out.println("\n");

        int[] trueAnswerList2 = trueAnswer(studentAnswers2,answersList2);
        getArray(trueAnswerList2);
        System.out.println("\n**************************************\n");
        getState(studentAnswers2,answersList2,trueAnswerList2);

    }

    static char[][] createMatrix(int a,int b)
    {
        char[][] matrix = new char[a][b];
        for(int i = 0; i < matrix.length; i++)
        {
            for(int j = 0; j < matrix[i].length; j++)
            {
                matrix[i][j] = choiceRandom();
            }
        }
        return matrix;
    }
    static String[][] createStringMatrix(int a,int b)
    {
        String[][] matrix = new String[a][b];
        for(int i = 0; i < matrix.length; i++)
        {
            for(int j = 0; j < matrix[i].length; j++)
            {
                matrix[i][j] = randomChoice();
            }
        }
        return matrix;
    }
    static String randomChoice()
    {
        int choice = (int) (Math.random() * 5);
        String letterChoise = "";
        switch (choice)
        {
            case 0:
                letterChoise = "A";
                break;
            case 1:
                letterChoise = "B";
                break;
            case 2:
                letterChoise = "C";
                break;
            case 3:
                letterChoise = "D";
                break;
            case 4:
                letterChoise = "E";
                break;
        }
        return letterChoise;
    }
    static char choiceRandom()
    {
        int randomNumber = (int) (Math.random() * 5) + 65;
        char choice = (char)randomNumber;
        return choice;
    }
    static void getArray(String[][] arr)
    {
        for (int i = 0; i < arr.length; i++)
        {
            for(int j = 0; j < arr[i].length; j++)
            {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
    }
    static void getArray(char[][] arr)
    {
        for (int i = 0; i < arr.length; i++)
        {
            for(int j = 0; j < arr[i].length; j++)
            {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
    }
    static void getArray(String[] arr)
    {
        for(String s : arr)
        {
            System.out.print(s + "\t");
        }
    }
    static void getArray(int[] arr)
    {
        for(int s : arr)
        {
            System.out.print(s + "\t");
        }
    }
    static void getArray(char[] arr)
    {
        for(char s : arr)
        {
            System.out.print(s + "\t");
        }
    }

    static void arrayFill(String[] arr)
    {
        for(int i = 0; i < arr.length; i++)
        {
            arr[i] = randomChoice();
        }
    }
    static void arrayFill(char[] arr)
    {
        for(int i = 0; i < arr.length; i++)
        {
            arr[i] = choiceRandom();
        }
    }

    static int[] trueAnswer(String[][] arr1, String[] arr2)
    {
        int total = 0;
        int[] results = new int[arr1.length];
        for(int i = 0; i < arr1.length; i++)
        {
            total=0;

            for( int j = 0; j < arr1[i].length; j++)
            {
                if(arr1[i][j] == arr2[j])
                {
                    total++;
                }

            }
            results[i] = total;
        }
        return results;
    }
    static int[] trueAnswer(char[][] arr1, char[] arr2)
    {
        int total = 0;
        int[] results = new int[arr1.length];
        for(int i = 0; i < arr1.length; i++)
        {
            total=0;

            for( int j = 0; j < arr1[i].length; j++)
            {
                if(arr1[i][j] == arr2[j])
                {
                    total++;
                }

            }
            results[i] = total;
        }
        return results;
    }

    static void getState(String[][] array1, String[] array2, int[] array3)
    {
        String student = "";
        String note = "";
        int trueAmount = 0;

        for(int i = 0; i < array1.length; i++)
        {
            System.out.println((i + 1) + ". Öğrencinin cevapları : ");
            for(int j = 0; j < array1[i].length; j++)
            {
                System.out.print((j + 1) + ". cevap : " + array1[i][j] + "\t");
            }
            System.out.print("\n");
            for(int j = 0; j < array1[i].length; j++)
            {
                System.out.print((j + 1) + ". doğru : " + array2[j] + "\t");
            }
            System.out.println();
            System.out.println((i + 1) + ". Öğrencinin doğru cevap sayısı : " + array3[i]);
            System.out.println("\n==========================================================\n");
        }
    }
    static void getState(char[][] array1, char[] array2, int[] array3)
    {
        String student = "";
        String note = "";
        int trueAmount = 0;

        for(int i = 0; i < array1.length; i++)
        {
            System.out.println((i + 1) + ". Öğrencinin cevapları : ");
            for(int j = 0; j < array1[i].length; j++)
            {
                System.out.print((j + 1) + ". cevap : " + array1[i][j] + "\t");
            }
            System.out.print("\n");
            for(int j = 0; j < array1[i].length; j++)
            {
                System.out.print((j + 1) + ". doğru : " + array2[j] + "\t");
            }
            System.out.println();
            System.out.println((i + 1) + ". Öğrencinin doğru cevap sayısı : " + array3[i]);
            System.out.println("\n==========================================================\n");
        }
    }
}
