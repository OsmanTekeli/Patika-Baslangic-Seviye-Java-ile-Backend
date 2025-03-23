import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int o;
        Scanner entered = new Scanner(System.in);

        System.out.print("4 ve 5'in kuvvetlarini Bulan Programa Hoşgeldiniz. \nLütfen Sayı Giriniz: ");
        o = entered.nextInt();

        for (int i = 1; i <= o; i *= 4) {
            System.out.println("4'ün Kuvvetleri : " + i);
        }
        System.out.println("");
        for (int i = 1; i <= o; i *= 5) {
            System.out.println("5'ün Kuvvetleri : " + i);

        }
        entered.close();
    }
}
