package MethodsAndArrays;

import java.util.Scanner;
import java.util.Stack;

public class Questions {
    public static void main(String[] args) {
        /*
        QUESTION I
        100 elemanlı bir dizi oluşturun ve bu dizinin tüm elemanlarını
        rastgele olacak şekilde üretin. Bu işlemden sonra dizideki
        elemanların ortalamasını hesaplayarak bu ortalamanın altında kaç
        tane eleman olduğunu yazdırın.
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("====================QUESTION I====================");
        int[] hundredItems = new int[100];
        for(int i = 0; i < hundredItems.length; i++)
        {
            hundredItems[i] = (int) (Math.random() * 10 + 1);
        }
        getItems(hundredItems);
        System.out.println("\n*************************************************\n");
        System.out.println("Dizinin elemanlarının ortalaması : " + averageItems(hundredItems));
        System.out.println("Ortalamanın altında kalan dizi elemanlarının sayısı : " + belowAverageItemsAmount(hundredItems,averageItems(hundredItems)));

        /*
        QUESTION II
        Her bir elemanı rastgele oluşturulmuş 3*2lik bir matriste bulunan
        sayıların toplamını yazdıran program yazınız.Ayrıca bu matriste yer
        alan en küçük ve en büyük sayıyı da mesaj olarak göstersin


         */

        System.out.println("\n====================QUESTION II====================");

        int[][] matrix = createMatrix(2,3);
        getMatrix(matrix);
        System.out.println("\nMatrisin en küçük elemanının değeri : " + minItemMatrix(matrix));
        System.out.println("\nMatrisin en büyük elemanının değeri : " + maxItemMatrix(matrix));


        /*
        QUESTION III
        Iskambil destesini diziler ile olusturun. Sonrasında bu destedeki
        elemanları karıştırın ve de ilk kullanıcıya hangi 4 kartın geldiğini
        ekrana yazdırın.

         */
        System.out.println("\n====================QUESTION III====================");
        String[][] deckOfCards = {
                {"Maça AS","Maça 2","Maça 3","Maça 4","Maça 5","Maça 6","Maça 7","Maça 8","Maça 9","Maça 10","Maça J","Maça Q","Maça R"},
                {"Karo AS","Karo 2","Karo 3","Karo 4","Karo 5","Karo 6","Karo 7","Karo 8","Karo 9","Karo 10","Karo J","Karo Q","Karo R"},
                {"Kupa AS","Kupa 2","Kupa 3","Kupa 4","Kupa 5","Kupa 6","Kupa 7","Kupa 8","Kupa 9","Kupa 10","Kupa J","Kupa Q","Kupa R"},
                {"Sinek AS","Sinek 2","Sinek 3","Sinek 4","Sinek 5","Sinek 6","Sinek 7","Sinek 8","Sinek 9","Sinek 10","Sinek J","Sinek Q","Sinek R"}
        };

        String[][] cards = shuffleTheCards(deckOfCards);
        getMatrix(cards);
        System.out.println("\n******************************Kartlar 1'er 1'er dağıtılırsa********************************** ");
        getMatrix(distributeCard(cards,4,4,true),"Oyuncu");
        System.out.println("\n******************************Kartlar Eldeki Kart Sayısı Miktarınca Dağıtılırsa********************************** ");
        getMatrix(distributeCard(cards,4,4,false),"Oyuncu");

        /*
        QUESTION IV
        Ekok(s1,s2) * ebob(s1,s2) = (s1*s2); buna uygun olacak şekilde

         */
        System.out.print("En büyük ortak böleni bulunacak 1. sayı : ");
        int number1 = scanner.nextInt();
        System.out.print("En büyük ortak böleni bulunacak 2. sayı : ");
        int number2 = scanner.nextInt();

        System.out.println(number1 + " ile " + number2 + " sayılarının EBOB("+number1+","+number2+") = " + largestCommonDivisor(number1,number2));

        System.out.println("*****************************************************************************************");


        System.out.println(number1 + " ile " + number2 + " sayılarının EKOK("+number1+","+number2+") = " + smallestMultiplication(number1,number2));
        System.out.println("*************************************************");
        System.out.println(number1 + " ile " + number2 + " sayılarının EKOK("+number1+","+number2+") = " + smallMultiplicationWithEBOB(number1,number2));

    }

    static int smallMultiplicationWithEBOB(int a, int b)
    {
        return a * b / largestCommonDivisor(a,b);
    }

