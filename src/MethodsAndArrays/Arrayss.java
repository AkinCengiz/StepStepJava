package MethodsAndArrays;

import java.util.Arrays;
import java.util.Scanner;

public class Arrayss {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Tanımlanacak dizinin boyutunu giriniz : ");
        int[] array1 = new int[scanner.nextInt()];

        for(int i = 0; i < array1.length;i++)
        {
            array1[i] = i * i;
        }
        getList(array1);
        System.out.println("\n*************************************\n");
        String[] months = {"Ocak","Şubat","Mart","Nisan","Mayıs","Haziran","Temmuz","Ağustos","Eylül","Ekim","Kasım"};
        System.out.print("Yılın kaçıncı ayı : ");
        getMonth(months,scanner.nextInt());

        /*
        * Kullanıcıdan kaç tane sayının ortalamasını bulmasını istediğini
        * sorun ve buna bağlı olarak aldıgınız değerleri bir dizide saklayın.
        * Veri alma işlemi bittikten sonra tüm sayıları ve ortalamasını ekrana
        * yazdırın.
        * */
        System.out.println("Ortalaması hesaplanacak sayı adedi : ");
        int[] numbers = new int[scanner.nextInt()];
        addListItem(numbers,scanner);
        getList(numbers);
        System.out.print("\nDizi elemanlarının ortalaması : " + averageCalculate(numbers));
        getList(reverseList(array1));
        //int copyArray = new int[array1.length];
        int[] copyArray = array1;
        System.out.println("\n**************************************************\n");
        getList(copyArray);

        copyArray = Arrays.copyOf(numbers,5);
        getList(copyArray);
        shuffleList(array1);
        getList(array1);

        getList(sortArrays(array1));
        sortArrays(array1);
        int searchItemIndex = binariesSearches(array1,36);
        if(searchItemIndex >= 0)
        {
            System.out.println("\nAranan eleman " + searchItemIndex + " sayılı indekste bulundu ");
        }else{
            System.out.println("Aranan numara dizide mevcut değil..." + searchItemIndex);
        }


    }
    static void getList(int[] arr)
    {
        System.out.print("\nDizinin elemanları : ");
        for(int i : arr)
        {
            System.out.print(i + " ");
        }
    }
    static void getMonth(String[] s, int i)
    {
        if(i == 0 || i > 12)
        {
            System.out.println("Hatalı giriş yaptınız...");
        }else {
            System.out.println(s[i-1]);
        }
    }
    static void addListItem(int[] arr,Scanner scanner)
    {
        for(int i = 0; i < arr.length; i++)
        {
            System.out.print((i+1) + ". elemanı giriniz : ");
            arr[i] = scanner.nextInt();
        }
    }
    static double averageCalculate(int[] arr)
    {
        int total =0;
        for(int i : arr)
        {
            total += i;
        }
        return (double) total / arr.length;
    }
    static int[] reverseList(int[] arr)
    {
        int[] result = new int[arr.length];
        for(int i = 0 , j = arr.length-1; i < arr.length-1; i++, j--)
        {
            result[i] = arr[j];
        }
        return result;
    }
    static int[] shuffleList(int[] arr)
    {
        int j;
        for(int i = arr.length-1; i > 0; i--)
        {
            j = (int)(Math.random() * (i+1));
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        return arr;
    }
    static int[] sortArrays(int[] arr)
    {
        for(int i = 0; i < arr.length-1; i++)
        {
            int minItemIndex = i;
            int minItem = arr[i];
            for(int j = i+1; j < arr.length; j++)
            {
                if(minItem > arr[j])
                {
                    minItem = arr[j];
                    minItemIndex = j;
                }
            }
            if(minItemIndex != i)
            {
                arr[minItemIndex] = arr[i];
                arr[i] = minItem;
            }
        }
        return arr;
    }

    static int binariesSearches(int[] arr, int i)
    {
        int minIndex = 0;
        int maxIndex = arr.length-1;
        //int originIndex = 0;
        while (minIndex <= maxIndex)
        {
            int originIndex = (maxIndex + minIndex) / 2;
            if(i < arr[originIndex])
            {
                maxIndex = originIndex - 1;
            }else if(i > arr[originIndex]){
                minIndex = originIndex + 1;
            }else
            {
                return originIndex;
            }
        }
        return minIndex-1;
    }
}
