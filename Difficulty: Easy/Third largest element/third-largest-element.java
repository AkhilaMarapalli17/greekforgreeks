import java.util.Arrays;
class Solution {
    int thirdLargest(int arr[]) {
        // Your code here
       Arrays.sort(arr);
       return arr[arr.length-3];
    }
}