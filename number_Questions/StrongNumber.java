package number_Questions;
public class StrongNumber {
    public static void isStrongNumber(int n ){
        int rem;
        int sum=0;
        while (n>0){
            rem =n%10;
            sum = sum + factorialOf(rem);
            n/=10;
        }
        System.out.println(sum);
    }
    public static int factorialOf(int n){
        int factorial=1;
        for (int i=1;i<=n;i++){
            factorial=factorial*i;
        }
        return factorial;
        }
        public static void main(String[] args) {
        isStrongNumber(145);
       int a = factorialOf(5);
        System.out.println(a);
    }
}
