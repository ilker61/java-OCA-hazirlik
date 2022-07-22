package day04_dataCasting_Increament;

public class C01_DataCasting {
    public static void main(String[] args) {

        byte sayi1=61;

        short sayi2=sayi1; // sayi1 sayi2 konteynirina konulur. yani kucuk kaptan buyuk kaba gecis olur
                           // bu duruma auto Widening denir. yani otomatik genisletme


        int sayi3=4527;

        double sayi4=10;

       int sayi5= (int) (sayi3/sayi4);  // ExplicitNarrowing

        System.out.println();
    }
}
