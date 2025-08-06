class Solution {
    public static boolean checkPangram(String s) {
        // code here
        boolean [] findpresents=new boolean[26];
        s=s.toLowerCase();
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(ch>='a'&& ch<='z'){
                findpresents[ch-'a']=true;
            }
        }
        for(boolean present: findpresents){
            if(!present){
                return false;
            }
            
        }
        return true;
    }
}