package sample_qestions;

import java.util.Scanner;

public class c05_soru {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("karenin 1 kenarını yazınız");
        int sayi=scan.nextInt();
        System.out.println("karenin alanı :"+sayi*sayi
        +"\nkarenin cevresi :"+4*sayi);
    }
}
