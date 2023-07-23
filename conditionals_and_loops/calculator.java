package conditionals_and_loops;

import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // take input from user till user does not press X or x
        int ans = 0;
        while (true) {
            // take the operator as input
            System.out.print("Enter the operator: ");
            char op = in.next().trim().charAt(0);
            if (op == '+' || op == '-' || op == '*' || op == '/' || op == '%' ) {
                // input 2 number
                System.out.print("Enter two number: ");
                int n1 = in.nextInt();
                int n2 = in.nextInt();
                
                if (op == '+') {
                    ans = n1 + n2;
                }
                if (op == '-') {
                    ans = n1 - n2;
                }
                if (op == '*') {
                    ans = n1 * n2;
                }
                if (op == '/') {
                    if (n2 != 0){
                        ans = n1 / n2;
                    }
                }
                if (op == '%') {
                    ans = n1 % n2;
                }
            } else if (op == 'x' || op == 'X'){
                break;
            } else{
                System.out.println("Invalid Operation");
            }
            System.out.println(ans);
        }
    }
}
