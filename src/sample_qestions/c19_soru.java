package sample_qestions;

import java.util.Scanner;

public class c19_soru {
    public static void main(String[] args) {
        /*
        Soru 19-)
Kullanıcıdan doğum tarihini alınız.
 Burcunu hesaplayan bir method yazınız.
ipucu:
Switch Case kullanabilirsiniz.
Veya Method yazarak Method aracılıgı ile de yapabilirsiniz.
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("doğum tarihinizin gününü giriniz");
        int gun=scan.nextInt();
        System.out.println("dogun tarihiniz rakamla ay olarak giriniz");
        int ay=scan.nextInt();

burc(gun,ay);

        }public static void burc(int gun,int ay ){

        if ((gun>=20 && ay==2) || (gun<=20 && ay==3))
            System.out.println("balık");
        if ((gun>=21 && ay==1) || (gun<=19 && ay==2))
            System.out.println("kova");
        if ((gun>=22 && ay==12) || (gun<=20 && ay==1))
            System.out.println("oglak");
        if ((gun>=23 && ay==11) || (gun<=21 && ay==12))
            System.out.println("yay");
        if ((gun>=24 && ay==10) || (gun<=22 && ay==11))
            System.out.println("akrep");
        if ((gun>=24 && ay==9) || (gun<=23 && ay==10))
            System.out.println("terazi");
        if ((gun>=24 && ay==8) || (gun<=23 && ay==9))
            System.out.println("basak");
        if ((gun>=23 && ay==7) || (gun<=23 && ay==8))
            System.out.println("aslan");
        if ((gun>=22 && ay==6) || (gun<=22 && ay==7))
            System.out.println("yengec");
        if ((gun>=21 && ay==5) || (gun<=21 && ay==6))
            System.out.println("ikizler");
        if ((gun>=21 && ay==4) || (gun<=20 && ay==5))
            System.out.println("boga");
        if ((gun>=21 && ay==3) || (gun<=20 && ay==4))
            System.out.println("koc");

    }
}
