// Problem Link : https://leetcode.com/problems/kids-with-the-greatest-number-of-candies
package Arrays;
import java.util.*;
public class KidsWiththeGreatestNumberofCandies {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> result = new ArrayList<>();
        
        int max = -1;
        for(int i=0;i<candies.length;i++){
                max = Math.max(max,candies[i]);
            }
        for(int i=0;i<candies.length;i++){
            result.add((candies[i]+extraCandies)>=max);
        }        
        return result;
    }    
}