//******************WAJP to take user input & count no. of 0's and 1's bits in that number.*****************************
package number_programming;
import java.util.Scanner;

public class count_0_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number here: ");
        int n = sc.nextInt();
        int a = n;
        int count_0=0;
        int count_1=0;


        while (n>0){
            int rem = n%2;
            if (rem==1){
                count_1++;
            }
            else {
                count_0++;
            }

            n/=2;

        }
        System.out.println("Total numbers of 0 in " + a+" is: " + count_0);
        System.out.println("Total numbers of 1 in " + a+" is: " + count_1);

    }
}
