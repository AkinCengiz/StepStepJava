package review;

import java.util.Scanner;

public class PalindromWord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Kontrol edilecek kelimeyi giriniz : ");
        String word = scanner.nextLine();
        String newWord = "";
        for(int i = word.length()-1; i >= 0; i--)
        {
            newWord += word.charAt(i);
        }
        if(word.equals(newWord))
        {
            System.out.println(word + " palindrom bir kelimedir...");
        }else {
            System.out.println(word + " palindrom bir kelime değildir...");
        }

    }
}
