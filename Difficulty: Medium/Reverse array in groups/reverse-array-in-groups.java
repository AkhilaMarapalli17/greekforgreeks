class Solution {
    public void reverseInGroups(int[] arr, int k) {
        // code here
        int n=arr.length;
        for(int i=0;i<n;i=i+k){
            int start=i;
            int end=Math.min(i+k-1,n-1);
            while(start<=end)
            {
                int temp=arr[start];
                arr[start]=arr[end];
                arr[end]=temp;
                start++;
                end--;
            }
            
        }
    }
}