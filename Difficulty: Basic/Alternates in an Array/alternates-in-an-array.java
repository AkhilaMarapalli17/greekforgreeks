class Solution {
    // function to print alternate elements of an array
    public ArrayList<Integer> getAlternates(int arr[]) {
        // Code Here
        ArrayList<Integer> n1=new ArrayList<>();
        int n=arr.length;
        for(int i=0;i<n;i+=2)
        {
            n1.add(arr[i]);
        }
    return n1;
    }
}