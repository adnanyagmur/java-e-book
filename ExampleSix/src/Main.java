import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int number;
        int total=0;
        Scanner input = new Scanner(System.in);

        System.out.println("Bir sayı giriniz: ");
        number = input.nextInt();

        //girdiğimiz sayıya kadar foru döndürüyorum burada
        for (int i=0; i<=number; i++){
            //bu if ile tek sayıları buluyorum
            if(i%2==1){
                //burada tek sayıları topluyorum
                total = total + i;
            }
        }
        System.out.println(number+"'a kadar tek olan sayıların toplamı : "+total);
    }
}
