import java.util.Scanner;

public class Manav {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        double toplam, armut, elma, domates, muz, patlıcan, a, e, d, m, p;

        armut = 2.14;
        elma = 3.67;
        domates = 1.11;
        muz = 0.95;
        patlıcan = 5.00;

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

        toplam = (armut * a) + (elma * e) + (domates * d) + (muz * m) + (patlıcan * p);
        System.out.println("Toplam Tutar : " + toplam);

    }
}
