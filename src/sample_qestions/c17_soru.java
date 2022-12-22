package sample_qestions;

import java.util.Scanner;

public class c17_soru {
    public static void main(String[] args) {
        /*
Kullanıcıdan bir isim ve bir karakter girmesini isteyin,
 ardından isimde karakterin kaç kez tekrarlandığını kontrol edelim.
Örnek:
char ch1=            'a'
String name =     "Ali bakkala geç gitti."
Beklenen Çıktı=    a sayısı = 3
Ipucu:
Loop döngülerini hatırlayalım.
While döngüsü kullanabilirsiniz!
 Sayac adlı bir int variable oluşturarak bunun ile
 kelimenin kaç defa geçtigini Loop içindeki İf ile bulabilirsin

         */
        Scanner scan=new Scanner(System.in);
        System.out.println("bir cümle giriniz");
        String cümle=scan.nextLine();
        System.out.println("bakılmasını istediğiniz karakteri giriniz");
        char krk =scan.next().charAt(0);
        System.out.println(krk);
        int flag=0;
        for (int i = 0; i <cümle.length() ; i++) {
            if (cümle.charAt(i)==krk){
                flag++;
        }


            }
        System.out.println(krk+" "+flag+" kere geçmiştir");
        }

    }

