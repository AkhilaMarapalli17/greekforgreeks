class Solution {
    void pushZerosToEnd(int[] arr) {
        int c=0;
        int n=arr.length;
        
        for(int i=0;i<n;i++){
            if(arr[i]!=0){
                arr[c]=arr[i];
                c++;
            }   
        }
        while(c<n)
        {
            arr[c]=0;
            c++;
        }
    }
}
        
