import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n1, n2;
        int select = 0;


        Scanner input = new Scanner(System.in);
        System.out.print("L�tfen ilk Say�y� Giriniz : ");
        n1 = input.nextInt();
        System.out.print("L�tfen ikinci say�y� giriniz : ");
        n2 = input.nextInt();

        System.out.println("1-toplama\n 2-��karma\n 3-�arpma\n 4-b�lme");
        System.out.println("se�iminiz :  ");
        select = input.nextInt();


        switch (select) {
            case 1:
                System.out.println("Toplama : " + (n1 + n2));
                break;
            case 2:
                System.out.println("��karma : " + (n1 - n2));
                break;
            case 3:
                System.out.println("�arpma : " + (n1 * n2));
                break;
            case 4:
                if (n2 != 0)
                {
                    System.out.println("B�lme " + (n1 / n2));
                } else {
                    System.out.println("Bir say� 0'a b�l�nemez");

                      }
            default :
                System.out.print("Yanl�� se�im yapt�n�z!");
                break;
        }

    }
}
