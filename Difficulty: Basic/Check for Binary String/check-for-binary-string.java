class Solution {
    boolean isBinary(String s) {
        // Your code here
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(!(c=='0'|| c=='1')){
                return false;
            }
        
        }
        return true;
    }
}