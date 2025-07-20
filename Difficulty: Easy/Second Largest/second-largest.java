class Solution {
    public int getSecondLargest(int[] arr) {
        int large=0;
        int sec=-1;
        int n=arr.length;
        for(int i=0;i<n;i++)
        {
            if(arr[i]>large){
                large=arr[i];
            }
        }
        for(int i=0;i<n;i++){
            if(arr[i]>sec&& arr[i]<large)
            {
                sec=arr[i];
            }
        }
        return sec;
    }
}