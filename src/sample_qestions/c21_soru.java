package sample_qestions;

public class c21_soru {
    public static void main(String[] args) {
        /*
        Bir aydaki gün sayısını bulmak için bir Java programı yazın
(Mülakat Sorusu / Interview Sorusu / Leak Year)

Örnek:
Bir ay numarası girin: 2
Bir yıl girin: 2016

Şubat 2016'da 29 gün vardır
ipucu:
Switch Case kullanarak çözebiliriz.
 Şubat ayı senelere göre farklılık gösterir.
 Bunu çözmek için Şubat ayı için method kullanmamız gerekiyor!
         */
        int ay=2;
        int yil=1800;
        switch (ay){
            case 1:
                System.out.println("ocak "+yil+"'da 31 gün var");
                break;
            case 10:
                System.out.println("ekim "+yil+"'da 31 gün var");
                break;
            case 3:
                System.out.println("mart "+yil+"'da 31 gün var");
                break;
            case 4:
                System.out.println("nisan "+yil+"'da 30 gün var");
                break;
            case 5:
                System.out.println("mayıs "+yil+"'da 31 gün var");
                break;
            case 6:
                System.out.println("haziran "+yil+"''da 30 gün var");
                break;
            case 7:
                System.out.println("temmuz "+yil+"'da 31 gün var");
                break;
            case 8:
                System.out.println("agustos "+yil+"'da 31 gün var");
                break;
            case 9:
                System.out.println("eylül "+yil+"'da 30 gün var");
                break;
            case 11:
                System.out.println("kasım "+yil+"'da 30 gün var");
                break;
            case 12:
                System.out.println("aralık "+yil+"'da 31 gün var");
                break;
            case 2:

                if ((yil%4==0 && yil%100!=0) || (yil%4==0 && yil%400==0) ){
                    System.out.println("subat "+yil+"'da 29 gün var");
                }else
                    System.out.println("subat "+yil+"'da 28 gün var");
                break;
        }

    }
}
