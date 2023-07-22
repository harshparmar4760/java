package methods;

import java.util.Scanner;

public class sum {
    public static void main(String[] args) {
        // sum();

        // int ans = sum2();
        // System.out.println(ans);

        int ans = sum3(34, 36);
        System.out.println(ans);
    }

    // pass the value of number when you are calling the method in main()
    static int sum3(int a , int b){
        int sum = a + b;
        return sum;
    }

    // return the value
     static int sum2() {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter no 1: ");
        int a = sc.nextInt();
        System.out.print("enter no. 2: ");
        int b = sc.nextInt();
        int sum = a + b;
        return sum;
     }

    static void sum() {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter no 1: ");
        int a = sc.nextInt();
        System.out.print("enter no. 2: ");
        int b = sc.nextInt();
        int sum = a + b;
        System.out.println("the sum = " + sum);
    
    }

    // access modifier , return_type name (){
        // body
    // return statement
    // }
}
