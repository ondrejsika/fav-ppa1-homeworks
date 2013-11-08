/*
 * PPA1 cv4 2 2012/2013
 * @author Ondrej Sika http://ondrejsika.com
 */

import java.util.*;

class Ppa1_cv04_2_A12B0560P {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();

        System.out.println("---Vysledky---");
        if (Math.signum(a) == 0) {
            System.out.println("Vstup = 0.0");
            return;
        }

        if (Math.signum(a) == 1){
            System.out.println("10^"+a+" = "+Math.pow(10, a));
        }
        else {
            System.out.println(""+(-a)+" odmocnina z 10 = "+Math.pow(10, 1/(-a)));
        }
    }
}