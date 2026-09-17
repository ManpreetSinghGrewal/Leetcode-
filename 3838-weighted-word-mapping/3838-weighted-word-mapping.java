class Solution {
    public String mapWordWeights(String[] words, int[] weights) {
        StringBuilder result = new StringBuilder();
        
        for (String word : words) {
            int sum = 0;
            for (char c : word.toCharArray()) {
                sum += weights[c - 'a'];
            }
            int val = sum % 26;
            char mappedChar = (char) ('z' - val);
            result.append(mappedChar);
        }
        
        return result.toString();
    }
}