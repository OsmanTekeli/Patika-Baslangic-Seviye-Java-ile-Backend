package src;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Birinci kenarı girin: ");
        double a = input.nextDouble();

        System.out.print("İkinci kenarı girin: ");
        double b = input.nextDouble();

        System.out.print("Üçüncü kenarı girin: ");
        double c = input.nextDouble();

        double perimeter = a + b + c;
        double u = perimeter / 2;
        double area = Math.sqrt(u * (u - a) * (u - b) * (u - c));

        System.out.println("Üçgenin alanı: " + area);

        input.close();
    }
}
