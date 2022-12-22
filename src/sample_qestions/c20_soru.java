package sample_qestions;

import java.util.Scanner;

public class c20_soru {
    public static void main(String[] args) {
        /*
        Soru 20-)
Kullanıcıdan bir isim yazmasını isteyin, İsim uzunluğu 3 olmalıdır.
 Daha sonra ismin aynı karakterlere sahip olup olmadığını kontrol edin.
Dize aynı karakterlere sahipse:  "Dizede yinelenen karakterler var" ;
 aynı karakterlere sahip degilse  "String benzersiz karakterlere sahip"
yazdırın. İsim 3 karakterden uzunsa "Bu kadar uzun cümleyi anlayamam ben agam" yazdırın.

                Örnek:
                giriş: ama
		çıkış: Dizede yinelenen karakterler var

                İpucu: İf Else ve Char kullanarak çözebiliri
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("Bir isim giriniz");
        String isim=scan.nextLine();
        System.out.println("bakmak istediğiniz karakteri giriniz");
        char karakter=scan.next().charAt(0);
        if (isim.length()<=3){
            if (isim.indexOf(karakter)!=isim.lastIndexOf(karakter)){//ama
                System.out.println("dizide yinelenen karakterler var");
            }else System.out.println("dizide yinelenen karakter yok");

        }else System.out.println("bu kadar uzun cümleyi anlamam");

    }
}
