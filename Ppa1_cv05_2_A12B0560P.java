/*
 * PPA1 cv5 1 2012/2013
 * @author Ondrej Sika http://ondrejsika.com
 */

import java.util.*;

class Ppa1_cv05_2_A12B0560P {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println("---Vysledky---");
        if (a < Math.pow(10, b-1)) {
            System.out.println("Cisla "+a+" a "+b+" jsou chybne zadana");
            return;
        }

        if (b == 1) {
            System.out.println(""+(a % 10));
            return;
        }

        if (b == 2) {
            System.out.println(""+(a % 100));
            return;
        }
        System.out.println(""+a);
    }
}