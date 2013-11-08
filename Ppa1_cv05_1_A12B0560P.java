/*
 * PPA1 cv5 1 2012/2013
 * @author Ondrej Sika http://ondrejsika.com
 */

import java.util.*;

class Ppa1_cv05_1_A12B0560P {
    static boolean is_prime(int number) {
        if (number < 2) return false;
        if (number == 2) return true;
        if (number % 2 == 0) return false;
        int max = (int) Math.sqrt(number);
        for (int i = 3; i <= max; i += 2) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int max = sc.nextInt();

        System.out.println("---Vysledky---");

        for(int i=2; i<max; i++){
            if (is_prime(i)) System.out.System.out.println(""+i+", ");
        }
    }
}