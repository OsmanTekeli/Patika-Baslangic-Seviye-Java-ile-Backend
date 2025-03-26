import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner value = new Scanner(System.in);

        System.out.print(
                "Harmonik Seriyi Bulma Programına Hoşgeldiniz.\nLütfen Hesaplamak İstediğiniz Sayıyı Giriniz ; ");
        int n = value.nextInt();
        double result = 0.0;

        for (double i = 1; i <= n; i++) {
            result += (1 / i);
        }
        System.out.print("Harmonik Sayı Değeri : " + result + "\nGirilen Değer; " + n);

        value.close();
    }
}