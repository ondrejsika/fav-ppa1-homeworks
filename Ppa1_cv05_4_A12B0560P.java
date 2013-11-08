/*
 * PPA1 cv5 1 2012/2013
 * @author Ondrej Sika http://ondrejsika.com
 */

import java.util.*;

class Ppa1_cv05_4_A12B0560P {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        String sgn = sc.next();
        int b = sc.nextInt();

        System.out.println("---Vysledky---");
        if (sgn.equals("+")) {
            System.out.println(""+a+" + "+b+" = "+(a+b));
        }
        else {
            System.out.println(""+a+" - "+b+" = "+(a-b));
        }
    }
}