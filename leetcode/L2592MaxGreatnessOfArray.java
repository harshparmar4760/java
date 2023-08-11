package leetcode;

import java.util.Arrays;

public class L2592MaxGreatnessOfArray {
    public static void main(String[] args) {
        int[] nums = {1,3,5,2,1,3,1}; 
        System.out.println();
    }

    public int maximizeGreatness(int[] nums) {
        Arrays.sort(nums);        
        int perm = 0;
        for (int i=0;i<nums.length;i++){
            if (nums[perm] < nums[i]){
                perm++;
            }
        }
        return perm;
    }
}
