import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // 2 sayı ile 4 işlem yapabilen bir program yazalım.

        int sayi1 ;
        int sayi2;
        int islemTipi;
        int sonuc;

        Scanner input = new Scanner(System.in);

        System.out.println("Lütfen işlem yapılacak ilk sayıyı giriniz : ");
        sayi1 = input.nextInt();

        System.out.println("Lütfen işlem yapılacak ikinci sayıyı giriniz : ");
        sayi2 = input.nextInt();

        System.out.println("Toplama için : 1 ," +
                "\nÇıkarma için : 2 ," +
                "\nÇarpma için : 3 ," +
                "\nBölme için : 4 ," +
                "\n" +
                "Yapmak istediğiniz işlem kodunu giriniz :");

        islemTipi = input.nextInt();

        if(islemTipi == 1 || islemTipi == 2 || islemTipi == 3 || islemTipi == 4 ){
            switch (islemTipi){
                case 1 :
                    sonuc =  sayi1 + sayi2;
                    System.out.println("İşleminizin sonucu : " + sonuc);
                    break;
                case 2 :
                    sonuc =  sayi1 - sayi2;
                    System.out.println("İşleminizin sonucu : " + sonuc);
                    break;
                case 3 :
                    sonuc =  sayi1 * sayi2;
                    System.out.println("İşleminizin sonucu : " + sonuc);
                    break;
                case 4 :
                    sonuc =  sayi1 / sayi2;
                    System.out.println("İşleminizin sonucu : " + sonuc);
                    break;

            }
        }else{
            System.out.println("Geçerli bir işlem tipi girmediniz !!!");
        }
    }
}
