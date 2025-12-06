class Solution {
    int maxSubarraySum(int[] arr) {
        // Code here
        int cs=0;
        int mx=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++)
        {
                cs+=arr[i];
                mx=Math.max(cs,mx);
            if(cs<0)
            {
                cs=0;
            }
        }
        return mx;
            
    }
}
