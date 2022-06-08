import java.util.Scanner;

public class Practice6 {
    public static void main(String[] args) {
        // Grade calculation
        Scanner kb = new Scanner(System.in);
        double a[] = {55.5, 60, 70, 40, 20, 60};
        int i, size, adet = 0;
        size = 6;

        for (i = 0; i < size; i = i + 1)
            if (a[i] > 50)
                adet = adet + 1;
        System.out.println("50’den büyük notların sayısı : " + adet);
    }
}
