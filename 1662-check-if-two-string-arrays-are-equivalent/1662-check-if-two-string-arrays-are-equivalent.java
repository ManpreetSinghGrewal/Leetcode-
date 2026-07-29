class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String s = "";
        for(int i = 0;i<word1.length;i++){
            s+= word1[i];
        }
        String t = "";
        for(int i = 0;i<word2.length;i++){
            t+= word2[i];
        }
        char[] arr1 = s.toCharArray();
        char[] arr2 = t.toCharArray();
        
        return Arrays.equals(arr1,arr2);

    }
}