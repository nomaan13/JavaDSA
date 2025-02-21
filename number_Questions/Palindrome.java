package number_Questions;

import java.util.Scanner;

public class Palindrome {
    public static int isPalindrome(int a) {
        int temp =a ;
        int rev = 0;
        while (a>0){
            int rem = a%10;
            rev = rev*10 + rem;
            a=a/10;
        }
        System.out.println(temp + " is "+ rev);
        return rev;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number here: ");
        int a =sc.nextInt();
        if (isPalindrome(a)==a){
            System.out.println("Entered number is a Palindrome number!!");
        }
        else
            System.out.println("Entered number is not a Palindrome number!!!");
    }


}
