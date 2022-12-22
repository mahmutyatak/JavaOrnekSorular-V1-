package sample_qestions;

public class c12_soru {
    public static void main(String[] args) {
/*
Soru 12-)
Verilen iki sayının toplamını -sıfırdan büyük veya eşit olabilir- hesaplamak ve yazdırmak için bir program oluşturalım
Eğer verilen tamsayıların veya toplamın 10'dan fazla basamağı varsa, "Fazla Yüklenme" yazdıralım

Ipucu:  IF/Else kullanabilirsiniz.
Örnek:
İki tamsayı girin:
25  veya  4567986321453
46   veya 123456
Konsolda Çıktı :
Sayıların toplamı: 71  veya  Fazla Yüklenme (edited)
 */


        long sayi1=12366547;
        long sayi2=23657889944111L;
        long sayi3=sayi1+sayi2;
        int sayi1basamak=0;
        int sayi2basamak=0;
        int sayi3basamak=0;
        while (sayi1>0){
            sayi1=sayi1/10;
            sayi1basamak++;
        }while (sayi2>0){
            sayi2=sayi2/10;
            sayi2basamak++;
        }while (sayi3>0){
            sayi3=sayi3/10;
            sayi3basamak++;
        }if (sayi1basamak>10||sayi2basamak>10||sayi3basamak>10) System.out.println("fazla yükleme");
     else System.out.println(sayi3);
    }
}
