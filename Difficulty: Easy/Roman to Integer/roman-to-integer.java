class Solution {
    public int romanToDecimal(String s) {
        // code here
        HashMap<Character,Integer> res=new HashMap<>();
        res.put('I',1);
        res.put('V',5);
        res.put('X',10);
        res.put('L',50);
        res.put('C',100);
        res.put('D',500);
        res.put('M',1000);
        int total=0;
        for(int i=0;i<s.length();i++){
            int curr=res.get(s.charAt(i));
            if(i<s.length()-1){
                int next=res.get(s.charAt(i+1));
                if(curr<next){
                    total-=curr;
                }
                else{
                    total+=curr;
                }
            }
            else{
                total+=curr;
            }
        }
        return total;
    }
}