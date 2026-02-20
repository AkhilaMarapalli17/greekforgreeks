class Solution {
    int countPairs(int arr[], int target) {
        // code here
        HashMap<Integer,Integer> res=new HashMap<>();
        int count=0;
        for(int i=0;i<arr.length;i++){
           int com=target-arr[i];
           if(res.containsKey(com)){
               count+=res.get(com);
           }
           res.put(arr[i],res.getOrDefault(arr[i],0)+1);
        }
        return count;
    }
}