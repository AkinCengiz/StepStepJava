package MethodsAndArrays;

import java.util.Scanner;

public class ThreeQuestionThreeAnswer {
    /*
    //SORU 1: 5*5 bir matris olusturun ve bu matrisin elemanları 0 - 9 arasında rastgele sayılar olsun.
    // Bu matrisi ekrana    yazdıran ve çapraz elemanların toplamını gösteren programı yazınız.

    //SORU 2: Decimal sayıları binary formatına çeviren java programını yazınız.
    //Program 30 sayısı için 1 1 1 1 0 çıktısını üretmeli, String kullanabilirsiniz.

    //SORU 3: küçük xlerle büyük X şekli çizen programı yazınız.

     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Satır sayısını giriniz :\t");
        int satirSutun = scanner.nextInt();
        if(satirSutun % 2 == 0)
        {
            satirSutun++;
        }


        int[][] matris = matrisOlustur(satirSutun);
        rastgeleMatrixDoldur(matris);
        matrisYazdir(matris);
        System.out.println("\n*************************************\n");
        kosegenDoldur(matris);
        System.out.println("\n*************************************\n");
        kosegenTopla(matris);
        String[][] stringMatris = stringMatrisOlustur(satirSutun);
        rastgeleMatrixDoldur(stringMatris);

        System.out.println("\n*************************************\n");
        kosegenDoldur(stringMatris);
        System.out.println("\n*************************************\n");



    }

    static void kosegenDoldur(int[][] arr)
    {
        for(int i = 0; i < arr.length; i++)
        {
            for (int j = 0; j < arr[i].length; j++)
            {
                if(i != j && ((i+j) != arr.length-1))
                {
                    System.out.print(" \t\t");
                }else
                {
                    System.out.print(arr[i][j] + "\t\t");
                }
            }
            System.out.println();
        }
    }
    static void kosegenDoldur(String[][] arr)
    {
        for(int i = 0; i < arr.length; i++)
        {
            for (int j = 0; j < arr[i].length; j++)
            {
                if(i != j && ((i+j) != arr.length-1))
                {
                    System.out.print(" \t\t");
                }else
                {
                    System.out.print(arr[i][j] + "\t\t");
                }
            }
            System.out.println();
        }
    }
    static void kosegenTopla(int[][] arr)
    {
        int birinciKosegen = 0;
        int ikinciKosegen = 0;
        for(int i = 0; i < arr.length; i++)
        {
            for (int j = 0; j < arr[i].length; j++)
            {
                if(i == j )
                {
                    birinciKosegen += arr[i][j];
                }
                if(((i+j) == arr.length-1))
                {
                    ikinciKosegen += arr[i][j];
                }
            }
        }
        System.out.println("Birinci köşegendeki sayıların toplamı :\t" + birinciKosegen);
        System.out.println("İkinci köşegendeki sayıların toplamı :\t" + ikinciKosegen);
    }

    static int[][] matrisOlustur(int a)
    {
        int[][] matrix = new int[a][a];
        return matrix;
    }
    static String[][] stringMatrisOlustur(int a)
    {
        String[][] matrix = new String[a][a];
        return matrix;
    }
    static void rastgeleMatrixDoldur(int[][] arr)
    {
        for(int i = 0; i < arr.length; i++)
        {
            for(int j = 0; j < arr[i].length; j++)
            {
                arr[i][j] = (int)(Math.random()*10);
            }
        }
    }
    static void rastgeleMatrixDoldur(String [][] arr)
    {
        for(int i = 0; i < arr.length; i++)
        {
            for(int j = 0; j < arr[i].length; j++)
            {
                arr[i][j] = "x";
            }
        }
    }
    static void matrisYazdir(int[][] arr)
    {
        for(int i = 0; i < arr.length; i++)
        {
            for(int j = 0; j < arr[i].length; j++)
            {
                System.out.print(arr[i][j] + "\t\t");
            }
            System.out.println();
        }
    }

}
