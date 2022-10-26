public class Main {
    public static void main(String[] args) {

      /*  int a = 15;
        int b = 25;

        if(b>a) {
            System.out.println("B  A'dan büyüktür.");
        }else{
            System.out.println("A   B' büyüktür.");
        }  */

     /*   int a = 19;
        int b = 25;
        int c = 40;

        if(c >= a+b) {
            System.out.println("c    a ve b nin toplamına eşit veya daha büyüktür");
        }else{
            System.out.println("c     a ve b nin toplamından küçüktür.");
        }



        int a = 10;
        int b = 26;
        int c = 36;

        if(b + c == a){
            System.out.println(" b ve c nin toplamı a' ya eşittir.");
        }else if (a + c == b){
            System.out.println(" a ve c nin toplamı b' ya eşittir.");
        }else if (a + b == c){
            System.out.println(" a ve b nin toplamı c' ya eşittir.");
        }else{
            System.out.println(" Verilen şartların hiçbiri sağlanamadı.");
        }

      */

        int a = 100;
        int b = 150;
        int c =250;

        if (c == a+b){
            if (c / (a+b) == 1){
                System.out.println("Bu yazı ilk if in true daha sonra\n  içindeki if in true olduğu \n  durumlarda console a yazılacak ");
            }
        }else{
            System.out.println("Şartlar sağlanamadı.");
        }

        System.out.println("PROGRAM BİTTİ.");

    }
}
