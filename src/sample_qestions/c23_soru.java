package sample_qestions;

public class c23_soru {
    public static void main(String[] args) {
        /*
        Girdi olarak bir tamsayı kabul eden ve
         bu tam sayının faktöriyelini hesaplayan
         bir method yazın. Method bize çıktıyı döndürsün.
Örnek:
Girdi: 6
Çıktı: 6!=65432*1=720
ipucu: Aldıgınız sayıyı methoda gönderin. Methodun içinde For Loop ile faktöriyelini hesaplayın.
         */
        int sayi = 5;

        System.out.print(sayi + "!=");

        System.out.println("1=" + faktoryel(sayi));

    }

    public static int faktoryel(int sayi) {
        int carpim = 1;
        for (int i = sayi; i >= 2; i--) {
            carpim *= i;
            System.out.print(i + "*");
        }
        return carpim;
    }
}
