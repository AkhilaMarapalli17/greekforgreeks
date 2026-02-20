import java.util.Arrays;
class Solution {
    boolean twoSum(int arr[], int target) {
        // code here
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++){
            int com=target-arr[i];
        int index= binarysearch(arr,com);
        if(index!=-1 && index!=i){
            return true;
        }
        }
        return false;
    }
    public static int binarysearch(int[] arr,int com){
        int l=0;
        int r=arr.length-1;
        while(l<=r){
        int mid=(l+r)/2;
        if(arr[mid]==com){
            return mid;
        }
        else if(arr[mid]>com){
            r=mid-1;
        }
        else{
            l=mid+1;
        }
        }
        return -1;
    }
}