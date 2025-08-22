import java.util.*;
class Solution {
    public int median(int[][] mat) {
        int c=mat.length;
        int r=mat[0].length;
        ArrayList<Integer> arr=new ArrayList<>();
            for(int i=0;i<c;i++)
            {
                for(int j=0;j<r;j++)
                {
                    int z=mat[i][j];
                    arr.add(z);
                }
            }
            Collections.sort(arr);
            return arr.get(arr.size()/2);
        
    }
}