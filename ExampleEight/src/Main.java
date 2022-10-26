import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Armstrong sayı sorgulamak için bir sayı giriniz: ");
        int number = input.nextInt();

        //girilen sayının kaç basamaklı olduğunu bulamamız için böyle bir değişken tanımladık başlangıcı 0
        int numberLength = 0;

        // basamak bulurken ana sayımız üzerinde değil de clone u üzerinde işlem yapalım deiye bir clone lar  oluşturudum.
        int numberClone = number;
        int numberClone2 = number;

        // armstrong sayı basa
        int total = 0;

        //Bu döngü ile girilen sayısın kaç basamaklı olduğunu buluyoruz
        while (numberClone >0){
            numberClone = numberClone / 10;
            numberLength++;
        }

        //bir sayının üssünü alma işlemi
        /*
        int sayi = 2; int üssü =3;
        int sonuc = 1;
        for(int i =0; i<üssü; i++){
            sonuc = sonuc * sayi;
        }
        System.out.println(sonuc);
         */

        //burada ise her sayıyı tek tek dolaşıp basamak sayısının kuvvetini alıp topluyoruz.
        for(int i = 1; i<=numberLength; i++){
            total = (int) Math.pow(numberClone2%10, numberLength) + total;
            numberClone2 = numberClone2 /10;
        }

        //çıkan toplam ile ilk girilen değeri karşılaştırıyoruz.
        if (total == number){
            System.out.println(number +" girdiğiniz sayi Armstrong sayıdır.");
        }else{
            System.out.println("Girdiğiniz sayı Armstrong sayı değildir.");
        }
    }
}
