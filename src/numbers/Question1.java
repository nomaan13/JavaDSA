package numbers;
import java.util.Scanner;

public class Question1 {
	public static void main(String[] args) {
		System.out.println("Hiiiiiiii");
		Scanner sc = new Scanner(System.in);
		System.out.println("ENter  a number here :  ");
		int n = sc.nextInt();
        int a = n;

        // Loop to reverse and print digits from right to left
        while (a != 0) {
            int rem = a % 10;  // Get the last digit
            System.out.print(rem + " ");  // Print the digit
            a /= 10;  // Remove the last digit from the num
            }
 
	}

}
