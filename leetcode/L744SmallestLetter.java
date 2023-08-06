package leetcode;
// https://leetcode.com/problems/find-smallest-letter-greater-than-target/

public class L744SmallestLetter {
    public static void main(String[] args) {

    }
// 1st solution
    public char nextGreatestLetter(char[] letters, char target) {

        int start = 0;
        int end = letters.length - 1;

        while(start <= end) {
            // find the middle element
            // int mid = (start + end) / 2;
            int mid = start + (end - start) / 2;

            if (target < letters[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return letters[start % letters.length];
    }
    
    // 2nd solution
    // public char nextGreatestLetter(char[] letters, char target) {
    //     char ans;
    //     for(int i=0;i<letters.length;i++) {
    //         if(letters[i] >target) {
    //             return letters[i];
    //         }
    //     } 
    //     return letters[0]; 
    // }
}
    
