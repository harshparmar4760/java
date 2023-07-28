package linear_search;

public class FindMin {
    public static void main(String[] args) {
        int[] arr = {12, 13, 14, 15, 16, 9};
        System.out.println(min(arr));
    }

    // assume arr.length !=0
    // return the minimum val in the array

    static int min(int[] arr) {
        int ans = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < ans){
                ans = arr[i];
            }
        }
        return ans;
    }
}
