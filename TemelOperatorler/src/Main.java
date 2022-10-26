public class Main {
    public static void main(String[] args) {

/*
        // aritmatik operatörler
        // aslında değişken tanımlarken de atama operatörü "=" kullanıyoruz
        int a = 5, b = 2;
        System.out.println("a = "+a+" , b = "+b
                            +"\nToplama: a+ b= " +(a+b)
                            +"\nÇıkarma: a-b= "+(a-b)
                            +"\nÇarpma: a*b = "+ (a*b)
                            +"\nBölme: a/b= "+(a/b)
                            +"\nMod Alma: a%b="+(a%b)
                            +"\nDeğeri 1 arttırma: a++ = "+ (a++)
                            +"\nDeğeri 1 eksiltme: b-- = "+ (b--)
                            +"\n-----------------------------*****--------------");
        // gördüğünüz gibi yukarda yazdırma işleminde değerimizi arttıramadık
        // aşağıda a ve b yi yukardaki yöntemle yeni değer ataması yapıp yazdıralım.
        a = a++;
        b = b--;

        System.out.println("a = "+ a + " , b = "+b);



        //karşılaştırma operatörleri

        int a = 5, b = 2;

        boolean esitlikSorgusu = a==b;
        boolean esitDegilSorgusu = a!=b;
        boolean buyukturSorgusu = a>b;
        boolean kucukturSorgusu = a<b;
        boolean buyukEsitSorgusu = a>=b;
        boolean kucukesitSorgusu = a<=b;


        System.out.println("a = "+a+" , b = "+b
                            +"\nEşitlik : a == b  :"+esitlikSorgusu
                            +"\nEşit Değil : a != b  :"+esitDegilSorgusu
                            +"\nBüyüktür : a > b   :"+buyukturSorgusu
                            +"\nKüçüktür : a < b   :"+kucukturSorgusu
                            +"\nBüyük Eşittir : a >= b  :"+buyukEsitSorgusu
                            +"\nKüçük Eşittir : a <= b   :"+kucukesitSorgusu);




        //Mantıksal operatörler
        // bu kısım aslında lisede matematikte gördüğümüz mantık konusu ile aynı
        // bu kısımla alakalı bir görsel koyacam e-book a

        boolean a = true;
        boolean b = false;
        boolean c = true;
        boolean d = false;
        boolean sonuc;

        // &&    Ve operatörü

        //true true
        sonuc = a&&c;
        System.out.println("Ve operatoru true true sonuc = "+sonuc);

        // true false
        sonuc = a&&b;
        System.out.println("Ve operatoru true false sonuc = "+sonuc);

        // false true sonuc
        sonuc = d&&c;
        System.out.println("Ve operatoru false true sonuc = "+sonuc);

        // false false sonuc
        sonuc = d&&b;
        System.out.println("Ve operatoru false true sonuc = "+sonuc);


        boolean a = true;
        boolean b = false;
        boolean c = true;
        boolean d = false;
        boolean sonuc;

        // ||   Veya operatörü

        //true true
        sonuc = a||c;
        System.out.println("Veya operatoru true true sonuc = "+sonuc);

        // true false
        sonuc = a||b;
        System.out.println("Veya operatoru true false sonuc = "+sonuc);

        // false true sonuc
        sonuc = d||c;
        System.out.println("Veya operatoru false true sonuc = "+sonuc);

        // false false sonuc
        sonuc = d||b;
        System.out.println("Veya operatoru false true sonuc = "+sonuc);

*/

        boolean a = true;
        boolean b = false;
        boolean c = true;
        boolean d = false;
        boolean sonuc;

        // ! değil operatörü

        //true true
        sonuc = !(a&&c);
        System.out.println("Ve operatoru true true  değildir ile sonuc = "+sonuc);

        // true false
        sonuc = !(a&&b);
        System.out.println("Ve operatoru true false değildir ile sonuc = "+sonuc);

        // false true
        sonuc = !(d&&c);
        System.out.println("Ve operatorun false true değildir ile sonuc = "+sonuc);

        // false false
        sonuc = !(d&&b);
        System.out.println("Ve operatoru false true değildir ile sonuc = "+sonuc);




    }
}
