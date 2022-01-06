//https://leetcode.com/problems/determine-whether-matrix-can-be-obtained-by-rotation/

class Solution {
    public boolean findRotation(int[][] mat, int[][] target) {
        int n = mat.length-1;
        Boolean chk[] = new Boolean[4];
        Arrays.fill(chk,Boolean.TRUE);  //initializing chk array with true
        
        for(int i=0;i<=n;i++){
            for(int j=0;j<=n;j++){
                if(chk[0] && mat[i][j] != target[i][j])     //checking for 0 degree
                    chk[0] = false;
                if(chk[1] && mat[i][j] != target[j][n-i])   //checking for 90 degree
                    chk[1] = false;
                if(chk[2] && mat[i][j] != target[n-j][i])   //checking for 180 degree
                    chk[2] = false;
                if(chk[3] && mat[i][j] != target[n-i][n-j])   //checking for 270 degree
                    chk[3] = false;
                
                if(!chk[0] && !chk[1] && !chk[2] && !chk[3])  
                    return false;
            }
        }
      
        return true;  
        //here at least one value of chk[] will be true, that means at least for one rotation target and mat matrix will be same
    }
}
