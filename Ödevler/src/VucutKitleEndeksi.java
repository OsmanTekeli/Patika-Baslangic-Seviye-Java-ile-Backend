package src;

import java.util.Scanner;

public class VucutKitleEndeksi {
    public static void main(String[] args) {
        double boy, kilo, BKE;
        Scanner input = new Scanner(System.in);

        System.out.println("Lütfen Boyunuzu Metre Cinsinden Giriniz : ");
        boy = input.nextDouble();
        System.out.println("Lütfen Kilonuzu Giriniz: ");
        kilo = input.nextDouble();

        System.out.println("Girmiş Olduğunuz Boy: " + boy);
        System.out.println("Girmiş Olduğunuz Kilo: " + kilo);

        BKE = (kilo) / (boy * boy);
        System.out.println("Vücüt Kitle Endeksiniz :" + BKE);

        input.close();
    }
}
