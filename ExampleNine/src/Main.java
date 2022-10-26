import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int number;
        System.out.println("Kaç kaç satırlık ücgen oluşturalım : ");

        //kullanıcıdan kaç satırlık üçgen oluşturacağımızı alıyoruz
        number = input.nextInt();

        for (int i = 1; i <= number; i++) {
            //satır sıarsına göre boşluk koyuyoruz
            for (int a = 1; a <= number - i; a++) {
                System.out.print(" ");
            }

            //satıra göre * koyma
            for (int a = 1; a <= 2 * i - 1; a++) {
                System.out.print("*");
            }

            // alt satıra geçelim diye
            System.out.println();
        }
    }
}
