import java.util.Scanner;

public class Practice7 {
    public static void main(String[] args) {
        /* Program that assigns the first n elements of the array to the end of the array
        and resets the beginning elements (it will be 0) */
        Scanner kb = new Scanner(System.in);
        //         0  1  2  3  4   5  6   7   8  9
        int a[] = {4, 8, 3, 1, 18, 9, 21, 20, 5, 17};
        int i, n, size = 10;

        System.out.print("n'yi giriniz : ");
        n = kb.nextInt();

        for (i = 0; i < n; i = i + 1)
            a[size - 1 - i] = a[n - 1 - i];
        for (i = 0; i < size - n; i = i + 1)
            a[i] = 0;
        for (i = 0; i < size; i = i + 1)
            System.out.println(a[i]);
    }
}
