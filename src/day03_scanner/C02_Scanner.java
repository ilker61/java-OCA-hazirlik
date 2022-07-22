package day03_scanner;

import java.util.Scanner;

public class C02_Scanner {
    public static void main(String[] args) {
        // Kullanicidan yari cap iste cemberin cevresini ve dailrenin alanini bul
        Scanner scan= new Scanner(System.in);
        System.out.println("Lutfen yari capi gir loo");

        double yCap=scan.nextDouble();
        double cemberinCevresi=2*3.14*yCap;
        double daireninAlani=2*3.14*yCap*yCap;

        System.out.println("Girdiginiz yaricap : " + yCap + "\nCemberin Cevresi : " + cemberinCevresi +"\nDairenin Alani : " +daireninAlani);



    }
}
