class Solution { 
    // Helper method to compute the Longest Prefix Suffix (LPS) array
    private int[] computeLPS(String needle, int n) {
        int[] lps = new int[n];
        int len = 0; // length of the previous longest prefix suffix
        int i = 1;
        lps[0] = 0; // lps[0] is always 0

        while (i < n) {
            if (needle.charAt(i) == needle.charAt(len)) {
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

    public int strStr(String haystack, String needle) {
        // Edge case handling for empty pattern
        if (needle.isEmpty()) return 0; 
        
        int n = needle.length();
        int[] lps = computeLPS(needle, n);
        int m = haystack.length();
        int i = 0;
        int j = 0;

        while (i < m) {
            if (haystack.charAt(i) == needle.charAt(j)) {
                i++;
                j++;
            }
            if (j == n) {
                return i - j; // Match found
            } else if (i < m && haystack.charAt(i) != needle.charAt(j)) {
                if (j != 0) {
                    j = lps[j - 1]; // Fallback in needle using LPS array
                } else {
                    i++; // Shift right in haystack
                }
            }
        }
        return -1; // Match not found
    }
}
