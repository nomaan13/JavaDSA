package array;

public class Acess_Even_Element {
    public static void main(String[] args) {
        int[] a= {30,89,50,77,12,32,44};



//*******************************************USING FOR LOOP*************************************************************
        for(int i =1;i<a.length; i++){
            if (i%2==0){
                System.out.println(a[i]);
            }
        }

//*******************************************USING FOR LOOP EACH********************************************************
        for (int x :a){
            if (x%2==0){
                System.out.print(x+"  ");
            }
        }
    }
}
