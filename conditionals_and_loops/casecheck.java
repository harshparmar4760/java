package conditionals_and_loops;

import java.util.Scanner;


public class casecheck {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            char ch = in.next().trim().charAt(0);
            
            if (ch >= 'a' && ch <= 'z'){
                System.out.println("Lowercase");
            } else {
                System.out.println("Uppercase");
            }
            
            // System.out.println(ch);
        }


        
        // String word = "hello";
        // System.out.println(word.charAt(2));
    }
}
