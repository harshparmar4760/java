// butterfly pattern

public class apattern1 {

    public static void main(String args[]) {
        int n = 5;

        // upper half
        for(int i=1; i<=n; i++) {
            // 1 part
            for(int j=1; j<=i; j++) {
                System.out.print("*");
            }

            // spaces
            int spaces = 2*(n-i);
            for(int j=1; j<=spaces; j++){
                System.out.print(" ");
            }

            // 2 part
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        // lower half
        for(int i=n; i>=1; i--) {  //just change in this line from upper half
            // remaining all same downwards
            // 1 part
            for(int j=1; j<=i; j++) {
                System.out.print("*");
            }

            // spaces
            int spaces = 2*(n-i);
            for(int j=1; j<=spaces; j++){
                System.out.print(" ");
            }

            // 2 part
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

// output-
// *        *
// **      **
// ***    ***
// ****  ****
// **********
// **********
// ****  ****
// ***    ***
// **      **
// *        *
