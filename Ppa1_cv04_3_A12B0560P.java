/*
 * PPA1 cv4 3 2012/2013
 * @author Ondrej Sika http://ondrejsika.com
 */

import java.util.*;

class Ppa1_cv04_3_A12B0560P {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = Math.abs(sc.nextInt());

        System.out.println("---Vysledky---");
        if (((a % 90) == 0) && ((a % 180) != 0)) {
            System.out.println("tangens nedefinovan");
            return;
        }

        System.out.println("tan("+a+") = "+Math.tan(Math.toRadians(((double)a))));
    }
}