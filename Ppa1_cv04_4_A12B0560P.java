/*
 * PPA1 cv4 4 2012/2013
 * @author Ondrej Sika http://ondrejsika.com
 */

import java.util.*;

class Ppa1_cv04_4_A12B0560P {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        double x = Math.sqrt((a*a+b*b+c*c)/3.0);

        System.out.println("---Vysledky---");
        System.out.println("Kvadraticky prumer = "+x);
    }
}