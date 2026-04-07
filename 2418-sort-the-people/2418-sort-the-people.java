class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        Map <Integer,String>map = new HashMap<>();
        for(int i=0;i<names.length;i++){
            map.put(heights[i],names[i]);
        }
        String []res = new String[names.length];
        int k =0;
        Arrays.sort(heights);
        for(int i = heights.length-1;i>=0;i--){
            res[k++] = map.get(heights[i]);
        }
        return res;
    }
}