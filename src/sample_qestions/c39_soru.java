package sample_qestions;

public class c39_soru {
    public static void main(String[] args) {
        /*
        Soru-39)
Bir tamsayı dizisini (Int Array) girdi olarak
kabul eden ve verilen bu (Arrayden) diziden minimum
ve maksimum sayıları yazdıran bir yöntem yazın
Örnek:
Input : {3,2,5,4,1,6}
Output :
min: 1
max: 6
Ipucu: sort yöntemni kullanabilirsiniz.
         */
        int [] arr={3,2,5,4,1,6};
        int minimum=arr[0];
        int maksimum=arr[0];

        for (int i = 0; i <arr.length ; i++) {
            if (minimum>arr[i]){
                minimum=arr[i];
            }
            if (maksimum<arr[i]){
                maksimum=arr[i];
            }
        }
        System.out.println("min :"+minimum+"\n max :"+maksimum);
    }
}
