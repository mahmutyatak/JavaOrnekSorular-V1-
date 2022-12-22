package sample_qestions;

import java.util.Scanner;

public class c16_soru {
    public static void main(String[] args) {
        /*
        Kullanıcıdan en az 5 harfli bir kelime alın.
         Alınan kelimenin son 3 harfinin 2 kopyasından oluşan yeni bir
          String oluşturun ve konsolda yazdırın
       Kullanicidan alinan isim uzunluğu en az 5 değilse yeni bir kelime  girmesini isteyin.
       Ipucu:  For/While/Do Loops konularını ve String Manipulation konularını hatırlayalım!
           Loopun içerisinde StringM methodlarından  yararlanalım!
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("bir kelime giriniz ");
        String str=scan.nextLine();

        while (str.length()<5){
            System.out.println("yeni bir kelime giriniz");
            str=scan.nextLine();

        }String str2=str.substring(str.length()-3)+" "
                +str.substring(str.length()-3);
        System.out.println(str2);
    }
}
