package sample_qestions;

public class c43_soru {
    String isim="mahmut";
    int yas=35;

    c43_soru(){
        System.out.println(isim);
        System.out.println(yas);

    }

    @Override
    public String toString() {
        return "c43_soru{" +
                "isim='" + isim + '\'' +
                ", yas=" + yas +
                '}';
    }

    c43_soru(String isim, int yas){
        this.isim=isim;
        this.yas=yas;

    }
    public static void main(String[] args) {
        /*
        Soru 43-)
Biri parametreli, diğeri parametresiz 2 constructor oluşturun.
Bu const. kullanarak en az 2 nesne oluşturun ve konsolda bu nesnelerin özellikleri yazdırın
Ipucu: Constructor konusunu pratik yapalım. Nesnelerin rengini adını sayısını gönderelim sonra cagırıp konsolda yazdıralım.
         */
        c43_soru obj1=new c43_soru();
        System.out.println(obj1);

        c43_soru obj2=new c43_soru("ahmet",32);
        System.out.println(obj2);
    }
}
