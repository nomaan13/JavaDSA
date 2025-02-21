//WAJP to print each digit from :  (i)left to right  (ii) Right to Left
package number_programming;

import java.util.Scanner;
public class print_digit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number here: ");
        int n= sc.nextInt();

//*********************************************(i) Left to Right********************************************************

       /* while (n>0){
            int rem = n%10;
            System.out.print(rem + " " );
            n/=10;
        }*/

//*********************************************(ii) Right to Left*******************************************************
        int a =n ;
        int count = 0;


        while (n>0){
            count++;
            n/=10;
        }
        int x=count-1;

        while (x>=0){
            int rem = (int) (a/Math.pow(10,x))%10;
            System.out.print(rem +" ");
            x--;
        }

//***********************************************THE END****************************************************************

    }
}
