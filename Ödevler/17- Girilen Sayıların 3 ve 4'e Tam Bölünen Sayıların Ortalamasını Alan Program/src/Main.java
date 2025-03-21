import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Kullanıcıdan giriş alma
        System.out.print("Bir sayı giriniz: ");
        int k = input.nextInt();

        int toplam = 0, adet = 0;

        for (int i = 1; i <= k; i++) {
            if (i % 3 == 0 && i % 4 == 0) {
                toplam += i;
                adet++;
            }
        }

        if (adet > 0) {
            double ortalama = (double) toplam / adet;
            System.out.println("3'e ve 4'e tam bölünen sayıların ortalaması: " + ortalama);
        } else {
            System.out.println("Girilen aralıkta 3 ve 4'e tam bölünen bir sayı yok.");
        }

        input.close();
    }
}
