package linear_search;

public class SearchInRange {
    public static void main(String[] args) {
        int[] arr = {12, 13, 14, 15, 16, 17};
        int target = 12;
        System.out.println(linearSearch(arr, target, 1, 4));
    }

    static int linearSearch(int[] arr, int target, int start, int end) {
        if (arr.length == 0) {
            return -1;
        }

        // run a for loop
        for (int index = start; index <= end; index++) {
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
