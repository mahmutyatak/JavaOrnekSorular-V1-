package sample_qestions;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class c32_soru {
    public static void main(String[] args) {
        /*
        Soru 32-)
Kullanıcıdan alacagınız bilgilerle oluşturdugunuz
bir Integer Array dizesini Reverse olarak (tersten) yazdırınız.
İpucu:  int arrReverse[] diye bir array oluşturun
ve kullancıya oluşturdugunuz arrayi buna tersten assig
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("ARRAYİN BOYUTUNU GİRİNİZ");
        int boyut=scan.nextInt();
        int [] arr=new int[boyut];
        int eleman=0;
        int sayi=0;
        while (sayi<boyut){
            System.out.println("arrYİN ELEMANLARINI GİRİNİZ");
            eleman=scan.nextInt();
            arr[sayi]=eleman;
            sayi++;

        }
        int [] arrReverse=new int[arr.length];
        for (int i = 0; i <arr.length ; i++) {
            arrReverse[i]=arr[arr.length-i-1];


        }
        System.out.println(Arrays.toString(arrReverse));
    }
}
