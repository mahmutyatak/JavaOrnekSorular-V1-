package sample_qestions;

import java.util.Scanner;

public class c07_soru {
    public static void main(String[] args) {
        /*
        Soru 7-)  Kullanicidan Double türünde bir sayi alin.
         Alinan bu sayiyi tam sayiya cevirerek konsolda yazdirin.
(Istege bagli) Float degerinde bir sayi alin
 bu sayiyi da short degisken türünde bir sayiya döndürün
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("bir ondalıklı sayı yazınız");
        double sayi=scan.nextDouble();
        System.out.println((int) sayi);
    }
}
