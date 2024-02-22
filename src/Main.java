import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        //Değişkenleri oluşturalım
        int matematik, fizik, kimya, muzik, tarih, turkce;

        //Scanner sınıfını tanımlayalım
        Scanner input = new Scanner(System.in);

        //Kullanıcıdan değerleri alalım.
        System.out.print("Matematik notunuzu giriniz:");
        matematik = input.nextInt() ;

        System.out.print("Kimya notunuzu giriniz:");
        kimya = input.nextInt() ;

        System.out.print("Fizik notunuzu giriniz:");
        fizik = input.nextInt() ;

        System.out.print("Türkçe notunuzu giriniz:");
        turkce = input.nextInt() ;

        System.out.print("Tarih notunuzu giriniz:");
        tarih = input.nextInt() ;

        System.out.print("Müzik notunuzu giriniz:");
        muzik = input.nextInt() ;

        int toplam = ( matematik + kimya + fizik + turkce + tarih + muzik );
        double sonuc = toplam / 6.0;
        System.out.println ("Ortalamanız: " + sonuc);

        String ortalama = sonuc >= 60 ? "Sınıfı Geçtiniz! " : "Sınıfta kaldınız... ";
        // sonuc 60 dan büyük veya küçükse duruma göre geçti kaldıyı yazdır

        System.out.println(ortalama);

    }
    }
