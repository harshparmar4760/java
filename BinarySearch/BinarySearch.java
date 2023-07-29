package BinarySearch;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {-21,-18,-3,2,3,5,6,13,17,19,20,45,90};
        int target = -21;
        int ans = binarySearch(arr, target);
        System.out.println(ans);
    }

    // return the index
    static int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length;

        while(start <= end) {
            // find the middle element
            // int mid = (start + end) / 2;
            int mid = start + (end - start) / 2;

            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]){
                start = mid + 1;
            } else {
                // answer
                return mid;
            }
        }
        return -1;
    }
}
