import java.util.Scanner;

public class Practice5 {
    public static void main(String[] args) {
        /* Entering S and N from the keyboard, the program that prints N elements to the screen,
         starting from the element number S of the array.
         */
        Scanner kb = new Scanner(System.in);
        //         0  1  2  3  4   5  6   7   8  9
        int a[] = {4, 8, 3, 1, 18, 9, 21, 20, 5, 17};
        int i, s, n, size;
        size = 10;

        System.out.print("s'yi giriniz : ");
        s = kb.nextInt();
        System.out.print("n'yi giriniz : ");
        n = kb.nextInt();

        for (i = s; i < s + n; i = i + 1)
            System.out.print(a[i] + " ");

    }
}
