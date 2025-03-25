import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a, b;
        int total = 1;
        Scanner value = new Scanner(System.in);

        System.out.print("Üslü Sayı Hesaplama Programına Hoşgeldiniz. \nLütfen Üssü Hesaplanacak Sayıyı Giriniz ; ");
        a = value.nextInt();

        System.out.print("Lütfen Sayının Kaç Kere Çarpılacağını (Üs Kuvvetini) Giriniz ; ");
        b = value.nextInt();

        for (int i = 1; i <= b; i++) {
            total *= a;
        }
        System.out.println("Hesaplanan Üslü Sayı'nın Cevabı : " + total);

        value.close();
    }
}