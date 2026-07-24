class Solution {
    public int repeatedStringMatch(String a, String b) {
        int count = 0;
        StringBuilder sb = new StringBuilder();
        
        // Loop 1: Repeat 'a' until its length is at least the length of 'b'
        while (sb.length() < b.length()) {
            sb.append(a);
            count++;
        }
        
        // Case 1: Check if 'b' is a substring now
        if (KMP(sb.toString(), b)) {
            return count;
        }
        
        // Case 2: Append 'a' one more time to catch overlapping boundaries
        sb.append(a);
        if (KMP(sb.toString(), b)) {
            return count + 1;
        }
        
        return -1;
    }

    private boolean KMP(String text, String pattern) {
        int[] lps = computeLPS(pattern);
        int i = 0; // index for text
        int j = 0; // index for pattern
        
        while (i < text.length()) {
            if (text.charAt(i) == pattern.charAt(j)) {
                i++;
                j++;
            }
            if (j == pattern.length()) {
                return true; // Match found
            } else if (i < text.length() && text.charAt(i) != pattern.charAt(j)) {
                if (j != 0) {
                    j = lps[j - 1]; // Fallback using LPS array
                } else {
                    i++;
                }
            }
        }
        return false;
    }

    private int[] computeLPS(String pattern) {
        int[] lps = new int[pattern.length()];
        int len = 0; // length of the previous longest prefix suffix
        int i = 1;
        
        while (i < pattern.length()) {
            if (pattern.charAt(i) == pattern.charAt(len)) {
                len++;
                lps[i] = len;
                i++;
            } else {
                if (len != 0) {
                    len = lps[len - 1]; // Fallback to previous valid prefix
                } else {
                    lps[i] = 0;
                    i++;
                }
            }
        }
        return lps;
    }
}
