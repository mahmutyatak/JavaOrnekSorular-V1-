package sample_qestions;

import java.util.Scanner;

public class c09_soru {
    public static void main(String[] args) {
       // Girilen zamanı saniyeye çeviriniz.
       // Örnek: 2 saat 3 dakika 10 saniye ==>	 7390 saniye
        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen saati giriniz");
        int saat=scan.nextInt();
        System.out.println("lütfen dakikayı giriniz");
        int dakika=scan.nextInt();
        System.out.println("lütfen saniyeyi giriniz");
        int saniye=scan.nextInt();
        int saniyetoplm=saat*3600+dakika*60+saniye;
        System.out.println("toplam :"+saniyetoplm+" saniye");
    }
}
