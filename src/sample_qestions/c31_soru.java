package sample_qestions;

import java.util.Arrays;
import java.util.Scanner;

public class c31_soru {
    public static void main(String[] args) {
        /*
        Soru 31-)
Kullanıcıdan Arrayin uzunlugunu isteyin.
Ardından kullanıcıdan Arrayin elemanlarını girmesini isteyin.
İpucu:  Önce uzunluk alıp arrayi oluştur daha sonra loop ile kullancııya doldurt
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("ARRAYİN BOYUNUTUNU GİRİNİZ");
        int boyut=scan.nextInt();
        int [] arr=new int[boyut];
        int eleman=0;
        int sayi=0;
        while (sayi<boyut){
            System.out.println("arrayin elemanlarını giriniz");
            eleman=scan.nextInt();
            arr[sayi]=eleman;
            sayi++;

        }
        System.out.println(Arrays.toString(arr));
    }
}
