package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class input {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // array of primitive
        int[] arr = new int[5];
        arr[0] = 23;
        arr[1] = 24;
        arr[2] = 26;
        arr[3] = 28;
        arr[4] = 29;
        // [23,24,26,28,29]
        System.out.println(arr[3]);

        // input using for loops
        // for (int i = 0; i < arr.length; i++) {
        //     arr[i] = in.nextInt();
        // }
        
        // System.out.println(Arrays.toString(arr));


        // for (int i = 0; i < arr.length; i++) {
        //     System.out.print(arr[i] + " ");
        // }

        // for (int num : arr) {
        //     System.out.println(num + " ");
        // }

        // System.out.println([5]); // index out of bound error
  
        // array of object
        String[] str = new String[4];
        for (int i = 0; i < str.length; i++) {
            str[i] = in.next();
        }
        System.out.println(Arrays.toString(str));

        // modify 
        str[1] = "harsh";
        System.out.println(Arrays.toString(str));

    }
}
