import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int k;
        int total = 0;

        Scanner entered = new Scanner(System.in);

        do {
            System.out.print("Lütfen Sayıları Giriniz (Çıkmak İçin 0'a Basınız) : ");
            k = entered.nextInt();
            if ((k % 4 == 0)) {
                total += k;
            }
        } while (k != 0);

        System.out.println("Girilen Sayıların 4'e Tam Bölünenlerin Toplamı : " + total);

        entered.close();

    }

}