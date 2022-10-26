import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //çift sayıları bulan program

        int number;

        Scanner input = new Scanner(System.in);

        System.out.println("Bir sayı giriniz : ");
        number = input.nextInt();

        for (int i=0; i<=number; i++){
            if(i%2==0){
                System.out.println("Bu sayı çifttir : "+i);
            }
        }
    }
}
