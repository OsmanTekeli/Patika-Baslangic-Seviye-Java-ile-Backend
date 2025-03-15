package src;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String userName, password, newPassword, cevap;

        Scanner input = new Scanner(System.in);

        System.out.print("Kullanıcı Adını Giriniz: ");
        userName = input.nextLine();
        System.out.print("Şifrenizi Giriniz: ");
        password = input.nextLine();

        if (userName.equals("patika") && password.equals("patika1234")) {
            System.out.println("Hoş geldiniz, Patika Kullanıcısı!");
        } else {
            System.out.println("Girilen Bilgiler Yanlış veya Eksik. Lütfen Yeniden Deneyin.");
            System.out.print("Şifrenizi sıfırlamak ister misiniz? (Evet/Hayır): ");
            cevap = input.nextLine();

            if (cevap.equalsIgnoreCase("evet")) {
                System.out.print("Yeni şifrenizi giriniz: ");
                newPassword = input.nextLine();

                if (newPassword.equals("patika1234")) {
                    System.out.println("Yeni şifre, eski şifre ile aynı olamaz. Lütfen farklı bir şifre belirleyiniz.");
                } else {
                    System.out.println("Şifre başarıyla oluşturuldu.");
                }
            } else {
                System.out.println("Giriş işlemi iptal edildi.");
            }
        }

        input.close(); 
    }
}
