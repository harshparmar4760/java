// 1-Print a solid rhombus.
// 2- Print a number pyramid.
// 3- Print a palindromic number pyramid.


public class patternhw {

    public static void main(String args[]) {
        int n = 5;
        int number = 1;

        // outer loop
        for(int i=1; i<=n; i++) {
            // inner loop
            for(int j=1; j<=i; j++) {
                System.out.print(number+" ");
                number++;
            }
            System.out.println();
        }
    }
}

// output-
