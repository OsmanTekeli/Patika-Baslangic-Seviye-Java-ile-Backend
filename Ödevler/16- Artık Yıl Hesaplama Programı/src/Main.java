
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Yıl Giriniz :");
        int year = input.nextInt();
        boolean artikYil = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);

        if (artikYil) {
            System.out.print("Artık Yıldır : " + year);
        } else {
            System.out.print("Artık Yıl Değildir : " + year);
        }
        input.close();
    }
}