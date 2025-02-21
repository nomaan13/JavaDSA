package number_Questions;
import java.util.Scanner;
public class ReverseNumber {

    public static int reverseNumber(int a ){
        int rev =0;

        while(a>0){
            int rem = a%10;
            rev = rev*10 +rem;
            a/=10;
        }
        return rev;}

    public static int isreverseNumber(int a){
        int rev =0;
        for (;a!=0;a/=10){
            int rem= a%10;
            rev = rev*10+rem;
            }
        return rev;
    }

    public static void main(String[] args) {
        int a = 45678 ;
        System.out.println(reverseNumber(a));
        System.out.println(isreverseNumber(a));

    }
}
