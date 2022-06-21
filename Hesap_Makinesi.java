import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n1, n2;
        int select = 0;


        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen ilk Sayýyý Giriniz : ");
        n1 = input.nextInt();
        System.out.print("Lütfen ikinci sayýyý giriniz : ");
        n2 = input.nextInt();

        System.out.println("1-toplama\n 2-çýkarma\n 3-çarpma\n 4-bölme");
        System.out.println("seçiminiz :  ");
        select = input.nextInt();


        switch (select) {
            case 1:
                System.out.println("Toplama : " + (n1 + n2));
                break;
            case 2:
                System.out.println("Çýkarma : " + (n1 - n2));
                break;
            case 3:
                System.out.println("Çarpma : " + (n1 * n2));
                break;
            case 4:
                if (n2 != 0)
                {
                    System.out.println("Bölme " + (n1 / n2));
                } else {
                    System.out.println("Bir sayý 0'a bölünemez");

                      }
            default :
                System.out.print("Yanlýþ seçim yaptýnýz!");
                break;
        }

    }
}
