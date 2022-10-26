public class Main {
    public static void main(String[] args) {

        for (int i = 1; i<20 ; i=i+2){
            if(i==15){
                System.out.println("i'nin değeri "+i+" oldu döngü kırılcak");
                break;
            }else {
                System.out.println("i'nin değeri: "+i);
                continue;

            }

        }
    }
}
