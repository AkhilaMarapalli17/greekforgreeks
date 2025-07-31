// User function Template for Java
class Solution {
    // Function to remove all occurrences of the character from the string
    public void removeCharacter(StringBuilder s, char c) {
        // code here
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==c){
            s.deleteCharAt(i);
                
               i--;}
        }
    }
}