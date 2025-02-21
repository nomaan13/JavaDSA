package number_Questions;

import java.util.Scanner;

public class HappyNumber {
    public static boolean isHappyNumber(int n){
        while (n>9){
            int sum =0;
            while (n>0){
                int rem = n%10;
                sum = sum + powOf(rem);
                n/=10;
            }
            n=sum;

        }
        return false;
    }
    public static int powOf(int n ){
        int pow =1;
        for (int i=1;i<=n;i++){
            pow=i*i;
        }
        return pow;
    }
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Please enter a number here : ");
    int a =sc.nextInt();

    if (isHappyNumber(a) == true){
        System.out.println("Entered number is a Happy Number");
    }
    else System.out.println("Entered number "+ a+ " is not Happy Number");
}
}
