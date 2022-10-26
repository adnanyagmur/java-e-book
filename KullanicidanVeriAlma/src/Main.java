import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int a;

        // kullanıcıdan bu yapı ile alıyoruz değeri
        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen bir sayı giriniz: ");
        // ve aldığımız değeri oluşturduğumuz değere atıyoruz.
        // aşağıda next kısmında bir çok yapı mevcut.
        //almak istediğimiz veri tipine göre next.... şekilde farktlı tipleri de verebilriz.
        a = input.nextInt();


        System.out.println(a);
    }
}
