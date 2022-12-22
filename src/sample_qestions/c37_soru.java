package sample_qestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class c37_soru {
    public static void main(String[] args) {
        /*
        Soru 37-)
--BONUS--  ---SORU AŞKIYLA YANIP TUTUŞANLAR İÇİN :-))---
(Eliminate duplicates)
ENG:
Write a method that returns a new array by eliminating the duplicate values in the array using the following method header
Write a test program that reads in ten integers, invokes the method, and displays the result.
(Tekrarlananları çıkar)
TÜR:
Tekrarlanan kayıtların çıkarıldığı yeni bir dizi döndüren aşağıdaki başlıga sahip bir metot yazınız.
On tane tamsayı alan ve by metodu çağırarak sonucu gösteren bir test programı yazınız.
---->>>
public static int[] eliminateDuplicates(int[] list)
ÖRNEK:
On sayi giriniz:
1 2 3 2 1 6 3 4 5 2
ÇIKTI:
Birbirinden farkli girilen sayilar: 1 2 3 6 4 5

         */
        Scanner scan=new Scanner(System.in);
        System.out.println("10 ADET SAYİ GİRİNİZ");
        int [] list=new int[10];
        int sayi=0;
        for (int i = 0; i <10 ; i++) {
            sayi=scan.nextInt();
            list[i]=sayi;
        }
        System.out.println(Arrays.toString(eliminateDuplicates(list)));


    }public static int[] eliminateDuplicates(int[] list){

        List<Integer> arr=new ArrayList<>();
        for (int i = 0; i <list.length ; i++) {
            if (!arr.contains(list[i])){
                arr.add(list[i]);
            }
        }

        int[] eliminateDuplicates=new int[arr.size()];

        for (int i = 0; i <arr.size() ; i++) {
            eliminateDuplicates[i]=arr.get(i);
        }

        return eliminateDuplicates;
    }
}
