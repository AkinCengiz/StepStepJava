package operators;

public class PrefixSuffixOprators {

    public static void main(String[] args) {
        int number = 25;
        System.out.println("Sayı\t : " + number);
        number++;
        System.out.println("Sayı++ \nSayı\t : " + number);
        ++number;
        System.out.println("++Sayı\nSayı\t : " + number);
        System.out.println("--Sayı\t : " + (--number));
        System.out.println("Sayı++\t : " + (number++));
        System.out.println("Sayı\t : " + number);

        System.out.println("****************************************");

        int result = --number + 5;
        System.out.println("Sayı\t : " + number);
        System.out.println("Result = --number + 5;\nResult\t : " + result);
        result = 5 + number++;
        System.out.println("Result = 5 + number++;\nResult\t : " + result);
        System.out.println("Sayı\t : " + number);

        System.out.println("****************************************");

        int nmbr1 = 10, nmbr2 = 20, nmbr3 = 30;
        System.out.println("Sayı 1 : " + nmbr1);
        System.out.println("Sayı 2 : " + nmbr2);
        System.out.println("Sayı 3 : " + nmbr3);
        System.out.println("Sonuc : " + (nmbr1)+(--nmbr2)+(nmbr3++));
        System.out.println("Sayı 1 : " + nmbr1);
        System.out.println("Sayı 2 : " + nmbr2);
        System.out.println("Sayı 3 : " + nmbr3);

        System.out.println("*****************************************");
        int sayi1 = 10;
        int sayi2 = 20;
        int sonuc = 0;
        System.out.println("int sayi1 = 10 --> " + sayi1);
        System.out.println("int sayi2 = 10 --> " + sayi2);

        sonuc += sayi1; // sonuc = sonuc + sayi1;
        System.out.println("sonuc += sayi1 : " + sonuc);
        sonuc -= sayi2; // sonuc = sonuc - sayi2;
        System.out.println("sonuc -= sayi1 : " + sonuc);
        sonuc *= sayi2; // sonuc = sonuc * sayi2;
        System.out.println("sonuc *= sayi1 : " + sonuc);
        sonuc /= sayi1; // sonuc = sonuc / sayi1;
        System.out.println("sonuc /= sayi1 : " + sonuc);


    }
}
