package sample_qestions;

import java.util.Scanner;

public class c03_soru {
    public static void main(String[] args) {
        //Kullanicidan 5 tane sayi alin,
        // alinan bu sayilarin ortalamasini hesaplayan
        // java kodunu yaziniz.
        Scanner scan=new Scanner(System.in);
        System.out.println("5 sayi yazınız");
        int sayi1=scan.nextInt();
        int sayi2=scan.nextInt();
        int sayi3=scan.nextInt();
        int sayi4=scan.nextInt();
        int sayi5=scan.nextInt();
        double ortalama=(sayi1+sayi2+sayi3+sayi4+sayi5)/5;
        System.out.println(ortalama);
    }
}
