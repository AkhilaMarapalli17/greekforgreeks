class Solution {
    private int[] buildLPS(String pattern){
        int m=pattern.length();
        int[] lps=new int[m];
        int j=1,len=0;
        while(j<m){
            if(pattern.charAt(len)==pattern.charAt(j)){
                len++;
                lps[j]=len;
                j++;
            }
            else{   
                if(len!=0)len=lps[len-1];
                else{
                    lps[j]=0;
                    j++;
                }
            }
        }
        return lps;
    }
    private ArrayList<Integer> kmp(String text, String pattern) {
        int n = text.length(), m = pattern.length();
        ArrayList<Integer> ans = new ArrayList<>();
        if (m > n) return ans;
        int lps[]=buildLPS(pattern);
        int i=0,j=0;
        while(i<n){
            if(text.charAt(i)==pattern.charAt(j)){
                i++;
                j++;
                if(j==m){
                    ans.add(i-m);
                    j=lps[j-1];
                }
            }
            else{
                if(j!=0)j=lps[j-1];
                else i++;
            }
        }
        return ans;
    }

    ArrayList<Integer> search(String pat, String txt) {
        return kmp(txt, pat);
    }
}

 