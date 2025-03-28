import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int number1, number2, ebob;
        Scanner value = new Scanner(System.in);

        System.out.print("Ebob Hesaplama Programına Hoşgeldiniz.\nLütfen Birinci Sayıyı Giriniz : ");
        number1 = value.nextInt();

        System.out.print("Lütfen İkinci Sayıyı Giriniz : ");
        number2 = value.nextInt();

        ebob = 1;
        int i = (number1 < number2) ? number1 : number2;

        while (i > 0) {
            if (number1 % i == 0 && number2 % i == 0) {
                ebob = i;
                break;
            }
            i--;
        }
        System.out.println("Ebob Sonucu : " + ebob);
        value.close();

    }
}