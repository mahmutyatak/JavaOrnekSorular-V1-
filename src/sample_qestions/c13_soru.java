package sample_qestions;



public class c13_soru {
    public static void main(String[] args) {
        /*
        Char cevap değişkeninin değerini test edelim ve a
        şağıdaki eylemleri gerçekleştiren bir kod yazalım:
Cevap a ise, konsolda 'İsteğiniz işleniyor' mesajı yazsın
Yanıt b ise, konsolda 'Değerlendirmeniz için yine de
 teşekkür ederiz' mesajı yazsın
Yanıt c ise 'Üzgünüm şuanda yardımcı olamıyoruz' mesajı,
Yanıtın başka bir değeri için ise 'Geçersiz giriş,
lütfen tekrar deneyin!' mesajı yazdırılsın.
Ipucu:
Switch konusunu hatırlayalım!
         */
        char cevap='z';

        switch (cevap){
            case 'a':
                System.out.println("isteğiniz işleniyor");
                break;
            case 'b':
                System.out.println("değerlendirmeniz için teşekkürler");
                break;
            case 'c':
                System.out.println("üzgünüm şu anda yrdımcı olamıyıruyz");
                break;
            default:
                System.out.println("geçersiz giriş");
        }
    }
}
