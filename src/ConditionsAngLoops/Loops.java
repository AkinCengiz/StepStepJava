package ConditionsAngLoops;

public class Loops {
    public static void main(String[] args) {

        for (int i = 0 ; i < 10 ; i++){
            System.out.println(i);
        }
        System.out.println("\n*******************************************");
        for(int i=0, j=0; (i+j <= 10 ); i++, j++){
            System.out.println("i * j : " + (i*j));
        }
        System.out.println("\n*******************************************");
        int number = 10;
        while(number <= 20){
            System.out.print(number + " ");
            number++;
        }
        System.out.println("\n*******************************************");
        int number1 = 0;
        do{
            System.out.println("\ndo while her şartta en az 1 defa çalışır...");
            number1--;
        }while(number1 >= 0);

        System.out.println("\n*******************************************");
        for(int i =0; i<10; i++){
            if(i ==4 ){
                System.out.println("Break ile döngü kırıldı...");
                break;
            }
            System.out.println("Break şartına kadar döngüden çıkılmaz..." + i);
        }
        System.out.println("\n*******************************************");

        etiket1 :
        for(int y = 0; y < 5; y++){
            etiket2:
            for(int z = 0; z < 5; z++){
                System.out.println("y : " + y + " z : " + z);

                if(z+y == 3)
                {
                    System.out.println("İçteki döngü sonlandı...");
                    break etiket2;
                }
                if(z == 4){
                    System.out.println("En dıştaki döngü sonlandı...");
                    break etiket1;
                }
            }
        }

        System.out.println("\n*******************************************");
        etiket1 :
        for(int y = 0; y < 5; y++){
            etiket2:
            for(int z = 0; z < 5; z++){
                System.out.println("y : " + y + " z : " + z);

                if(z+y == 3)
                {
                    System.out.println("İçteki döngünün o anki iterasyonu sonlandı...");
                    continue etiket2;
                }
                if(z == 4){
                    System.out.println("En dıştaki döngünün o anki iterasyonu sonlandı...");
                    continue etiket1;
                }
            }
        }
        System.out.println("\n*******************************************");
    }
}
