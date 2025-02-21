package number_Questions;

import java.util.Scanner;

public class PerfectNumber {
    public static boolean isPerfectNumber(int x) {
        int factor=0;
        for (int i =1;i<=x/2;i++) {
            if (x % i == 0) {
                factor += i;
            }
            return factor==x;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter a number here : ");
//        int x = sc.nextInt();


        for (int i=1;i<=100;i++) {
            if (isPerfectNumber(i) ) {
                System.out.println("Entered number is a Perfect Number");

            } else System.out.println("Entered number is not a Perfect Number");


        }

    }


}
