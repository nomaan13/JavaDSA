package array;
import java.util.Scanner;
public class User_Input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of array: ");
        int a = sc.nextInt();

        int [] x = new int[a];
        for(int i =0;i<x.length;i++){
            System.out.print("Enter the " + (i+1) + "st elements:" );
            x[i]= sc.nextInt();
        }
        System.out.print("All elements are: " );
        for (int n:x){
            System.out.print(n+" ");

            }
}}
