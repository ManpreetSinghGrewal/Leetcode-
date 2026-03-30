class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Map <Integer,Integer> map = new HashMap<>();
        Stack<Integer> st = new Stack<>();
        for(int i = nums2.length-1;i>=0;i--){
            while(st.size()> 0 && st.peek()<nums2[i]){
                st.pop();
            }
            int ng = st.isEmpty() ? -1 : st.peek();
            map.put(nums2[i], ng);
             st.push(nums2[i]);
        }
  
        for (int i = 0; i < nums1.length; i++) {
            nums1[i] = map.get(nums1[i]);
        }
        return nums1;
    }
}