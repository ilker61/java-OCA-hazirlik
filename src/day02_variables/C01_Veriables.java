package day02_variables;

import java.util.Scanner;

public class C01_Veriables {
    public static void main(String[] args) {
        System.out.println("Hallo word yazdirana ne mutlu");

        int level=1;
        System.out.println(level);

        boolean ogrenciMi=true;
        boolean salakMi=true;

        char ozelSembol='#';
        char harf='K';

        String ad, soyad, sehir;
        ad="Necmi";
        soyad="Yildiz";
        sehir="Mugla";

        // Tek deklerasyon ile birden cok deger deklare edilebilir. Deklare edildikten sonra tekr teker
        // atamalari yapilir.

        int lev=20, yas=98, bas=780;  // seklinde de yapililir.

        // Kullanicidan ismini al ve ismin ilk harfini yazdir

        Scanner scanner=new Scanner(System.in);

        System.out.println("Ismini gir");
        char isim=scanner.next().charAt(0);
        System.out.println(isim);





    }
}
