import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int sum = 0;

        Scanner value = new Scanner(System.in);
        System.out.print(
                "Girilen Sayıynın Basamak Sayılarını Toplamını Verene Programa Hoşgeldiniz\nLütfen Bir Sayı Giriniz : ");
        int number = value.nextInt();

        while (number != 0) {
            sum += number % 10;
            number /= 10;
        }
        System.out.print("Basamakların Toplamı: " + sum);
        value.close();
    }
}