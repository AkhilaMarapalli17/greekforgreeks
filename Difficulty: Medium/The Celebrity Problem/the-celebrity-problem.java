class Solution {
    public int celebrity(int mat[][]) {
        int n = mat.length;
        if (n == 0) return -1;
        if (n == 1) return 0;

      
        int a = 0, b = n - 1;
        while (a < b) {
            if (mat[a][b] == 1) {
               
                a++;
            } else {
               
                b--;
            }
        }
        int cand = a;


        for (int j = 0; j < n; j++) {
            if (j == cand) continue;
            if (mat[cand][j] == 1) return -1;
        }
        for (int i = 0; i < n; i++) {
            if (i == cand) continue;
            if (mat[i][cand] == 0) return -1;
        }

        return cand;
    }

    

}