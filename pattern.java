// basic
public class pattern {

    public static void main(String args[]) {
        int n = 5;

        // outer loop
        for(int i=1; i<=n; i++) {  // this mean row jo ja rahi hogi vo hogi 1 se lekar n tak
            // spaces
            for(int j=1; j<=n-i; j++) {  // har bar age spaces ke lia 1 se n-i likhege
                System.out.print(" ");
            }
            // 1 numbers
            for(int j=1; j<=i; j++){
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}

