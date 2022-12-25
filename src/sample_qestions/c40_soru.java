package sample_qestions;

public class c40_soru {
    public static void main(String[] args) {
        /*
        Soru-40)
Bir diziyi (Array) parametre olarak kabul eden ve dizideki
 tüm elemanların toplamını döndüren bir method yazın ve ardından sonucu main methodda yazdırın.
Örn:
girdi : {1,2,3,4,5,6,7,8}
çıkış: 36
ıpucu: For Loop ile arrayin elemanlarını toplayın ve methodu yazdırarak döndürün
         */
        int [] arr={1,2,3,4,5,6,7,8,12,12};

        System.out.println(toplam(arr));
    }public static int toplam(int ... sayilar){
        int toplam=0;
        for (int each:sayilar
             ) {
            toplam+=each;
        }
        return toplam;
    }
}
