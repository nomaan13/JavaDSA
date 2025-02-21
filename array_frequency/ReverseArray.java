package array_frequency;
public class ReverseArray {
    public static void reverseArray(int a[]){
      int i=0;
      int j=a.length-1;

      while(i<j){
          int temp =a[j];
          a[j] = a[i] ;
          a[i]=temp;
          i++;
          j--;
      }
        System.out.println("Reverse array is :");

      for (int x:a){
          System.out.print(x + " ");
      }

}
public static void main(String[] args) {
        int []b= {23,33,42,21,24,55,23,22};
              System.out.println("Original array is : ");
        for (int x : b ){
            System.out.print(x+" ");
        }
             System.out.println();
        reverseArray(b);

    }
 }