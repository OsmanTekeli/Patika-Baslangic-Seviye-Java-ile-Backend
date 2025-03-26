import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner value = new Scanner(System.in);
        System.out.print(
                "Yıldızlar İle Elmas Yapmaya Hoşgeldiniz.\nElmas Yüksekliği İçin Bir Sayı Giriniz(Tek Sayı Olmasına Dikkat Ediniz) : ");
        int n = value.nextInt();

        if (n % 2 == 0) {
            System.out.println("Lütfen Tek Sayı Giriniz.");
            value.close();
            return;
        }

        int mid = n / 2;

        // Üst yarı
        for (int i = 0; i <= mid; i++) {
            for (int j = 0; j < mid - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Alt yarı
        for (int i = mid - 1; i >= 0; i--) {
            for (int j = 0; j < mid - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        value.close();
    }
}
