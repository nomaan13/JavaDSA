//****************WAJP to take user input anf count the no. of bits in that no.*****************************************

package number_programming;

import java.util.Scanner;

public class no_of_bits {
    public static void countBits(int n){
        int count=0;
        while(n>0){
            int rem = n%2;
            count++;
            n/=2;

        }
        System.out.print("Total numbers of bits in "+ " is: " +count);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number here: ");
        int n = sc.nextInt();
        countBits(n);





    }

}
