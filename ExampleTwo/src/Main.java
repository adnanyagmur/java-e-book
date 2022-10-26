import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //günlük çalışan ücret hesaplama
        // saatlik çalışma ücreti 20 tl
        // eğer ki çalışmasının ücreti 60 tl den az ise yine de 60 tl verilecek bir şartımız var

        int saat;
        int saatlikUcret= 20;
        int total;

        Scanner input = new Scanner(System.in);

        System.out.println("Kaç saat çalıştınız : ");
        saat = input.nextInt();

        total = saat * saatlikUcret;

        total = (total<60) ? 60 : total;

        System.out.println(" Alacağınız ücret : "+ total);
    }
}
