package sample_qestions;

import java.util.Scanner;

public class c04_soru {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("1 sayi yazınız");
        int sayi=scan.nextInt();
        System.out.println("küpünün yarısı"+(double)(sayi*sayi*sayi)/2);
    }
}
