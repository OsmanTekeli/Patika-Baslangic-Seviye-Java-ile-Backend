package src;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int mat, fizik, turkce, kimya, muzik, notlarToplami = 0;
        double ortalamaHesabi;
        Scanner input = new Scanner(System.in);

        System.out.print("Matematik Notunuzu Giriniz :");
        mat = input.nextInt();
        if (0 <= mat && mat <= 100) {
            notlarToplami += mat;

        } else {
            System.out.println("Lütfen 0 ile 100 arasında bir değer giriniz");
        }

        System.out.print("Fizik Notunuzu Giriniz: ");
        fizik = input.nextInt();
        if (0 <= fizik && fizik <= 100) {
            notlarToplami += fizik;

        } else {
            System.out.println("Lütfen 0 ile 100 arasında bir değer giriniz");
        }

        System.out.print("Türkçe Notunuzu Giriniz : ");
        turkce = input.nextInt();
        if (0 <= turkce && turkce <= 100) {
            notlarToplami += turkce;

        } else {
            System.out.println("Lütfen 0 ile 100 arasında bir değer giriniz");
        }

        System.out.print("Kimya Notunuzu Giriniz :");
        kimya = input.nextInt();
        if (0 <= kimya && kimya <= 100) {
            notlarToplami += kimya;

        } else {
            System.out.println("Lütfen 0 ile 100 arasında bir değer giriniz");
        }

        System.out.print("Müzik Notunuzu Giriniz :");
        muzik = input.nextInt();
        if (0 <= muzik && muzik <= 100) {
            notlarToplami += muzik;

        } else {
            System.out.println("Lütfen 0 ile 100 arasında bir değer giriniz");
        }

        ortalamaHesabi = (notlarToplami) / 5;

        if (ortalamaHesabi < 55) {
            System.out.println("Ortalamanız: " + ortalamaHesabi + "  " +
                    "Sınıfta Kaldınız, seneye görüşmek üzere.");
        } else {
            System.out.println("Ortalamanız: " + ortalamaHesabi + "  " +
                    "Tebrikler Sınıfı Geçtiniz :)");
        }
        input.close();
    }
}


