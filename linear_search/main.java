package linear_search;

import conditionals_and_loops.reverse;

public class main {
    public static void main(String[] args) {
        int[] nums = {2, 45, 34, 4, 56, 34, 46};
        int target = 56;
        int ans = linearSearch(nums, target);
        System.out.println(ans);
    }
    
    // search the target and return true or false
     static boolean linearSearch3(int[] arr, int target) {
        if (arr.length == 0) {
            return false;
        }

        // run a for loop
        for (int index = 0; index < arr.length; index++) {
            int element = arr[index];
            if (element == target) {
                return true;
            }
        }
        // this line will execute if nonw of the return statement above  have executed
        // hence the target not found
        return false;
    }
    // -----------------------------------------------------------------------

    // search the target and return the element
     static int linearSearch2(int[] arr, int target) {
        if (arr.length == 0) {
            return -1;
        }

        // run a for loop
        for (int index = 0; index < arr.length; index++) {
            int element = arr[index];
            if (element == target) {
                return element;
            }
        }
        // this line will execute if nonw of the return statement above  have executed
        // hence the target not found
        return Integer.MAX_VALUE;
    }
    // -----------------------------------------------------------------------

    // search in the array: return the index if item found other wise if item not found return -1
    static int linearSearch(int[] arr, int target) {
        if (arr.length == 0) {
            return -1;
        }

        // run a for loop
        for (int index = 0; index < arr.length; index++) {
            // check for element at every index if it is = target
            int element = arr[index];
            if (element == target) {
                return index;
            }
        }
        // this line will execute if nonw of the return statement above  have executed
        // hence the target not found
        return -1;
    }
}
