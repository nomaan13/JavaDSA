package array;

import java.util.Scanner;

public class Access_Count {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();
        int []a=new int[n];

        for (int i =0;i<a.length;i++){
            System.out.print("Enter "+(i+1) +" element of the array: ");
            a[i]=sc.nextInt();
        }
        int count=0;
        for (int x :a){

            if (x%7==0){
                count++;
                System.out.println("Element divisible by 7 is: "+ x); ;


            }

        }
        System.out.println("");
        System.out.println("End");
    }
}
