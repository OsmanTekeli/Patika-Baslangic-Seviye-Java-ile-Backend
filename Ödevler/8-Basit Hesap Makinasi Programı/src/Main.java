package src;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int number1, number2, select;

        Scanner input = new Scanner(System.in);
        System.out.print("Birinci Sayıyı Giriniz :");
        number1 = input.nextInt();
        System.out.print("İkinci Sayıyı Giriniz : ");
        number2 = input.nextInt();

        System.out.println("1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme");
        System.out.print("Seçiminiz : ");
        select = input.nextInt();

        switch (select) {
            case 1:
                System.out.print("Toplama İşlemi Sonucu :" + (number1 + number2));
                break;
            case 2:
                System.out.print("Çıkarma İşlemi Sonucu  :" + (number1 - number2));
                break;
            case 3:
                System.out.print("Çarpma İşlemi Sonucu : " + (number1 * number2));
                break;
            case 4:
                if (number2 != 0) {
                    System.out.println("Bölme İşlemi Sonucu : " + (number1 / number2));
                } else {
                    System.out.println("Bir sayı 0'a bölünmez");
                }
                break;
            default:
                System.out.println("Yanlış Seçim Yaptınız");
        }
        input.close();
    }

}