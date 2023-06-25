// Half Pyramid with Numbers
// Inverted Half Pyramid with Numbers

public class pattern5 {
        public static void main(String args[]) {
        int n = 5;

        // // outer loop
        // for(int i=1; i<=n; i++) {
        //     // inner loop
        //     for(int j=1; j<=i; j++) {
        //         System.out.print(j+" ");
        //     }
        //     System.out.println();

        // output-
        // 1 
        // 1 2
        // 1 2 3
        // 1 2 3 4
        // 1 2 3 4 5


        // outer loop
         for(int i=n; i>=1; i--) {
            // inner loop
            for(int j=1; j<=i; j++) {
                System.out.print(j+"");
            }
            System.out.println();

        // output-
        // 12345
        // 1234
        // 123
        // 12
        // 1

        }
    }
}
