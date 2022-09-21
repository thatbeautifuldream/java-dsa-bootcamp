// Problem Link : https://leetcode.com/problems/flipping-an-image/

class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        int[][] res = new int[image.length][image.length];
        for(int i = 0; i< image.length; i++) {
            for(int j = 0; j<image[0].length; j++) {
                res[i][j] = image[i][image[i].length-1-j];
                res[i][j] = res[i][j] == 0 ? 1 : 0;
            }
        }
        return res;
    }
}
