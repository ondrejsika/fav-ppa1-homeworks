/*
 * PPA1 cv5 1 2012/2013
 * @author Ondrej Sika http://ondrejsika.com
 */

import java.util.*;

class Ppa1_cv05_3_A12B0560P {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        int b = (int) a;
        System.out.println("---Vysledky---");
        if ((b % 2) != 0) {
            System.out.println("Cela cast "+a+" je liche cislo");
            return;
        }
        System.out.println("Cela cast "+a+" je sude cislo");
    }
}