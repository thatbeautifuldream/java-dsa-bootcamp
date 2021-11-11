//https://leetcode.com/problems/lucky-numbers-in-a-matrix/

class Solution {
    public List<Integer> luckyNumbers (int[][] matrix) {
        ArrayList<Integer> l= new ArrayList<>();
        int col = matrix[0].length,row = matrix.length;
        int index=0,j,m;
        int[] chk = new int[col];
      
        for(int i=0; i<row; i++){
            m = Integer.MAX_VALUE;
          //finding minimum value from each row and keeping that value in chk[] array 
          //at the same index where it is present in that particular row
            for(j=0 ;j<col ;j++){
                if(m > matrix[i][j]){
                    m = matrix[i][j];
                    index = j;
                }
            }
            if(chk[index] < m){
                chk[index] = m;
            }
        }
        
        for(int i=0; i<col; i++){
             m = 0;
          //finding maximum value from each column 
            for(j=0 ;j<row ;j++){
                if(m < matrix[j][i]){
                    m = matrix[j][i];
                }
            }
          //checking if the value present in chk[] (minimum value from row) is it equal to m
          //then it will be a lucky number
            if(chk[i] == m)
                l.add(m);
        }
        return l;
    }
}
