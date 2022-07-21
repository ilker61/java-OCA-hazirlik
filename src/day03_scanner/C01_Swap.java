package day03_scanner;

public class C01_Swap {
    public static void main(String[] args) {

        String name="ilker";
        int sayi1=1977;
        int sayi2=1978;
        short sayi3=2345;

        String nachName="Kucukaslan";
        boolean ogrenciMi=false;

        System.out.println("Ad ve Soyadi =" + name +" "+ nachName);
        System.out.println(sayi1+sayi2);
        System.out.println(sayi1+sayi3);

        // Soru; verilen sayi1 ve sayi2 veriablelerinin degerlerini degistiren (SWAP) bir program yaziniz

        int num1=10;
        int num2=20;

        System.out.println("swap isleminden once num1 " +num1 + " , swap tan once num2 " +num2);

        int temp=num1;
        num1=num2;
        num2=temp;

        System.out.println("swap isleminden sonra num1 " +num1 + " , swap tan sonra num2 " +num2);




    }
}
