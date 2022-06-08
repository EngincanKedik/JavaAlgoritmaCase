import java.util.Scanner;

public class Practice4 {
    public static void main(String[] args) {
        // Program to find number of odd numbers in array
        Scanner kb = new Scanner(System.in);
        int a[] = {4, 8, 3, 1, 18, 9, 21, 20, 5, 17};
        int i, size, count;
        size = 10;
        count = 0;

        for (i = 0; i < size; i = i + 1)
            if (a[i] % 2 != 0) {
                System.out.print(a[i] + " ");
                count = count + 1;
            }

        System.out.println();
        System.out.println("Toplam tek sayı adet : " + count);
    }
}
