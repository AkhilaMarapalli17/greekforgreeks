// User function Template for Java
class Solution {
    public int cost(int[] arr) {
        // code here
        int n=arr.length;
        int min=arr[0];
        for(int i=0;i<n;i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        return (n-1)*min;
    }
}