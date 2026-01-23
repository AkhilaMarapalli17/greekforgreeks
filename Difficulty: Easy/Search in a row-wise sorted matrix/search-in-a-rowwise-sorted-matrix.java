

class Solution {
    // Function to search a given number in row-column sorted matrix.
    public boolean BinarySearch(int [] arr, int x){
        int l=0;
        int h=arr.length-1;
        while(l<=h){
            int mid=(l+h)/2;
            if(arr[mid]==x){
                return true;
            }
            else if(x<arr[mid]){
                h=mid-1;
            }
            else{
                l=mid+1;
                }
        }
        return false;
    }
    public boolean searchRowMatrix(int[][] mat, int x) {
        // code here
        int n=mat.length;
        int m=mat[0].length;
        for(int i=0;i<=n-1;i++){
            if(BinarySearch(mat[i],x)==true){
                return true;
            }
        }
        return false;
        
    }
}
