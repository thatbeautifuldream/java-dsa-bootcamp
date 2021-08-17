//  Problem Link : https://leetcode.com/problems/how-many-numbers-are-smaller-than-the-current-number/
package Arrays;

public class HowManyNumbersAreSmallerThantheCurrentNumber {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] minCount = new int[nums.length];
        for(int i = 0; i<nums.length; i++) {
            for(int j = 0; j<nums.length; j++) {
                if((j != i) && (nums[j] < nums[i])) {
                    minCount[i]++;
                }
            }
        }
        return minCount;
    }
}
