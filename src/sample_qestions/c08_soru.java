package sample_qestions;

import java.util.Scanner;

public class c08_soru {
    public static void main(String[] args) {
        /*
        Soru-8)  Kullanicidan üc basamaklı bir sayı alin.
               Kullanicidan alinan
               bu sayinin basamaklari toplamini ekranda yazdirin.
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("3 basamaklı bir sayı giriniz");
        int sayi=scan.nextInt();

        int birlerbasa=sayi%10;
        int rakamlartop=0+birlerbasa;
        sayi=sayi/10;

        birlerbasa=sayi%10;
        rakamlartop=rakamlartop+birlerbasa;
        sayi=sayi/10;
        rakamlartop=rakamlartop+sayi;
        System.out.println(rakamlartop);
    }
}
