import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String userName, passWord;
        int balance = 3000;
        int right = 3;
        int select;

        Scanner value = new Scanner(System.in);

        while (right > 0) {
            System.out.print("Tekeli Banka Hoşgeldiniz\nLütfen Kullanıcı Adınızı Giriniz : ");
            userName = value.nextLine();

            System.out.print("Lütfen Şifrenizi Giriniz : ");
            passWord = value.nextLine();

            if (userName.equals("osmantekeli") && passWord.equals("sifre123")) {
                System.out.println("Tekeli Banka Hoşgeldiniz!");

                do {
                    System.out.println(
                            "1- Para Yatırma\n2- Para Çekme\n3- Bakiye Sorgulama\n4- EFT İşlemi\n5- Çıkış");
                    System.out.print("Lütfen yapmak istediğiniz işlemi seçiniz: ");
                    select = value.nextInt();
                    value.nextLine(); // Buffer temizleme

                    switch (select) {
                        case 1:
                            System.out.print("Yatırmak istediğiniz miktarı giriniz: ");
                            int deposit = value.nextInt();
                            balance += deposit;
                            System.out.println("Yeni bakiyeniz: " + balance + " TL");
                            break;
                        case 2:
                            System.out.print("Çekmek istediğiniz miktarı giriniz: ");
                            int withdraw = value.nextInt();
                            if (withdraw > balance) {
                                System.out.println("Bakiye yetersiz!");
                            } else {
                                balance -= withdraw;
                                System.out.println("Yeni bakiyeniz: " + balance + " TL");
                            }
                            break;
                        case 3:
                            System.out.println("Mevcut bakiyeniz: " + balance + " TL");
                            break;
                        case 4:
                            System.out.print("EFT yapılacak kişinin adını giriniz: ");
                            String firstName = value.nextLine();
                            System.out.print("EFT yapılacak kişinin soyadını giriniz: ");
                            String lastName = value.nextLine();
                            System.out.print("EFT yapılacak kişinin Iban'nını giriniz: ");
                            String id = value.nextLine();
                            System.out.print("EFT miktarını giriniz: ");
                            int eftAmount = value.nextInt();

                            if (eftAmount > balance) {
                                System.out.println("Bakiye yetersiz! EFT işlemi gerçekleştirilemedi.");
                            } else {
                                balance -= eftAmount;
                                System.out.println(firstName + " " + lastName + " (" + id + ") kişisine " +
                                        eftAmount + " TL EFT işlemi gerçekleşti.");
                                System.out.println("EFT sonrası güncellenmiş bakiyeniz: " + balance + " TL");
                            }
                            break;
                        case 5:
                            System.out.println("Çıkış yapılıyor, iyi günler!");
                            break;
                        default:
                            System.out.println("Geçersiz işlem!");
                    }
                } while (select != 5);
                break;
            } else {
                right--;
                System.out.println("Kullanıcı adı veya şifre yanlış. Kalan hakkınız: " + right);

                if (right == 0) {
                    System.out.println("Hesabınız bloke olmuştur. Lütfen bankanız ile iletişime geçiniz.");
                }
            }
        }
        value.close();
    }
}
