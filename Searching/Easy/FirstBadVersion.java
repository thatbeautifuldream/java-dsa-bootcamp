/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

      public class Solution extends VersionControl {
        public int firstBadVersion(int n) {
            int start = 0;
            int end = n;
            
            while(start <= end) {
                int mid = start + (end - start)/2;
                boolean ans = isBadVersion(mid);
                if(!ans) {
                    start = mid + 1;
                }
                else {
                    end = mid - 1;
                }
            }
            return start; //first bad product
        }
    }