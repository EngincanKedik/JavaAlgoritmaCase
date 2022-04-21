import java.util.Scanner;

public class Manav {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        /* The program that prints the total amount of the products they bought from the grocery store,
         according to the kilogram values, on the screen. */

        // Here I have defined the variables that I will use.
        double toplam, armut, elma, domates, muz, patlıcan, a, e, d, m, p;

        // Here I defined the value of the variables.
        armut = 2.14;
        elma = 3.67;
        domates = 1.11;
        muz = 0.95;
        patlıcan = 5.00;

        /* First I wait for the user to enter a value, then I assign a value to my variable
           using the Here Scanner method. */
        System.out.print("Armut Kaç kilo ? ");
        a = kb.nextInt();

        System.out.print("Elma Kaç kilo ? ");
        e = kb.nextInt();

        System.out.print("Domates Kaç kilo ? ");
        d = kb.nextInt();

        System.out.print("Muz Kaç kilo ? ");
        m = kb.nextInt();

        System.out.print("Patlıcan Kaç kilo ? ");
        p = kb.nextInt();

        // Here I calculate inside the toplam variable, then I print the result using the println method.
        toplam = (armut * a) + (elma * e) + (domates * d) + (muz * m) + (patlıcan * p);
        System.out.println("Toplam Tutar : " + toplam);

    }
}
