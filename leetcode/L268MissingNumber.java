package leetcode;

public class L268MissingNumber {
    public static void main(String[] args) {
        int[] nums = {3, 5, 7, 9, 10, 90, 100, 130, 140, 160, 170};
        int target = 10;
        System.out.println(nums, target);
    }
    public int missingNumber(int[] nums) {
        int result = 0;
        for (int i =0; i < nums.length; i++){
            result += ((i+1) - nums[i]);
        }    
        return result;
    }

}
