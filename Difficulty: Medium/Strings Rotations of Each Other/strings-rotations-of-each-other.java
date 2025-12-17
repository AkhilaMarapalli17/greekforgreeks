class Solution {
    public boolean areRotations(String s1, String s2) {
        if (s1.length() != s2.length()) return false;
        String text = s1 + s1;  // Concatenate to cover all rotations
        return KMPSearch(text, s2);
    }

    private boolean KMPSearch(String text, String pat) {
        int[] lps = computeLPSArray(pat);
        int i = 0; // index for text
        int j = 0; // index for pat

        while (i < text.length()) {
            if (text.charAt(i) == pat.charAt(j)) {
                i++;
                j++;
            }
            if (j == pat.length()) {
                return true; // found match
            } else if (i < text.length() && text.charAt(i) != pat.charAt(j)) {
                if (j != 0) {
                    j = lps[j - 1];
                } else {
                    i++;
                }
            }
        }
        return false;
    }

    private int[] computeLPSArray(String pattern) {
        int n = pattern.length();
        int[] lps = new int[n];
        int len = 0; // length of the previous longest prefix suffix
        int i = 1;

        while (i < n) {
            if (pattern.charAt(i) == pattern.charAt(len)) {
                len++;
                lps[i] = len;
                i++;
            } else {
                if (len != 0) {
                    len = lps[len - 1];
                } else {
                    lps[i] = 0;
                    i++;
                }
            }
        }
        return lps;
    }
}