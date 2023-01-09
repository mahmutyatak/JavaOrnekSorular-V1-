package sample_qestions;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class c52_soru {
    public static void main(String[] args) {
  /*
        Bir ogretmenden ogrencilerin notlarini girmesini isteyin, not grime islemi
bittiginde Q’ya basmalidir. Not grime islemi bittikten sonra asagidaki sekilde
output hazirlayin
not ortalamasi : …..
ogrenci sayisi : …..
ortalama altindaki ogrenci sayisi : ….
ortalamanin 10 puan alt ve ustunde olan ogrenci sayis
        */

        Scanner scan=new Scanner(System.in);
        int sayac=0;
        List<Integer> notlar=new ArrayList<>();
        while (sayac<1000){
            try {
                System.out.println("ogrenci notlarını giriniz çıkmak için Q ya basınız");
                int not=scan.nextInt();
                notlar.add(not);
            } catch (Exception e) {
                String ifade=scan.nextLine();
                if (ifade.equalsIgnoreCase("q")){
                    System.out.println(notlar);
                    break;
                }else System.out.println("hatalı giris");
            }
        }
        int toplam=0;
        for (int each:notlar
        ) {
            toplam+=each;
            sayac++;
        }
        int ortamaAltı=0;
        int onpuan=0;
        double ortalama=toplam/notlar.size();
        System.out.println(ortalama);
        for (int each:notlar
        ) {
            if (ortalama>each){
                ortamaAltı++;
            }
            if (ortalama+10>each && ortalama-10<each){
                onpuan++;
            }
        }

        System.out.println("not ortalaması :"+ortalama+
                "\n ogrenci sayisi :"+sayac+
                "\nortalama altındaki ogrenci sayisi :"+ortamaAltı+
                "\n ortalamanın 10 puan ustu ve altındki ogrenci sayisi :"+onpuan);

    }
}

