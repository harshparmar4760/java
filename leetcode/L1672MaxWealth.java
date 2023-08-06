package leetcode;
// https://leetcode.com/problems/richest-customer-wealth/

public class L1672MaxWealth {
    public static void main(String[] args) {
        
    }

    public int maximumWealth(int[][] accounts){
        // person = rol
        // account = col
        int ans = Integer.MIN_VALUE;
        for (int [] ints : accounts){
        // for (int person = 0; person < accounts.length; person++) {
            // when you start a new col, take a new sum for that row
            int sum = 0;
            for (int anInt : ints) {
                sum += anInt;
            }
            // for (int account = 0; account < accounts[person].length; account++) {
            //     sum += accounts[person][account]
            // }
            // now we have sum of accounts of person
            // check with overall ans
            if (sum > ans) {
                ans = sum;
            }
        }
        return ans;
    }
}
