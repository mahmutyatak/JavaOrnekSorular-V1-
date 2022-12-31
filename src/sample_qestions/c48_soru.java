package sample_qestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class c48_soru {
   static List<String> urunler=new ArrayList<>(Arrays.asList("elma","armut","ayva","muz","limon"));
  static   List<Integer> fiyatlar=new ArrayList<>(Arrays.asList(10,15,20,12,30));
   static double toplam=0;


    public static void main(String[] args) {
        /*
        Basit bir 5 ürünlü manav alisveris programi yaziniz.

   1. Adim : urun listesinden urun sectir ve kac kilo oldugunu sor.
   2. Adim : Baska bir urun almak isteyip istemedigini sor. istemiyorsa toplam miktari goster, istiyorsa tekrar urun sectir. Bu islemi alisverisi
             bitirmek isteyene kadar tekrarla.
   3. Adim : Musteri her urun sectiginde, aldigi urunun fiyatini toplam fiyata ekle.
   4. Adim : Alisveris bitince toplam odemesi gereken tutari goster
         */

        toplam(urunler,fiyatlar);

    }public static double toplam(List<String> urunler,List<Integer> fiyatlar){
        System.out.println("-------------DENİZ MANAV---------------");
        System.out.println("-----MENU----------");
        Scanner scan=new Scanner(System.in);
        int sayac=1;

        for (int i = 0; i <urunler.size() ; i++) {
            System.out.println(sayac+"-"+urunler.get(i)+" :"+fiyatlar.get(i)+" TL");
            sayac++;
        }
        System.out.println("Almak istediginiz urunu seciniz");
        int secim=scan.nextInt();
        System.out.println("kac kilo istersiniz");
        double kilo=scan.nextInt();

        switch (secim){
            case 1:
                toplam+=fiyatlar.get(secim-1)*kilo;
                break;
            case 2:
                toplam+=fiyatlar.get(secim-1)*kilo;
                break;
            case 3:
                toplam+=fiyatlar.get(secim-1)*kilo;
                break;
            case 4:
                toplam+=fiyatlar.get(secim-1)*kilo;
                break;
            case 5:
                toplam+=fiyatlar.get(secim-1)*kilo;
                break;
            default:
                System.out.println("yanlis secim");
        }
        System.out.println("devam emek istermisiniz E/H");
        char devam=scan.next().charAt(0);
        if (devam=='e'||devam=='E'){
            toplam(urunler,fiyatlar);
        }else
            System.out.println("toplam alısverisiniz :"+toplam+" iyi gunler");







      return toplam;
    }
}
