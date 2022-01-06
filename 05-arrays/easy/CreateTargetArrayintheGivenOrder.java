// Problem Link : https://leetcode.com/problems/
package Arrays.Easy;
import java.util.ArrayList;
public class CreateTargetArrayintheGivenOrder {
    public int[] createTargetArray(int[] nums, int[] index) {
        ArrayList<Integer> res = new ArrayList<Integer>();
        for(int i = 0; i<nums.length; i++) {
            res.add(index[i], nums[i]);
        }
        int[] target = new int[res.size()];
        for(int i = 0; i<res.size(); i++) {
            target[i] = res.get(i);
        }
        return target;
    }
}
