package ClassTrials.TV;

import java.util.ArrayList;
import java.util.Scanner;

public class Test {
    static Scanner scanner = new Scanner(System.in);
    static Television television;
    public static void main(String[] args) {
        getMenu();
        boolean exit = false;

        while (!exit)
        {
            System.out.print("Menüden yapmak istediğiniz işlemi seçiniz : ");
            int choise = scanner.nextInt();
            switch (choise)
            {
                case 0:
                    System.out.println("Sistemden çıkılıyor.");
                    exit = true;
                    break;
                case 1:
                    setupTvAndChannels();
                    break;
                case 2:
                    if(television != null)
                    {
                        television.openTelevision();
                        break;
                    }else {
                        System.out.println("Önce televizyonun kurulumu tamamlanmalı...");
                        getMenu();
                        break;
                    }

                case 3:
                    if(television != null)
                    {
                        television.upVolume();
                        break;
                    }else {
                        System.out.println("Önce televizyonun kurulumu tamamlanmalı...");
                        getMenu();
                        break;
                    }
                case 4:
                    if(television != null)
                    {
                        television.downVolume();
                        break;
                    }else {
                        System.out.println("Önce televizyonun kurulumu tamamlanmalı...");
                        getMenu();
                        break;
                    }
                case 5:
                    if(television != null)
                    {
                        System.out.print("Açmak istediğiniz kanalın indeks numarasını giriniz : ");
                        int channelNo = scanner.nextInt();
                        if(channelNo-1 < television.getChannels().size())
                        {
                            if(television.getChannels().get(channelNo-1) != television.getSelectedChannel())
                            {
                                television.setSelectedChannel(television.getChannels().get(channelNo));
                                System.out.println("Kanal değişiyor...\nAçılan Kanal : " + television.getSelectedChannel().getName() + "\t" + television.getSelectedChannel().getNo());
                                break;
                            }else{
                                System.out.println("Zaten değiştirmek istediğiniz kanalı izliyorsunuz...");
                                break;
                            }
                        }else{
                            System.out.println("Kurulmamış bir kanal indeksi girdiniz.");
                            break;
                        }
                    }else {
                        System.out.println("Önce televizyonun kurulumu tamamlanmalı...");
                        getMenu();
                        break;
                    }
                case 6:
                    if(television != null)
                    {
                        television.selectedChannelInfo();
                        break;
                    }else {
                        System.out.println("Önce televizyonun kurulumu tamamlanmalı...");
                        getMenu();
                        break;
                    }
                case 7:
                    if(television != null)
                    {
                        television.closedTelevision();
                        break;
                    }else {
                        System.out.println("Önce televizyonun kurulumu tamamlanmalı...");
                        getMenu();
                        break;
                    }
                case 8:
                    getMenu();
                    break;
                default:
                    System.out.println("0 ile 8 arasında bir değer giriniz...");
                    break;
            }
        }
    }

    private static void setupTvAndChannels() {

        if(television == null)
        {
            scanner.nextLine();
            System.out.print("Televizyonun markasını giriniz : ");
            String brand = scanner.nextLine();
            System.out.print("Televizyonun boyutunu giriniz : ");
            String dimension = scanner.nextLine();
            television = new Television(brand,dimension);
            System.out.println(television);
            television.getChannelInfo();
        }else{
            System.out.println(television);
        }

    }

    private static void getMenu() {
        System.out.println("********************MENÜ*********************");
        System.out.println("0 ---> Çıkış\n" +
                "1 ---> Televizyonu kur\n" +
                "2 ---> Televizyonu aç\n" +
                "3 ---> Sesini aç\n" +
                "4 ---> Sesi kapat\n" +
                "5 ---> Kanal değiştir\n" +
                "6 ---> Kanal bilgisi göster\n" +
                "7 ---> Televizyonu kapat\n" +
                "8 ---> Menüyü göster");
    }
}
