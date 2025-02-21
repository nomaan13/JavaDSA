package array_frequency;

import java.util.Scanner;

public class Frequency {
//======================================================================================================================
    //Method for frequency of each element
    public static void getFrequency(int a []){
        int n = a.length-1;

        for (int i =0 ;i<=n;i++){
            int count=1;
            for (int j = i+1;j<=n;j++){
                if (a[i]==a[j]){
                    count++;
                    a[j]=a[n];
                    n--;
                    j--;
                }
            }
            System.out.println(a[i] + " is total " + count +" times.");
        }
    }
//======================================================================================================================

//======================================================================================================================
    //Frequency of elements which appeared odd times
    public static void getEvenElement(int a[] ){
        int n = a.length-1;
        for (int i =0;i<=n;i++){
            int count=1;
            for (int j =i+1;j<=n;j++){
                if (a[i]==a[j]){
                    count++;
                    a[j]=a[n];
                    n--;
                    j--;
                }
            }
            //Odd frequency
            if (count%2==1){
                System.out.println(a[i] + " appeared "+ count + " times.");
            }

        }

    }
//======================================================================================================================

//======================================================================================================================
    //Element appear more than once
    public static void onlyOneFrequency(int a[]){
        int n = a.length-1;

        for (int i =0;i<=n;i++){
            int count =1;
            for (int j = i+1;j<=n;j++){
                if (a[i]==a[j]){
                    count++;
                    a[j]=a[n];
                    n--;
                    j--;
                }
            }
            if (count ==1){
                System.out.println(a[i] + "appeared only once in the array.");
            }
        }
    }
//======================================================================================================================
//======================================================================================================================
    //Method for maximum frequency of an element
    public static void maxFrequency(int []a){
        int n = a.length-1;
        int maxCount = 0;
        int target;
        for (int i = 0;i<=n;i++)
        {
            int count =1;
            for (int j = i+1;j<=n;j++){
                if (a[i]==a[j]){
                    count++;
                    a[j]=a[n];
                    n--;
                    j--;
                }

            }
            if (count>=maxCount){
                maxCount=count;
                target =a[i];
                System.out.println(a[i] +" has appeared maximum number of time " + maxCount);
            }
        }
    }
//======================================================================================================================

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length of array : ");
        int n = sc.nextInt();
        int []a = new int[n];

        for (int i = 0; i<n;i++){
            System.out.print("Enter " +(i+1) +" element: ");
            a[i]= sc.nextInt();
        }
        //Displaying entered array
        System.out.println("Entered array element : ");
        for (int x : a ){
            System.out.print(x+" ");
        }
        System.out.println();

        /*System.out.println("Frequency of each elements.");
        getFrequency(a);
        System.out.println("Element with odd no. of appearance.");
        getEvenElement(a);
        System.out.println("Element which appear only once in the array.");
        onlyOneFrequency(a);*/
        System.out.println("\nElement with maximum frequency is : ");
        maxFrequency(a);

    }
}
