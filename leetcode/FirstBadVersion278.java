package leetcode;
// https://leetcode.com/problems/first-bad-version/description/

public class FirstBadVersion278 {

    // 1st solution

    /* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

    public class Solution extends VersionControl {
        public int firstBadVersion(int n) {
            int start = 0;
            int end = n;

            while(start <= end) {
                // find the middle element
                // int mid = (start + end) / 2;
                int mid = start + (end - start) / 2;

                if (isBadVersion(mid) == true && isBadVersion(mid - 1) == false)return mid;
                else if (isBadVersion(mid) == false) start = mid + 1;
                else end = mid - 1;
            }
            return -1;
        }
    }


    // 2nd solution

    /* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

    public class Solution extends VersionControl {
        public int firstBadVersion(int n) {
            int start = 0;
            int end = n;

            while(start <= end) {
                // find the middle element
                // int mid = (start + end) / 2;
                int mid = start + (end - start) / 2;

                if (!isBadVersion(mid)) {
                    start = mid + 1;
                } else{
                    end = mid - 1;
                }
            }
            return start;
        }
    }
    
}
