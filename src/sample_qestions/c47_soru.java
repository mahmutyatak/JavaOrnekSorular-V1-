package sample_qestions;

import java.util.Scanner;

public class c47_soru {
    public static void main(String[] args) {
        /*
        Problem Tanımı :
  Basit 4 işlem yapan bir hesap makinesi kodlayınız.

  Kullanicidan yapacagi islemi islem sembolu ile secmesini saglayinız.
  Kullanicidan iki sayi girmesini isteyiniz.
  Girilen iki sayi ve secilen isleme gore dogru sonucu ekrana yazdirınız.
         */

        Scanner scan=new Scanner(System.in);

        System.out.println("islem yapmak istediginiz sayilari giriniz");
        int sayi1=scan.nextInt();
        int sayi2=scan.nextInt();
        System.out.println("yapcaginiz islemi giriniz");
        char islem=scan.next().charAt(0);

hesapMakinesi(islem,sayi1,sayi2);


    }public static void hesapMakinesi(char islem,int sayi1,int sayi2){

        switch (islem){

            case '/':
                System.out.println("sayi1/sayi2 :"+((double)sayi1/sayi2));
                break;
            case '*':
                System.out.println("carpim :"+(sayi1*sayi2));
                break;
            case '-':
                System.out.println("sayı1-sayi2 :"+(sayi1-sayi2));
                break;
            case '+':
                System.out.println("toplam :"+(sayi1+sayi2));
                break;
            default:
                System.out.println("yanlis islem  girisi");

        }


    }
}
