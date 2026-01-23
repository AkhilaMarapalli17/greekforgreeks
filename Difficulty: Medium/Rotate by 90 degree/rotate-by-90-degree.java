class Solution {
    public void rotateMatrix(int[][] mat) {
        // code here
        int n=mat.length;
        int i,j,temp;
        for(i=0;i<n/2;i++)
        {
            for(j=i;j<n-i-1;j++){
                temp=mat[i][j];
                mat[i][j]=mat[j][n-1-i];
                mat[j][n-1-i]=mat[n-1-i][n-1-j];
                mat[n-1-i][n-1-j]=mat[n-1-j][i];
                mat[n-1-j][i]=temp;
                }
                
    }
}

}