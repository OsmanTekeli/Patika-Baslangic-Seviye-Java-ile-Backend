
import java.util.Scanner;

public class Main {
    /**
     * @param args
     */
    public static void main(String[] args) {
        // Değişkenlerin Oluşturulması
        int matematik, fizik, kimya, turkce, tarih, muzik;
        String g = "Geçti", k = "Kaldı", o = "Ortalama ile geçti";
        Scanner deger = new Scanner(System.in);

        // Kullanıcılardan Değerleri Alma
        System.out.print("Matematik Notunuzu Giriniz : ");
        matematik = deger.nextInt();

        System.out.print("Fizik Notunuzu Giriniz : ");
        fizik = deger.nextInt();

        System.out.print("Kimya Notunuzu Giriniz : ");
        kimya = deger.nextInt();

        System.out.print("Türkçe Notunuzu Giriniz : ");
        turkce = deger.nextInt();

        System.out.print("Tarih Notunuzu Giriniz : ");
        tarih = deger.nextInt();

        System.out.print("Müzik Notunuzu Giriniz : ");
        muzik = deger.nextInt();

        int toplam = (matematik + fizik + kimya + turkce + tarih + muzik);
        double sonuc = toplam / 6.0;

        // Eğer ortalamayı kullanmak istiyorsanız:
        System.out.println("Ortalamanız : " + sonuc);
        // Geçme-Kalma durumu için:
        System.out.println("Sonuç : " + (sonuc > 60 ? (sonuc == 60 ? o : g) : k));

        // Scanner kapatılıyor
        deger.close();
    }
}
