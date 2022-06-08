import java.util.Scanner;

public class Practice2 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        // Calculating the Sum of Numbers Between Two Numbers with for
        int sayi1, sayi2;
        int toplam = 0;

        System.out.print("a'yı giriniz : ");
        sayi1 = kb.nextInt();
        System.out.print("b'yi giriniz : ");
        sayi2 = kb.nextInt();

        for (int i = sayi1; i <= sayi2; i++) {
            toplam = toplam + i;
        }
        System.out.println("Sayıların toplamı : " + toplam);
    }
}
