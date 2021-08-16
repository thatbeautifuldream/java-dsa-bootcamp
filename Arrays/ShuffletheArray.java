// Shuffle the Array
// Problem Link : https://leetcode.com/problems/shuffle-the-array/
package Arrays;

public class ShuffletheArray {
    public int[] shuffle(int[] nums, int n) {
        int[] res = new int[2*n];
        int j = 0;
        for(int i = 0; i<res.length; i+=2) {
            res[i] = nums[j];
            res[i + 1] = nums[j + n];
            j++;
        }
        return res;
    }
}
