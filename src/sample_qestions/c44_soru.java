package sample_qestions;

import java.util.Scanner;

public class c44_soru {
    public static void main(String[] args) {
        /*
        Soru 44-)
Main methodda ögrenci bilgileri oluşturun ve bu verileri kullanın.
Changename adında bir method oluşturun, parametre olarak öğrenci bilgileri
alın ve methodda tüm bilgileri değiştirin ve yeni bilgileri ekleyip yazdırın.
Main Methoddaki Rename methodunu çağırdığımız satırda öğrenci bilgilerini tekrardan yazdırın
Changesurname adlı bir method oluşturun , bu method lastname'i
 parametre olarak alsın. Methodda kullanıcıya yeni bir lastname sorulsun ve eski lastname degiştirilsin.
         */
        String ogrenciIsmi="Ali";
        int ogrenciYas=20;
        String okul="ODTU";
        String soyad="ok";
        changaname(ogrenciIsmi,ogrenciYas,okul,soyad);
        System.out.println("isim: "+ogrenciIsmi+"\n soyisim :"+soyad+"\n yas :"+ogrenciYas+"\n okul :"+okul);
       soyad=changesurname(soyad);
        System.out.println("isim: "+ogrenciIsmi+"\n soyisim :"+soyad+"\n yas :"+ogrenciYas+"\n okul :"+okul);
    }

    private static String changesurname(String soyad) {
        Scanner scan=new Scanner(System.in);
        System.out.println("yeni soy ad giriniz");
        String yeniSoyad=scan.nextLine();
        soyad=yeniSoyad;
        return soyad;

    }

    private static void changaname(String ogrenciIsmi, int ogrenciYas, String okul,String soyad) {
        ogrenciIsmi="Veli";
        ogrenciYas=21;
        okul="marmara";
        soyad="kat";
        System.out.println("isim: "+ogrenciIsmi+"\n soyisim :"+soyad+"\n yas :"+ogrenciYas+"\n okul :"+okul);

    }
}
