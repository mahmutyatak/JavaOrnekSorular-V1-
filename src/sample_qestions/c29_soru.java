package sample_qestions;

public class c29_soru {
    public static void main(String[] args) {
        /*
        1'den 100'e kadar olan doğal sayıların toplamını bulmak için bir Program yazın.
İpucu: Loop kulanabilirsiniz
         */
        int toplam=0;
        for (int i = 0; i <100 ; i++) {
            toplam+=i;
        }
        System.out.println("1 den yüze kadar olan sayıların toplamı :"+toplam);
    }
}
