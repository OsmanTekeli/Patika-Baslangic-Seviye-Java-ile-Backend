import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int yas, yolculukTipi;

        double mesafe, biletFiyati, indirimTutari, indirimliToplamTutar;

        double indirimliKucukYas = (0.5), indirimGencYas = (0.1), indirimYasliYas = (0.3), indirimGidisDonus = (0.2);

        Scanner input = new Scanner(System.in);

        System.out.println("Lütfen Yolculuk Tipini Seçiniz : \n1-Tek Yön\n2-Gidiş-Dönüş");
        System.out.print("Seçiminiz : ");
        yolculukTipi = input.nextInt();

        switch (yolculukTipi) {
            case 1:
                System.out.print(
                        "Tek Yön Tarifesini seçmektesiniz. Toplam tutar bu seçim üzerinden hesaplanacaktır.\n +Lütfen Gideceğiniz mesafeyi(KM) cinsinden yazınız.");
                mesafe = input.nextDouble();
                biletFiyati = (0.10) * (mesafe);
                System.out.println("İndirim tutarı ve toplam ücret için yaşınızı giriniz : ");
                yas = input.nextInt();
                System.out.println("Girmiş Olduğunuz Yaş: " + yas);

                if (yas > 0 && yas < 12) {
                    indirimTutari = (biletFiyati * indirimliKucukYas);
                    indirimliToplamTutar = (biletFiyati) - (indirimTutari);
                    System.out.println("Bilet fiyatnız mesafenize (KM) göre: " + biletFiyati + "TL"
                            + "\nİndirim Tutarı : " + indirimTutari + "TL" + "\nİndirimli Toplam Fiyatınız : "
                            + indirimliToplamTutar + "TL");
                } else if (yas > 12 && yas <= 24) {
                    indirimTutari = (biletFiyati * indirimGencYas);
                    indirimliToplamTutar = (biletFiyati) - (indirimTutari);
                    System.out.println("Bilet Fiyatınız mesafenize(KM) göre:" + biletFiyati + "TL"
                            + "\nİndirim Tutarınız:-" + indirimTutari + "TL" +
                            "\nİndirimli Toplam Fiyatınız:" + indirimliToplamTutar + "TL");

                } else if (yas > 24 && yas < 65) {
                    System.out.println("Bilet Fiyatınız mesafenize(KM) göre:" + biletFiyati + "TL");

                } else if (yas >= 65) {
                    indirimTutari = (biletFiyati * indirimYasliYas);
                    indirimliToplamTutar = (biletFiyati) - (indirimTutari);
                    System.out.println("Bilet Fiyatınız mesafenize(KM) göre:" + biletFiyati + "TL"
                            + "\nİndirim Tutarınız:-" + indirimTutari + "TL" +
                            "\nİndirimli Toplam Fiyatınız:" + indirimliToplamTutar + "TL");
                } else
                    System.out.println("Hatalı Veri Girdiniz!!...");
                break;

            case 2:
                System.out.println(
                        "Gidiş - Dönüş Tarifesini seçmiş bulunmaktasınız, işlemleriniz bu tarife üzerinden ekstra %10 indirimli hesaplanacaktır.\n"
                                +
                                "Lütfen Gideceğiniz Mesafeyi(KM) Giriniz.");
                mesafe = input.nextDouble();
                biletFiyati = (0.10) * (mesafe);

                System.out
                        .println("İnidirim Tutarınızı ve Toplam ücretinizi öğrenebilmek için lütfen yaşınızı giriniz.");
                yas = input.nextInt();
                System.out.println("Girmiş olduğunuz YAŞ:" + yas);

                if (yas >= 0 && yas <= 12) {
                    indirimTutari = (biletFiyati * indirimliKucukYas) + (biletFiyati * indirimGidisDonus);
                    indirimliToplamTutar = (biletFiyati) - (indirimTutari);
                    System.out.println("Bilet Fiyatınız mesafenize(KM) göre:" + biletFiyati + "TL"
                            + "\nİndirim Tutarınız:-" + indirimTutari + "TL" +
                            "\nİndirimli Toplam Fiyatınız:" + indirimliToplamTutar + "TL");

                } else if (yas > 12 && yas <= 24) {
                    indirimTutari = (biletFiyati * indirimGencYas) + (biletFiyati * indirimGidisDonus);
                    indirimliToplamTutar = (biletFiyati) - (indirimTutari);
                    System.out.println("Bilet Fiyatınız mesafenize(KM) göre:" + biletFiyati + "TL"
                            + "\nİndirim Tutarınız:-" + indirimTutari + "TL" +
                            "\nİndirimli Toplam Fiyatınız:" + indirimliToplamTutar + "TL");

                } else if (yas > 24 && yas < 65) {
                    indirimTutari = (biletFiyati * indirimGidisDonus);
                    indirimliToplamTutar = (biletFiyati) - (indirimTutari);
                    System.out.println("Bilet Fiyatınız mesafenize(KM) göre:" + biletFiyati + "TL"
                            + "\nİndirim Tutarınız:-" + indirimTutari + "TL" +
                            "\nİndirimli Toplam Fiyatınız:" + indirimliToplamTutar + "TL");

                } else if (yas >= 65) {
                    indirimTutari = (biletFiyati * indirimYasliYas);
                    indirimliToplamTutar = (biletFiyati) - (indirimTutari) + (biletFiyati * indirimGidisDonus);
                    System.out.println("Bilet Fiyatınız mesafenize(KM) göre:" + biletFiyati + "TL"
                            + "\nİndirim Tutarınız:-" + indirimTutari + "TL" +
                            "\nİndirimli Toplam Fiyatınız:" + indirimliToplamTutar + "TL");
                } else
                    System.out.println("Hatalı Veri Girdiniz!!...");
                break;

            default:
                System.out.println("Eksik yada Hatalı Tuşlama yaptınız Tekrar Deneyiniz....\n"
                        + "Girmiş Olduğunuz değer:" + yolculukTipi);
                break;

        }
        input.close();

    }
}