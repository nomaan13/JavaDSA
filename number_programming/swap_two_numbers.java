//******WAJP to swap a number (i) Without using third variable (ii) Without using third variable*************************
package number_programming;

import java.util.Scanner;

public class swap_two_numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number here: ");
        int a= sc.nextInt();
        System.out.print("Enter second number here: ");
        int b= sc.nextInt();

        //**************************************Without using third variable********************************************

        /*
        a=a+b;
        b=a-b;
        a=a-b;
        */

        //**************************************With using third variable***********************************************

        int c = a;
        c=a ;
        a=b;
        b=c;

        //***********************************END************************************************************************

        System.out.println("After swapping the first number becomes: " + a);
        System.out.println("After swapping the second number becomes: " + b);
    }
}
