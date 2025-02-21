package number_Questions;

import java.util.Scanner;

public class AutomorphicNumber {
    public static boolean isAutomorphicNumber(int a ){
        int sq = a * a ;
        while (a>0){
            if (a%10!=sq%10){
                return false;
            }
            a/=10;
            sq/=10;

        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter a number here: ");
        int a = sc.nextInt();
        if (isAutomorphicNumber(a)==true){
            System.out.println("Automorphic number");

        }
        else
            System.out.println("Not an Automorphic number");
    }
}
