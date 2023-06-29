// Diamond pattern

public class apattern5 {
        public static void main(String args[]) {
        int n = 4;

        // upper half
        for(int i=1; i<=n; i++) {
            // spaces
            for(int j=1; j<=n-i; j++) {
                System.out.print(" ");
            }
            // stars
            for(int j=1; j<=2*i-1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        // lower half
        for(int i=n; i>=1; i--) {  //just change in this line from upper half
            // remaining all same downwards
            // spaces
            for(int j=1; j<=n-i; j++) {
                System.out.print(" ");
            }
            //stars
            for(int j=1; j<=2*i-1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

// output-
//    *
//   ***
//  *****
// *******
// *******
//  *****
//   ***
//    *

