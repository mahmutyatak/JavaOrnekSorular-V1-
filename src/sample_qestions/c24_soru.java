package sample_qestions;

import java.util.Arrays;

public class c24_soru {
    public static void main(String[] args) {
        /*
        20'den 0'a kadar çift sayıları yazdırın ancak decrement
         (i--) kullanmayın.
Örnek:
120 18 16 14 12 10 8 6 4 2 000'den 0'a kadar Çift Sayılar şunlardır:
ipucu:
Loop içinde if kullanarak çözebilirsiniz.
 % kullanmak iyi bir fikir olabilir :wink:
         */
        int sayi = 9;
        if (sayi>20){
            System.out.println(sayi+" 'den 0 a kadar Çift Sayılar şunlardır :");
            int sayi2=20;
            while (sayi2 >= 0) {
                System.out.print(sayi2+" ");
            sayi2=sayi2-2;

            }
        }else
            System.out.println(sayi+" 'den 0 a kadar Çift Sayılar şunlardır :");
            while (sayi>=0){
                if (sayi%2==0)
                System.out.print(sayi+" ");
                sayi=sayi-1;
            }



    }
}
