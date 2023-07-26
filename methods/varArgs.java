package methods;

import java.util.Arrays;

public class varArgs {
    public static void main(String[] args) {
        // fun(2,3,5,6,4,3,3,23,43,23,24,53,46,67,77);
        

        demo(3,4,5);
        demo("harsh","ram","yash");
        
        int ans = sum( 3, 5, 6);
        System.out.println(ans);
        
    }

    
    static void demo(int ...v) {
        System.out.println(Arrays.toString(v));
    }
    static void demo(String ...v) {
        System.out.println(Arrays.toString(v));
    }

    static int sum(int i, int j) {
        return i + j ;
    }

    static int sum(int i, int j, int k) {
        return i + j + k;
    }



    static void fun(int ...v) {
        System.out.println(Arrays.toString(v));
    }
}
