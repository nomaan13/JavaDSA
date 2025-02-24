package sorting_Algorithms;

public class BubbleSort {
    public static void bubbleSort(int []a){
        int n =a.length-1;
        int temp;
        for (int i =0; i<=n;i++){
            for (int j=0;j<n-i;j++){
                if (a[j]>a[j+1]){
                    temp=a[j+1];
                    a[j+1]=a[j];
                    a[j]=temp;
                }
            }
        }
        System.out.println("Bubble sort result is :");
        for (int x:a){
            System.out.print(x+" ");
        }

    }
    public static void main(String[] args) {
        int a[] = {12,82,23,23,21,23,45,32,1,12,99};
        bubbleSort(a);




    }
}
