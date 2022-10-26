import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //  fiyat hesaplayıcı yapalım.

        int  yas, yolKm, kmFiyatı = 2, acilisFiyati= 50, totalPrice;

        System.out.println("Yaşınız kaç?");

        yas = input.nextInt();

        System.out.println("kaç kilometre gideceksiniz?");

        yolKm = input.nextInt();

        if(yas <= 8 && yas>=0){
            System.out.println("Ebeveyniniz ile ücretsiz seyahat edebilirsiniz");
        }else if( yas <=50 && yas>= 9){
            totalPrice = yolKm * kmFiyatı + acilisFiyati;
            System.out.println("Ödemeniz gerekn ücret : " + totalPrice);
        }else if (yas>50){
             totalPrice = (yolKm * kmFiyatı + acilisFiyati)/2 ;
            System.out.println("Ödemeniz gerekn ücret : " + totalPrice +"\nSağlıklı günler dileri.");
        }else {
            System.out.println("Geçerli bir yaş değeri girmediniz");
        }





    }
}
