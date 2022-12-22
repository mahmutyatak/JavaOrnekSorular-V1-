package sample_qestions;

import java.util.Locale;
import java.util.Scanner;

public class c11_soru {
    public static void main(String[] args) {
        /*
        Soru 11-) Kullanıcıya Adını, Soyadını ve kredi kartı numaralarını sorup bunları özel forma dönüştürün.
                 Ad ve soyadın baş harfleri büyük olmalıdır
                 Kredi kartı numarasını kontrol edin, 16 hane yoksa "Geçersiz kredi kartı numarası" yazdırın.
                 Kredi Kartı 16 Hane ise aşagıda belirtilen şekilde çıktı alın.
	Ipucu: IF ile çözebilirsiniz. Baş harfleri alın gerisi zaten * işareti ;-)
Giriş :
		 > Gandalf Grey 563245879632
Çıktı :
		 > İsim : G****** G***
		 > CCN : **** **** 9632 (edited)

         */
        Scanner scan=new Scanner(System.in);
        System.out.println("isminizi baş harfi büyük olacak şekilde yazınız");
        String isim=scan.nextLine();
        System.out.println("soyisminiz baş harfi büyük olacak şeklide yazdırın");
        String soyisim=scan.nextLine();
        System.out.println("16 haneli kredi kart numaranızı giriniz");
        String kortno=scan.nextLine();
        char isimilkharf=isim.toUpperCase(Locale.ROOT).charAt(0);
        char soyisimilkharf=soyisim.toUpperCase().charAt(0);

        if (!(isim.charAt(0)>='A' && isim.charAt(0)<='Z')){
            System.out.println("isim ilk harf büyük olamlı");
        } else if (!(soyisim.charAt(0)>='A'&& soyisim.charAt(0)<='Z')) {
            System.out.println("soyisim ilk harf büyük olmalı");
        } else if (kortno.length()!=16) {
            System.out.println("kartno 16 haneli olmalı");

        }else System.out.println("isim :"+isimilkharf+isim.substring(1).replaceAll("\\w","*")
        +" "+soyisimilkharf+soyisim.substring(1).replaceAll("\\w","*")
        +"\nCCN :"+kortno.substring(0,kortno.length()-4).replaceAll("\\d","*")+kortno.substring(kortno.length()-4));

    }

}
