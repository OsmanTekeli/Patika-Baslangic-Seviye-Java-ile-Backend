import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner deger = new Scanner(System.in);
        int n, r;

        System.out.print("N değerini giriniz: ");
        n = deger.nextInt();
        System.out.print("R değerini giriniz: ");
        r = deger.nextInt();

        if (r > n || n < 0 || r < 0) {
            System.out.println("Hatalı giriş! N, R'den büyük ve ikisi de pozitif olmalıdır.");
        } else {

            long kombinasyon = faktoriyel(n) / (faktoriyel(r) * faktoriyel(n - r));
            System.out.println("C(" + n + "," + r + ") = " + kombinasyon);
        }
        deger.close();
    }

    public static long faktoriyel(int sayi) {
        long sonuc = 1;
        for (int i = 1; i <= sayi; i++) {
            sonuc *= i;
        }
        return sonuc;
    }

}
