package sample_qestions;

import java.util.Scanner;

public class c14_soru {
    public static void main(String[] args) {
        /*
        Kullanıcıdan bir isim isteyelim. Bu isim 3 harfli olmalıdır.
         Ardından ismin aynı karakterlere sahip olup olmadığını kontrol edelim.
İsim aynı karakterlere sahipse konsolda
"Dize yinelenen karakterlere sahip"  değil ise konsolda
"Dize benzersiz karakterlere sahip" yazdıralım.
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("BİR İSİM GİRİNİZ");
        String isim=scan.nextLine();
        if (isim.length()==3){
            if (isim.charAt(0)==isim.charAt(1)&& isim.charAt(2)==isim.charAt(0)){
                System.out.println("dize yinelenen karakterlere sahip");
            }else System.out.println("dize benzersiz karakterlere sahip");
        }else System.out.println("isim 3 harfli olmalıdır");
    }
}
