package sample_qestions;

import java.util.Scanner;

public class c10_soru {
    public static void main(String[] args) {
        /*
         Klasik Soru :slightly_smiling_face:
                    Kullanıcıdan kilosunu ve boyunu isteyin ve kütleyi hesaplayan bir program yazın

                    **indeks Hesaplama: İPUCU : Vücut Kitle İndeksi = Ağırlık (kg) / Boy uzunluğunun karesi (m) // If konusunu hatırlayın!***
                   Kullanıcıya aşağıdaki gibi mesaj verin:

                    Eğer VKİ 18.5'ten az ise --> zayıfsınız
                    Eğer VKİ 18.5 ile 25 arasında ise --> kilo idealdir
                    Eğer VKİ 25 ila 30 arasındaysa --> şişmansınız
                    VKİ 30'a eşit veya daha fazlaysa --> obez

                ÖRNEK :

		 Ağırlık : 71
		 Yükseklik : 1,72

		ÇIKTI :

                 VKİ değeriniz : 23.99945916711736 Kilonuz ideal (edited) 
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("kilonuzu kilogram olarak giriniz");
        double kilo=scan.nextDouble();
        System.out.println("boyunuzu metre olarak giriniz");
        double boy=scan.nextDouble();
        double vke=kilo/boy*boy*100;
        if (vke>=30) System.out.println("vki değeriniz :"+vke+"obez");
        else if (vke>25) {
            System.out.println("vki değeriniz :"+vke+"şişmansınız");
        } else if (vke>18.5) {
            System.out.println("vki değeriniz :"+vke+"kilo idealdir");

        }else System.out.println("vki değeriniz :"+vke+"zayıfsınız");

    }
}
