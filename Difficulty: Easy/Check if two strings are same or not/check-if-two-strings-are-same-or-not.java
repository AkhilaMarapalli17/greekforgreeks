// User function Template for Java
class StringUtils {
    // Function to check if two strings are the same
    public static boolean areStringsSame(String s1, String s2) {
        // code here
        if(s1== null || s2==null) {
            return false ;
        }
     return s1.equals(s2);
    }
}