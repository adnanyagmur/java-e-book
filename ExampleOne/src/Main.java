import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //scanner sınıfından bir nesne oluşturalım
        Scanner input = new Scanner(System.in);
        //Değişkenlerimizi oluşturalım.
        int uzunKenar;
        int kisaKenar;
        int sonuc;

        System.out.println("Uzun kenar kaç metre : ");
        uzunKenar = input.nextInt();

        System.out.println("Kısa kenar kaç metre : ");
        kisaKenar = input.nextInt();

        sonuc = uzunKenar * kisaKenar;
        // sonucumuzu yazdıralım
        System.out.println("Dikdörtgenin alanı  = "+sonuc);


    }
}