    static int smallestMultiplication(int a , int b)
    {
        int division = 2;
        int result = 1;

        while (true)
        {
            if(a == 1 && b == 1)
            {
                break;
            }
            if(a % division == 0 && b % division == 0)
            {
                a /= division;
                b /= division;

                result *= division;
            } else if (a % division == 0 && b % division != 0) {
                a /= division;
                result *= division;
            }else if(a % division != 0 && b % division == 0){
                b /= division;
                result *= division;
            }else{
                division++;
            }
        }
        return result;
    }
    static int largestCommonDivisor(int a, int b)
    {
        int biggestDivisor = (a<b)?a:b;

        for (int i = biggestDivisor; i >= 1; i--)
        {
            if(a % i == 0 && b % i == 0)
            {
                biggestDivisor = i;
                return biggestDivisor;
            }
        }
        return biggestDivisor;
    }
    static void getItems(int[] array)
    {
        for(int i = 0; i < array.length; i++)
        {
            if(i != 0 && i % 10 == 0)
            {
                System.out.println((i + 1) + ". eleman : " + array[i] + "\t-\t");
                continue;
            }
            System.out.print((i + 1) + ". eleman : " + array[i] + "\t-\t");
        }
    }
    static double averageItems(int[] array)
    {
        int total = 0;
        double average;
        for(int i : array)
        {
            total += i;
        }
        average = (double) (total) / array.length;
        return average;
    }

    static int belowAverageItemsAmount(int[] array, double average)
    {
        int counter = 0;
        for (int i : array)
        {
            if(i < average)
            {
                counter++;
            }
        }
        return counter;
    }

    static int[][] createMatrix(int a, int b)
    {
        int[][] matrix = new int[a][b];
        for(int i = 0; i < matrix.length; i++)
        {
            for(int j = 0; j < matrix[i].length; j++)
            {
                matrix[i][j] = (int)(Math.random() * 10 + 1);
            }
        }
        return matrix;
    }

    static void getMatrix(int[][] array)
    {
        for(int i = 0; i < array.length; i++)
        {
            for(int j = 0; j < array[i].length; j++)
            {
                System.out.print(array[i][j] + "\t\t");
            }
            System.out.println("\n");
        }
    }
    static void getMatrix(String[][] array)
    {
        for(int i = 0; i < array.length; i++)
        {
            for(int j = 0; j < array[i].length; j++)
            {
                System.out.print(array[i][j] + "\t\t");
            }
            System.out.println("\n");
        }
    }
    static void getMatrix(String[][] array,String word)
    {
        for(int i = 0; i < array.length; i++)
        {
            System.out.print((i + 1) + ". " + word + " : ");
            for(int j = 0; j < array[i].length; j++)
            {
                System.out.print(array[i][j] + "\t\t");
            }
            System.out.println("\n");
        }
    }
    static int totalMatrixItems(int[][] array)
    {
        int total = 0;
        for(int i = 0; i < array.length; i++)
        {
            for(int j = 0; j < array[i].length; j++)
            {
                total += array[i][j];
            }
        }
        return total;
    }
    static int minItemMatrix(int[][] array)
    {
        int minItem = 11;
        for(int i = 0; i < array.length; i++)
        {
            for(int j = 0; j < array[i].length; j++)
            {
                if(array[i][j] < minItem)
                {
                    minItem = array[i][j];
                }
            }
        }
        return minItem;
    }
    static int maxItemMatrix(int[][] array)
    {
        int maxItem = 0;
        for(int i = 0; i < array.length; i++)
        {
            for(int j = 0; j < array[i].length; j++)
            {
                if(array[i][j] > maxItem)
                {
                    maxItem = array[i][j];
                }
            }
        }
        return maxItem;
    }
    static String[][] shuffleTheCards(String[][] cards)
    {
        int k,l;
        String card;
        for(int i = cards.length-1; i > 0; i--)
        {
            //k = (int)(Math.random() * (i + 1));
            for(int j = cards[i].length-1; j > 0; j--)
            {
                k = (int)(Math.random() * (i + 1));
                l = (int)(Math.random() * (j + 1));
                card = cards[i][j];
                cards[i][j] = cards[k][l];
                cards[k][l] = card;
            }
        }
        return cards;
    }

    static String[][] distributeCard(String[][] arr,int player,int stepCards ,boolean style)
    {
        String[][] gamerCards= new String[player][stepCards];
        int distAmount = player * stepCards;
        int gamer = 0, card = 0;
        if(style)
        {
            distance:
            for(int i = 0; i < arr.length; i++)
            {
                for(int j = 0; j < arr[i].length; j++)
                {
                    gamerCards[gamer][card] = arr[i][j];
                    distAmount--;
                    if(j % 4 == 3)
                    {
                        gamer = 0;
                        card++;
                        if(card == 4)
                        {
                            card = 0;
                        }
                    }else{
                        gamer++;
                    }
                    if(distAmount == 0)
                    {
                        break distance;
                    }
                }
            }
        }else{
            distance:
            for(int i = 0; i < arr.length; i++)
            {
                for(int j = 0; j < arr[i].length; j++)
                {
                    gamerCards[gamer][card] = arr[i][j];
                    distAmount--;
                    if(j % 4 == 3)
                    {
                        card = 0;
                        gamer++;
                        if(gamer == 4)
                        {
                            gamer = 0;
                        }
                    }else{
                        card++;
                    }
                    if(distAmount == 0)
                    {
                        break distance;
                    }
                }
            }
        }
        return gamerCards;
    }


}
