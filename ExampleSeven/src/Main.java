import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int number;
        int total=1;
        Scanner input = new Scanner(System.in);

        System.out.println("Faktöriyeli alıncak sayıyıyı giriniz : ");
        number = input.nextInt();

        for (int i = 1; i<=number;i++){
            total = total * i;
        }
        System.out.println(number+"!  in sonucu : "+ total);

    }
}
