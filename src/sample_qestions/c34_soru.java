package sample_qestions;

import java.util.Arrays;

public class c34_soru {
    public static void main(String[] args) {
       /*
       Bir String'i parametre olarak
        kabul eden ve verilen dizede Stringde
        bulunan rakamların toplamını yazdıran bir Method yazın.

Örnek
String str : ade1r4d3
Int toplam : 8
İpucu :      Character.isDigit() kullanarak Digitleri alabilir sonra bunları Arraye atabilirsiniz.
                  Ardından loop yardımı ile Integer.valueOf() kullanarak toplama yapabilirsiniz
        */
        String str="ade1r4d3";
        str=str.replaceAll("\\D","");
        String [] arr=str.split("");
        int toplam=0;
        for (int i = 0; i <arr.length ; i++) {
           toplam+=Integer.parseInt(arr[i]);
        }

        System.out.println(toplam);
    }
}
