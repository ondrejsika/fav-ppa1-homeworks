/*
 * PPA1 cv4 1 2012/2013
 * @author Ondrej Sika http://ondrejsika.com
 */

import java.util.*;

class Ppa1_cv04_1_A12B0560P {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println("---Vysledky---");
        System.out.println("Rovnice: "+a+" * x + "+b+" = 0");

        if (a == 0 && b == 0) {
            System.out.println("ma nekonecne reseni");
            return;
        }

        if (a == 0 && b == 1){
            System.out.println("nema reseni v R");
            return;
        }

        float x = -b / (float) a;
        System.out.println("ma reseni x = "+x);
        return;
    }
}