package leetcode;
// https://leetcode.com/problems/find-numbers-with-even-number-of-digits/

public class EvenDigit {
    public static void main(String[] args) {
        int[] nums = {12,345,2,6,7896};
        // System.out.println(findNumbers(nums));

        System.out.println(digits(9658697));
        System.out.println(digit2(9658697));

    }
    
    // shortcut method 
    static int digit2(int num){
        if (num < 0){
            num = num * -1; //for negative number
        }
        return (int)Math.log10(num) + 1;
    }

    // main method
    static int findNumbers(int[] nums) {
        int count = 0;
        for (int num : nums) {
            if (even(num)) {
                count++;
            }
        }
        return count;
    }

    // function to check whether a number contains even digits or not
    static boolean even(int num){
        int numberOfDigits = digits(num);
        /*
        if (numberOfDigits % 2 == 0){
            return true;
        }
        return false;
        */
        return numberOfDigits % 2 == 0;
    }

    // count number of digits in a number
    static int digits(int num) {

        if (num < 0){
            num = num * -1; //for negative number
        }

        if (num == 0){
            return 1;
        }

        int count = 0;

        while (num > 0) {
            count++;
            num = num / 10;
        }
        return count;
    } 
}
