/*
 * PPA1 cv5 1 2012/2013
 * @author Ondrej Sika http://ondrejsika.com
 */

import java.util.*;

class Ppa1_cv05_5_A12B0560P {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] in = sc.nextLine().split(" ");
        int a = Integer.parseInt(in[0]);
        int b = Integer.parseInt(in[1]);
        int c = a * b;
        int side = 0;
        print(""+a+" "+b);
        for(int i=1;i<=c;i++){
            if (((i % a) == 0) && ((i % b) == 0)){
                side = i;
                break;
            }
        }

        print("---Vysledky---");
        print("Strana nejmensiho ctverce = "+side);
        print("Pocet karet = "+((int)((float)side*side / a / b)));
    }
}