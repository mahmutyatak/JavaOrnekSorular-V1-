package sample_qestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class c30_soru {
    public static void main(String[] args) {
        /*
        Soru 30-)
Bir Stringdeki yinelenen karakterleri Array String olarak döndüren bir kod yazın.
( mülakat sorusu )
Örnek:
String str="Javacokkolay"
Yinelenen karakterler : [a, o, k]
İpucu: İçiçe for looplar, String Manupulations ve ifler kullanrak çözebilrsiniz.
            Stringdeki bir harfi Stringde bulunan diger harfler
             ile karşılaştırıpkonteynıra atacaksınız
             bu yüzden iç içe loop kullanmak mantıklı duruyor

         */
        String str="Javacokkolay";
        String [] arr=str.split("");
        List<String> yeniListe=new ArrayList<>();

        for (int i = 0; i <arr.length ; i++) {
            for (int j = i+1; j <arr.length ; j++) {
                if (arr[i].equalsIgnoreCase(arr[j])){
                    if (!yeniListe.contains(arr[i])){
                        yeniListe.add(arr[i]);
                    }
                }
            }

        }
       arr=new String[yeniListe.size()];
        for (int i = 0; i <yeniListe.size() ; i++) {
            arr[i]=yeniListe.get(i);
        }
        System.out.println(Arrays.toString(arr));
    }
}
