class Solution {
    public int minRemoval(int intervals[][]) {
        // code here
        int n=intervals.length;
        int c=1;
        Arrays.sort(intervals,(a,b)->Integer.compare(a[1],b[1]));
        int end=intervals[0][1];
        for(int i=1;i<n;i++)
        {
            if(intervals[i][0]>=end){
                c++;
                end=intervals[i][1];
            }
        }
        return n-c;
    }
}
