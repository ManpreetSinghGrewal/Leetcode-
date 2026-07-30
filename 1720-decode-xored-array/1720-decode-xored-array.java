class Solution {
    public int[] decode(int[] encoded, int first) {
        // The hidden array will have one more element than the encoded array
        int[] arr = new int[encoded.length + 1];
        
        arr[0] = first;
 

        for (int i = 0; i < encoded.length; i++) {
            arr[i + 1] = arr[i] ^ encoded[i];
        }
        
        return arr;
    }
}
