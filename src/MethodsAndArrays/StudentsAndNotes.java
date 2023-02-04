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
        String [][] studentsAnswers = new String[questionAmount][questionAmount];

        for(int i = 0; i < studentsAnswers.length; i++)
        {
            for (int j = 0; j < studentsAnswers[i].length; j++)
            {
                studentsAnswers[i][j] = randomChoice();
            }
        }
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

    static void arrayFill(String[] arr)
    {
        for(int i = 0; i < arr.length; i++)
        {
            arr[i] = randomChoice();
        }
    }

    static int[] trueAnswer(String[][] arr1, String[] arr2)
    {
        int total = 0;
        int[] results = new int[arr2.length];
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
}
