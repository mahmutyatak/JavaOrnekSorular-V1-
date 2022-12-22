package sample_qestions;

public class c27_soru {
    public static void main(String[] args) {
        /*
        Soru 27-) 'a' ile 'z' arasındaki karakterlerin ASCII değerlerini yazdıran
         bir Java programı yazın
ipucu: For Loop ve Char kullanarak çözebilirsiniz.
örnek:
Ascii value of a = 97
Ascii value of b = 98
Ascii value of c = 99
Ascii value of d = 100
         */
        for (int i = 'a'; i <='z' ; i++) {
            System.out.println((char) i+" ="+i);
        }
    }
}
