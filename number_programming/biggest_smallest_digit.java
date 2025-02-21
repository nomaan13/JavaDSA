//**********************WAJP to take user input and print biggest and smallest digit in the no.*************************
package number_programming;
import java.util.Scanner;

public class biggest_smallest_digit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number here : ");
        int n = sc.nextInt();

        int smallest_digit = 9 ;
        int largest_digit  = 0 ;

        while (n>0){
            int rem = n%10;
            if (rem>largest_digit){
                largest_digit = rem;

            }
            if (rem<smallest_digit){
                smallest_digit=rem;
            }
            n/=10;
        }
        System.out.println("Smallest digit in entered number is :  " + smallest_digit);
        System.out.println("Largest digit in entered number is :   " + largest_digit);

    }
}
