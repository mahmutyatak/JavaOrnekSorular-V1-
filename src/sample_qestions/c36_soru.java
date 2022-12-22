package sample_qestions;

public class c36_soru {
    public static void main(String[] args) {
        /*
        Soru 36-)
Verilen bir Array dizisindeki ortadaki degeri döndüren bir kod/method yazın.
 ( Yapabilirseniz Dinamik kod yazmaya çalışın,
 Arrayin uzunlugu degişse de ortadaki elemanı getirsin)
Örnek:
inputarr[]=   {1,2,3,4,5,6,7}
output:         4
İpucu:  Arrayin indexini hesaplayarak bulabilirsiniz.
 Kendinizi geliştirme adına sorunun cevabını degişik yollardan yapabilir,
  Arrayi kullanıcıya oluşturabilirsiniz (Öneri..)

         */
        int [] arr=   {1,2,3,4,5,6,7};
        int ortadakiSayi=arr[arr.length/2];
        System.out.println(ortadakiSayi);
    }
}
