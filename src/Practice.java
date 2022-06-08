public class Practice {
    public static void main(String[] args) {

        // Program that outputs the multiplication table with For loop
        for (int i = 1; i <= 10; i++ )
            for (int k = 1; k <= 10; k++ ) {
                int result = k * i;
                System.out.println(i + " x " + k + " = " + result);
            }
    }
}
