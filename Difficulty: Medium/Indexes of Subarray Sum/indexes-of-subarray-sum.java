
class Solution {
    static ArrayList<Integer> subarraySum(int[] arr, int target) {
        // code here
        ArrayList<Integer> res=new ArrayList<>();
        
        int n=arr.length;
        for(int i=0;i<n;i++){
            int sum=0;
            for(int j=i;j<n;j++){
            sum+=arr[j];
        
            if(sum==target){
            res.add(i+1);
            res.add(j+1);
            return res;
            }
            }
        }
        res.add(-1);
        return res;
    }
}
