package sample_qestions;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class c51_soru {
    public static void main(String[] args) {
          /*
        : Kullanicidan deger alarak
        iki String liste olusturun. Kullanici deger girmeyi
birakmak icin 0’a basmalidir.
Iki liste olustuktan sonra asagidaki sekilde bir output hazirlayin
liste1 : …….
liste2 : …….
ortak elementler :
         */
        Scanner scan=new Scanner(System.in);
        List<String> liste1=new LinkedList<>();
        String eleman1="";
        while (!eleman1.equalsIgnoreCase("0")){
            System.out.println("1. listeye eklenecek kelimeler giriniz cıkmak icin 0 a basınız");
            eleman1=scan.nextLine();
            if (eleman1.equalsIgnoreCase("0")){
                break;
            }else {
                liste1.add(eleman1);
            }

        }
        System.out.println(liste1);

        List<String> liste2=new LinkedList<>();
        String eleman2="";
        while (!eleman2.equalsIgnoreCase("0")){
            System.out.println("2. listeye eklenecek kelimeler giriniz cıkmak icin 0 a basınız");
            eleman2=scan.nextLine();
            if (eleman2.equalsIgnoreCase("0")){
                break;
            }else {
                liste2.add(eleman2);
            }

        }
        System.out.println(liste2);
        liste1.retainAll(liste2);

        System.out.println("ortak elemanlar :"+liste1);
    }
}
