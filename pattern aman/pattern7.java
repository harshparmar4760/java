// 0-1 Triangle

public class pattern7 {

    public static void main(String args[]) {
        int n = 5;
        // int number = 0;

        // // outer loop
        // for(int i=1; i<=n; i++) {
        //     // inner loop
        //     for(int j=1; j<=i; j++) {
        //         System.out.print(number+" ");
        //         number++;
        //     }
        //     System.out.println();

        // outer loop
        for(int i=1; i<=n; i++) {
            // inner loop
            for(int j=1; j<=i; j++) {
                int sum = i+j;
                if(sum % 2 == 0){
                    System.out.print("1 "); //even
                } else{
                    System.out.print("0 "); //odd
                }
            }
            System.out.println();
        }
    }
}

// output-
// 1 
// 0 1
// 1 0 1
// 0 1 0 1
// 1 0 1 0 1