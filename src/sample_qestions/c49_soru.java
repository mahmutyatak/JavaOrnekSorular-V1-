package sample_qestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class c49_soru {
    static double ortalamaKazanc=0;
  static  List<String> gunler=new ArrayList<>(Arrays.asList("Pazartesi","Sali","Carsamba","Persembe","Cuma","Cumartesi","Pazar"));
    public static void main(String[] args) {
        /*
        Bir bakkalın 7 günlük tüm kazançlarını günlük olarak gösteren bir program
yazınız. Ayrıca bakkalın bu hafta ortalama kazandığı miktarı gösteren bir
method yazınız. Ayrıca bakkalın hangi günler ortalamanın üstüne kazandığını
gösteren bir method yazınız. Ayrıca bakkalın hangi günler ortalamanın altında
 kazandığını gösteren bir method yazınız.

 * 1. Adım : Günleri içeren bir tane ArrayList oluşturun. (gunler)
   2. Adım : Günlük kazançları ekleyeceğimiz bir tane ArrayList oluşturun. (gunlukKazanclar)
   3. Adım : While döngüsü ile kullanıcıdan 7 günlük kazançları tekek teker alıp gunlukKazanclar ArrayList'e ekle.
   4. Adım : getOrtalamaKazanc() adlı method ile ortalama kazancı alın.
   5. Adım : getOrtalamaninUstundeKazancGünleri() adlı method oluşturun. for döngüsü ile tüm günleri ortalama kazanç ile karşılaştır ortalama
             kazançtan yüksekse o günleri return yap.
   6. Adım : getOrtalamaninAltindaKazancGünleri() adlı method oluşturun. for döngüsü ile tüm günleri ortalama kazanç ile karşılaştır
             ortalama kazançtan aşağıysa o günleri return yap.

         */


        List<Integer> gunlukKazanc=new ArrayList<>();
        Scanner scan=new Scanner(System.in);
        int kazanc=0;


        for (int i = 0; i <gunler.size() ; i++) {
            System.out.println(gunler.get(i)+" . gun toplam kazancı giriniz");
            kazanc=scan.nextInt();
            gunlukKazanc.add(kazanc);


        }
       ortalamaKazanc=getortalamaKazanc(gunlukKazanc);
        System.out.println("ortalama kazanc :"+(ortalamaKazanc));
        getortalamaUstuKazancGunleri(gunlukKazanc);
        getortalamaAltıKazancGunleri(gunlukKazanc);



    }public static double getortalamaKazanc(List<Integer> gunlukKazanc){
        int toplamKazanc=0;
        for (int i = 0; i <gunlukKazanc.size() ; i++) {
            toplamKazanc+=gunlukKazanc.get(i);
        }

        ortalamaKazanc=toplamKazanc/7;

        return ortalamaKazanc;

    }public static void getortalamaUstuKazancGunleri(List<Integer> gunlukKazanc){
        List<String> ortalamaUstu=new ArrayList<>();
        for (int i = 0; i <gunlukKazanc.size() ; i++) {
            if (ortalamaKazanc<gunlukKazanc.get(i)){
                ortalamaUstu.add(gunler.get(i));
            }
        }
        System.out.println("ortalama üstü kazanan günler :"+ortalamaUstu);
    }public static void getortalamaAltıKazancGunleri(List<Integer> gunlukKazanc){
        List<String> ortalamaAltı=new ArrayList<>();
        for (int i = 0; i <gunlukKazanc.size() ; i++) {
            if (ortalamaKazanc>gunlukKazanc.get(i)){
                ortalamaAltı.add(gunler.get(i));
            }
        }
        System.out.println("ortalama altı kazanan günler :"+ortalamaAltı);
    }
}
