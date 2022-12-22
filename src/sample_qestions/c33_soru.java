package sample_qestions;

import java.util.Arrays;

public class c33_soru {
    public static void main(String[] args) {
        /*
        Soru 33-)
Array kullanarak String bir cümleyi
 Reverse eden (tersine çeviren)
  bir Java programı yazın (boşluklar ve özel karakterler dahil).
Örnek:
String str=''Kodlama harika.''
String arr[]: ".etaerg si gnidoC"
İpucu: Önce Split kullanarak
Arraye çevirin ardından Loop
kullanarak son karakterden başlayıp tersten yazdırın
         */
        String str="\"java cok harika.\"";
        String [] arr=str.split("");
        String [] tersStr=new String[1];
        tersStr[0]="";

        for (int i = 0; i <arr.length ; i++) {
            tersStr[0]+=arr[arr.length-i-1];
        }
        System.out.println(Arrays.toString(tersStr));
    }
}
