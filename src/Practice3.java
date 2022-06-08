import java.util.Scanner;

public class Practice3 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int count = 0;

        // A program that finds and displays the number of numbers less than 50 out of 10 entered by the user
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + ".sayıyı Girin : ");
            int a = kb.nextInt();
            if (a < 50) {
                count = count + i;
            }
        }
        System.out.println("50 den küçük girilen sayı adeti : " + count);

    }
}
