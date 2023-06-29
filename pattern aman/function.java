import java.util.*;

public class function {

// 1-ADDITION

    // public static int calculateSum(int a, int b) {
    //     int sum = a + b;
    //     return sum;
    // }
    // public static void main(String args[]) {
    //     Scanner sc = new Scanner(System.in);
    //     // String name = sc.next();
    //     int a = sc.nextInt();
    //     int b = sc.nextInt();
        
    //     int sum = calculateSum(a, b);
    //     System.out.println("Sum of Two Number is : "+sum);

// 2-PRODUCT

    // public static int calculateProduct(int a, int b){
    //     return a * b;
    // }
    // public static void main(String args[]){
    //     Scanner sc = new Scanner(System.in);
    //     int a = sc.nextInt();
    //     int b = sc.nextInt();
    //     System.out.println("Product of Two Number is : "+ calculateProduct(a,b));

// 3-FACTORIAL

    public static void printFactorial(int n) {
        // loop
        if(n<0){
            System.out.println("Invalid Number");
            return;
        }
        int factorial = 1;

        for (int i=n; i>=1; i--){
            factorial = factorial * i;
        }

        System.out.println(factorial);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        printFactorial(n);
    }
}

