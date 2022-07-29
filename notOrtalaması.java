import java.util.Scanner;
/**
 * notOrtalaması
 */
public class notOrtalaması {

    public static void main(String[] args) {
        //Degiskenleri olustur
        int mat,fizik,kimya,tarih,turkce,muzik;
        //Scanner sınıfı tanımladık
        Scanner inp = new Scanner(System.in) ;
        //kullanıcıdan degerleri al
        System.out.print("Matematik Notunuz: ");
        mat = inp.nextInt();

        System.out.print("Fizik Notunuz: ");
        fizik = inp.nextInt();

        System.out.print("Kimya Notunuz: ");
        kimya = inp.nextInt();

        System.out.print("Turkce Notunuz: ");
        turkce = inp.nextInt();

        System.out.print("Tarih Notunuz: ");
        tarih = inp.nextInt();

        System.out.print("Muzik Notunuz: ");
        muzik = inp.nextInt();

        int toplam = (mat+fizik+kimya+tarih+turkce+muzik);
        double sonuc = toplam / 6;
        System.out.println("Not ortalamanız: "+sonuc);
        
        String str = sonuc>=60 ? "Sınıfı geçtiniz!" : "Sınıfıta kaldiniz!";
        System.out.println(str);
    }
}