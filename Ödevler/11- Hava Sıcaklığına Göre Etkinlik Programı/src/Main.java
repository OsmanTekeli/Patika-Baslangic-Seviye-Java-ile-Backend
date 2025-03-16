import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int heat;

        Scanner input = new Scanner(System.in);
        System.out.print("Sıcaklık Giriniz : ");
        heat = input.nextInt();

        switch ((heat < 5) ? 0 : (heat <= 15) ? 1 : (heat < 25) ? 2 : 3) {
            case 0:
                System.out.println("Kayak Yapabilirsiniz. İyi Eğlenceler");
                break;
            case 1:
                System.out.println("Sinemaya Gidebilirsiniz. İyi Eğlenceler");
                if (heat >= 10) {
                    System.out.println("Alternatif Olarak Pikniğe Gitmeyi de Düşünebilirsiniz İyi Eğlenceler");
                }
                break;
            case 2:
                System.out.println("Pikniğe Gidebilirsiniz.İyi Eğlenceler");
                break;
            case 3:
                System.out.println("Yüzmeye Gidebilirsiniz.İyi Eğlenceler");
                break;

        }
        input.close();
    }

}