import java.util.Scanner;

public class Practice8 {
    public static void main(String[] args) {
        // Program that relocating elements of array according to parameters
        Scanner kb = new Scanner(System.in);

        int a[] = {4, 8, 3, 1, 18, 9, 21, 20, 5, 17};
        int b[] = new int [10];
        int i, size, n, s;
        size = 10;

        System.out.print("n'yi giriniz : ");
        n = kb.nextInt();

        for (i = 0; i < n; i = i + 1)
            b[i] = a[i];

        for (i = n; i < size; i = i + 1)
            a[i - n] = a[i];

        for (i = 0; i < n; i = i + 1)
            a[size - n + i] = b[i];

        for(i = 0; i < size; i = i + 1)
            System.out.println(a[i]);
    }
}
