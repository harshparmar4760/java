package methods;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter no 1: ");
        int a = sc.nextInt();
        System.out.print("enter no 2: ");
        int b = sc.nextInt();
        int sum = a + b;
        System.out.println("The sum = " + sum);
    }
    
}
