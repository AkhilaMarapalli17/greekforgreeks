class Solution {

    static int minOps(int arr[], int k) {
        int max=arr[0];
        int n=arr.length;
        for(int i=0;i<n;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        int res=0;
        for(int i=0;i<n;i++){
            if((max-arr[i])%k!=0){
                return -1;
            }
            else{
                res+=(max-arr[i])/k;
            }
        }
        return res;
    }
}
