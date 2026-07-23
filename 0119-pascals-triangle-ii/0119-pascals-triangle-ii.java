class Solution {
    Map<String,Integer>map  = new HashMap <>();
    public int helper(int row, int col){
         if(row == 0|| col ==0|| row == col){
            return 1;
         }
         String key = Integer.toString(row) + "" + Integer.toString(col);
         if(map.containsKey(key)){
            return map.get(key);
         }
        int res = helper(row-1,col-1)+ helper(row-1,col);
        map.put(key,res);
        return map.get(key);
    }
    public List<Integer> getRow(int rowIndex) {
        ArrayList<Integer>res = new ArrayList<>();
        int row = rowIndex;
        for(int col = 0;col<=rowIndex;col++){
            res.add(helper(row,col));
        }
        return res;
    }
}