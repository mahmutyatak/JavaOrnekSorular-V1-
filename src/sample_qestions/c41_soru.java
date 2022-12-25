package sample_qestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class c41_soru {
    public static void main(String[] args) {
        /*
        Soru 41-)
Parametre olarak 2 Int Array kabul eden ve 2 Array listesini yeni bir Arraye ekleyen ve yazdıran bir method yazın.
		 * Input1={1,2,3,4}
		 * Input2={5,6}
		 * Çıktı={1,2,3,4,5,6}
         */
        int [] arr={1,2,3,4};
        int [] arr2={5,6};
        yeniarray(arr,arr2);
    }public static void yeniarray(int [] arr,int [] arr2){
        int [] birlesim=new int[arr.length+arr2.length];
        List<Integer> beraberlist=new ArrayList<>();
        for (int i = 0; i <arr.length ; i++) {
            beraberlist.add(arr[i]);
        }
        for (int i =0; i <arr2.length ; i++) {
            beraberlist.add(arr2[i]);
        }
        for (int i = 0; i <birlesim.length ; i++) {
            birlesim[i]=beraberlist.get(i);
        }
        System.out.println(Arrays.toString(birlesim));
    }
}
