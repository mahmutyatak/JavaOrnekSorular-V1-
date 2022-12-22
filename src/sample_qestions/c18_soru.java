package sample_qestions;

import java.util.Scanner;

public class c18_soru {
    public static void main(String[] args) {
        /*
Soru 18-)
Girilen araç hızı ve yol kilometresinden,
 gidilen yere varış süresini hesaplayan bir method yazalım.
  Kullanıcıya hızını ve kilometreyi soralım,
  bunu methoda gönderelim ve bize varış süremizi hesaplasın
İpucu:
yol=Hız*zaman

         */
        c19_soru.burc(7,9);
        zaman();
    }public static void zaman(){
        Scanner scan=new Scanner(System.in);
        System.out.println("hızınız kilometre cinsinden giriniz");
        int hız=scan.nextInt();
        System.out.println("gideceğiniz yerin mesafesini km cinsinden yazınız");
        double yol=scan.nextDouble();
        double zaman=0;
        zaman=yol/hız;
        System.out.println("varis süreniz :"+(int)zaman+"saat"+(zaman-(int)zaman)*60+"dakikadır");


    }
}
