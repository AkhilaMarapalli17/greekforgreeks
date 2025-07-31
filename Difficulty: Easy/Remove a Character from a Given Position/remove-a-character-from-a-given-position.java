// User function Template for Java
class Solution {
    public String removeCharacter(String s, int pos) {
        // code here
        StringBuilder res=new StringBuilder();
        for(int i=0;i<s.length();i++)
        {
            if(i==pos) continue;
            res.append(s.charAt(i));

        }
        return res.toString();
    }
}