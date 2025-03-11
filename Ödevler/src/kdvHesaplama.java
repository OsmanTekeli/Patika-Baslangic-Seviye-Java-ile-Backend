package src;

import java.util.Scanner;

public class kdvHesaplama {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
       

        System.out.print("KDV'siz fiyatı giriniz: ");
        double fiyat = input.nextDouble();

        double kdvOran;
        // Girilen fiyatın kontrolü
        if (fiyat < 0) {
            System.out.println("Geçersiz fiyat girdiniz.");
            return;
        } else if (fiyat <= 1000) {
            kdvOran = 0.18;
        } else {
            kdvOran = 0.08;
        }

        // KDV tutarı ve KDV'li fiyatın hesaplanması
        double kdvTutari = fiyat * kdvOran;
        double kdvFiyat = fiyat + kdvTutari;

        // Sonuçların ekrana yazdırılması
        System.out.println("KDV'siz Fiyat: " + fiyat);
        System.out.println("KDV Tutarı: " + kdvTutari);
        System.out.println("KDV'li Fiyat: " + kdvFiyat);
    }
}
