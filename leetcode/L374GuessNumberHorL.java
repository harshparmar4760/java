package leetcode;
// https://leetcode.com/problems/guess-number-higher-or-lower/description/

public class L374GuessNumberHorL {

    // 1 st solution

    public int guessNumber(int n) {
        int start  = 1;
        int end = n;
        
        while(start <= end){
            int mid = start  + (end - start) / 2;
            if (guess(mid) == 0) return mid;
            else if (guess(mid) == 1) start = mid + 1;
            else end =  mid - 1;
        }
    return start;
    }

    //  2nd solution
    public class Solution extends GuessGame {
        public int guessNumber(int n) {
            int low=0, high=n, mid;
            while(low<=high){
                mid=low+(high-low)/2;
                if(guess((int)mid)==0) return (int)mid;
                else if(guess((int)mid)==1) low=mid+1;
                else high=mid-1; 
            }
            return -1;
        }
    }
}
