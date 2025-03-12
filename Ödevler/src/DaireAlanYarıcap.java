package src;

import java.util.Scanner;

public class DaireAlanYarıcap {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int r;
        double pi = 3.14;

        System.out.print("Dairenin Yarıçapını Griniz: ");

        r = input.nextInt();
        double alan = pi * r * r;
        double cevre = 2 * pi * r;

        System.out.println("Dairenin Alanı: " + alan);
        System.out.println("Dairenin Çevresi: " + cevre);

        input.close();
    }
}
