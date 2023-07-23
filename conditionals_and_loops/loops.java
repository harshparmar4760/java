package conditionals_and_loops;

import java.util.Scanner;

public class loops {
    public static void main(String[] args) {
        /*
            syntax of for loops:
            
            for (initialisation; condition; increament/decrement) {
                //body
            }
        */
        
        // Q: print no. from 1 to 5
        // for (int num = 1; num <=5; num +=1) {
        //     System.out.println(num);
        // }

        //print no. form 1 to n
        // Scanner in = new Scanner(System.in);
        // int n = in.nextInt();

        // for (int num = 0; num <= n; num++) {
        //     // System.out.print(num + ",");
        //     System.out.println("hello");
        // }


        // while loops
        /*
            syntax:

            while (condition) {
                //body
            }
         */

        int num = 1;
        while ( num <= 5) {
            System.out.println(num);
            num += 1;
        }

        // do while
        /*
            do {

            } while (condition);

         */
        
         int n = 1;
        do {
            System.out.println(n);
            n++;
        } while (n <= 5);
    }
}
