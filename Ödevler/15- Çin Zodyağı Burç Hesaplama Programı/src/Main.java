import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int year;

        Scanner input = new Scanner(System.in);

        System.out.print(
                "Merhaba Çin Zodyağına Göre Burç Hesaplama Programına Hoşgeldiniz. \nLütfen Doğum Yılınızı Giriniz :");
        year = input.nextInt();

        switch (year % 12) {
            case 0:
                System.out.print("Girdiğiniz Yıla Göre Çin Zodyağı Burcunuz : Maymun\nGirdiğiniz Yıl : " + year);
                break;
            case 1:
                System.out.print("Girdiğiniz Yıla Göre Çin Zodyağı Burcunuz : Horoz\nGirdiğiniz Yıl :" + year);
                break;
            case 2:
                System.out.print("Girdiğiniz Yıla Göre Çin Zodyağı Burcunuz : Köpek \nGirdiğiniz Yıl :");
                break;
            case 3:
                System.out.print("Girdiğiniz Yıla Göre Çin Zodyağı Burcunuz : Domuz\nGirdiğiniz Yıl:" + year);
                break;
            case 4:
                System.out.print("Girdiğiniz Yıla Göre Çin Zodyağı Burcunuz : Fare \nGirdiğiniz Yıl :" + year);
                break;
            case 5:
                System.out.print("Girdiğiniz Yıla Göre Çin Zodyağı Burcunuz : Öküz\nGirdiğiniz Yıl :" + year);
                break;
            case 6:
                System.out.print("Girdiğiniz Yıla Göre Çin Zodyağı Burcunuz : Kaplan\nGirdiğiniz Yıl :" + year);
                break;
            case 7:
                System.out.print("Girdiğiniz Yıla Göre Çin Zodyağı Burcunuz : Tavşan\nGirdiğiniz Yıl :" + year);
                break;
            case 8:
                System.out.print("Girdiğiniz Yıla Göre Çin Zodyağı Burcunuz : Ejderha\nGirdiğiniz Yıl :" + year);
                break;
            case 9:
                System.out.print("Girdiğiniz Yıla Göre Çin Zodyağı Burcunuz : Yılan\nGirdiğiniz Yıl :" + year);
                break;
            case 10:
                System.out.print("Girdiğiniz Yıla Göre Çin Zodyağı Burcunuz : At\nGirdiğiniz Yıl :" + year);
                break;
            case 11:
                System.out.print("Girdiğiniz Yıla Göre Çin Zodyağı Burcunuz : Koyun\nGirdiğiniz Yıl :" + year);
                break;

        }
        input.close();
    }

}