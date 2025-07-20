// User function Template for Java
import java.util.Arrays;
class Solution {
    int maxProduct(int[] arr) {
        // code here
        Arrays.sort(arr);
        int n=arr.length;
        int opt1=arr[n-1]*arr[n-2]*arr[n-3];
        int opt2=arr[0]*arr[1]*arr[n-1];
        return Math.max(opt1,opt2);
        
    }
}
