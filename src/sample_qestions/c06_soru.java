package sample_qestions;

import java.util.Scanner;

public class c06_soru {
    public static void main(String[] args) {
        /*
        oru 6-)  Kullanıcıya günde ne
        kadar çay içtiğini ve ne kadar şeker kullandığını sorun.
 Yılda kaç çay içtigini ve
  kaç kg şeker kullandığını hesaplayın ve bunları ekranda yazdırın.
 1 şeker = 1.5 gr
1 kg = 1000 gram      olarak hesaplayınç
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("günde kaç çay içiyorsunuz");
        int cay=scan.nextInt();
        System.out.println("caya kac şeker atıyorsunuz");
        double seker=scan.nextDouble();
        System.out.println("yılda icilen cay :"+cay*365+
                           "\nyılda kullnılan seker(kg) :"+(cay*seker*365*1.5)/1000);
    }
}
