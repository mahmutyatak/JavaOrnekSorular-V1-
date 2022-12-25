package sample_qestions;

import java.util.Scanner;

public class C45 {
    String ad="";
    String soyad="";
    String okul="";
    int yas;
    char cinsiyet;


    @Override
    public String toString() {
        return
                "{ad='" + ad + '\'' +
                ", soyad='" + soyad + '\'' +
                ", okul='" + okul + '\'' +
                ", yas=" + yas +
                ", cinsiyet=" + cinsiyet +
                '}';
    }

    public C45(String ad, String soyad, String okul, int yas, char cinsiyet) {

        this.ad=ad;
        this.soyad=soyad;
        this.okul=okul;

        this.yas=yas;

        this.cinsiyet=cinsiyet;

    }
}
