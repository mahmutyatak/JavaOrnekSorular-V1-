package sample_qestions;

import java.util.Scanner;

public class c28_soru {
    public static void main(String[] args) {
        /*
        Soru-28)
Kullanıcının girdiği sayıyı tersine çeviren bir program yazın.
Örnek:
      Sayı: 1238
      Sayının Tersi: 8321
İpucu:  Loop kullanabilirsiniz.
         */
        Scanner scan=new Scanner(System.in);
        System.out.println(" terisini cevirmek istediğiniz bir sayı giriniz" );
        String sayi=scan.nextLine();
        String tersSayi="";

        for (int i =sayi.length()-1 ; i >=0 ; i--) {
            tersSayi+=sayi.substring(i,i+1);

        }
        int terssayi=Integer.parseInt(tersSayi);
        System.out.println("sayının tersi :"+terssayi);
    }
}
