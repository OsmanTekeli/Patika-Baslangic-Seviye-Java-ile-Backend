package src;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double armut = 2.14, elma = 3.67, domates = 1.11, muz = 0.95, patlican = 5.00;
        double armutKg, elmaKg, domatesKg, muzKg, patlicanKg, toplamTutar;

        Scanner input = new Scanner(System.in);

        System.out.println("Kaç Kilo Armut Aldınız Giriniz : ");
        armutKg = input.nextDouble();
        System.out.println("kaç Kilo Armut : " + armutKg + " Kg ");

        System.out.print("Kaç Kilo Elma Aldınız Giriniz: ");
        elmaKg = input.nextDouble();
        System.out.println("Kaç Kilo Elma : " + elmaKg + " Kg ");

        System.out.print("Kaç Kilo Domates Aldınız Giriniz :");
        domatesKg = input.nextDouble();
        System.out.println("Kaç Kilo Domates : " + domatesKg + " Kg ");

        System.out.print("Kaç Kilo Muz Aldınız Giriniz :");
        muzKg = input.nextDouble();
        System.out.println("Kaç Kilo Muz : " + muzKg + " Kg ");

        System.out.print("Kaç Kilo Patlıcan Aldınız Giriniz :");
        patlicanKg = input.nextDouble();
        System.out.println("Kaç Kilo Patılcan : " + patlicanKg + " Kg ");

        toplamTutar = (armut * armutKg) + (elma * elmaKg) + (domates * domatesKg) + (muz * muzKg)
                + (patlican * patlicanKg);
        System.out.println("Toplam Tutar : " + toplamTutar + " TL ");
        input.close();

    }
}
