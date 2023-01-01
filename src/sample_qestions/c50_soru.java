package sample_qestions;

import java.util.Scanner;

public class c50_soru {

   static String kelime="";
   static int oyuncu1puan=0;
   static int oyuncu2puan=0;



    public static void main(String[] args) {
        /*
        Constructor Sorusu-
1. Aşama: Başlangıçta İlk Oyuncuya oyunu başlatmak için bir kelime girmesini iste.
2. Aşama: Sonra oyuncuyu degiştir ve ikinci oyuncuya geç. Yeni oyuncuya verilen kelimenin geçerli olup olmadıgını sor
   2.1) Eğer yeni oyuncu verilen kelimeyi kabul ederse : kelimeyi yazan oyuncuya puan olarak kelimedeki harf sayısını ekleyin ve
   3. adıma gidin
  2.2) Eğer yeni oyuncu verilen kelimeyi	geçerli olarak kabul etmesse "Geçersiz kelime,
  oyuncu X(Mevcut oyuncu) oyunu kazandı" yazıp oyunu bitirin.
3. Aşama: Kullanıcılara oyuna devam etmek isteyip istemediklerini sor: Eğer devam etmek isterlerse:
  3.1) Kullanıcıdan kelimeye eklemek için bir harf isteyin
  3.2) Ve kullanıcıya hangi tarafa eklemek istedigini sorun (Başa veya Sona)
  3.3) Daha sonra harfi kelimeye ekleyin ve 2.Aşamaya geçin Eğer devam etmek istemezlerse: "Game Finished" yazdırın.

Puanları ve kazananı ekrana yazdİRİN
         */

      oyuncu1();


}public static void oyuncu1(){
        Scanner scan=new Scanner(System.in);
        System.out.println("1. oyuncu kelimeyi giriniz");
        kelime=scan.next();
        oyuncu2(kelime);

    }public static void oyuncu2(String kelime){
        Scanner scan=new Scanner(System.in);
        System.out.println("2.oyuncu "+kelime+" gecerli ise E değilse H ye basınız ");
        char devam=scan.next().charAt(0);
        if (devam=='e'||devam=='E'){
            oyuncu1puan+=kelime.length();
            System.out.println("2. oyuncu kelimeye eklemek icin bir harf giriniz");
            String harf=scan.next();
            System.out.println("2. oyuncu harfi eklemek istediginiz yeri secin başa:B sona:S");
            char secim=scan.next().charAt(0);
            if (secim=='b'||secim=='B'){
                kelime=harf.concat(kelime);
            }else
                kelime+=harf;
            oyuncuPuan(kelime);


        }else{
            System.out.println("--------GAME FİNİSHED---------");
            System.out.println("1.oyuncu puanı :"+oyuncu1puan+" 2.oyuncu puanı :"+oyuncu2puan);
            if (oyuncu1puan>oyuncu2puan){
                System.out.println("1.oyuncu kazandı");
            } else if (oyuncu2puan>oyuncu1puan) {
                System.out.println("2.oyuncu kazandı");
            }else System.out.println("berabere");
        }



    }public static void oyuncuPuan(String kelime){

        Scanner scan=new Scanner(System.in);
        System.out.println("1. oyuncu "+kelime+" gecerli ise E değilse H ye basınız ");
        char devam=scan.next().charAt(0);
        if (devam=='e'||devam=='E'){
            oyuncu2puan+=kelime.length();
            System.out.println("1. oyuncu kelimeye eklemek icin bir harf giriniz");
            String harf=scan.next();
            System.out.println("1. oyuncu harfi eklemek istediginiz yeri secin başa:B sona:S");
            char secim=scan.next().charAt(0);
            if (secim=='b'||secim=='B'){
                kelime=harf.concat(kelime);
            }else
                kelime+=harf;

            oyuncu2(kelime);



        }else {
            System.out.println("--------GAME FİNİSHED---------");
            System.out.println("1.oyuncu puanı :" + oyuncu1puan + " 2.oyuncu puanı :" + oyuncu2puan);
            if (oyuncu1puan>oyuncu2puan){
                System.out.println("1.oyuncu kazandı");
            } else if (oyuncu2puan>oyuncu1puan) {
                System.out.println("2.oyuncu kazandı");
            }else System.out.println("berabere");
        }

    }
    }
