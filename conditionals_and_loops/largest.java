package conditionals_and_loops;

import java.util.Scanner;

public class largest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a = in.nextInt();        
        int b = in.nextInt();
        int c = in.nextInt();

        // Q: Find the largest of 3 numbers

        // int max = a;
        // if (b > max){
        //     max = b;
        // }
        // if (c > max){
        //     max = c;
        // }
        // System.out.println("The max is : " + max);


        int max = Math.max(c, Math.max(a, b));
        System.out.println(max);


    }
}
