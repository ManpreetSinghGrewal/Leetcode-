class Solution {
    public List<Integer> findLonely(int[] nums) {
        LinkedHashMap <Integer ,Integer> map =  new LinkedHashMap<Integer,Integer>();
        int l = 0;
        for(int i =0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i],map.get(nums[i])+1);
            }
            else{
                map.put(nums[i],1);
            }
        }
        List<Integer> list = new ArrayList<>();
        for (Map.Entry <Integer,Integer> entry : map.entrySet()){
            if(entry.getValue()==1){
                if(map.containsKey(entry.getKey()+1) == false && map.containsKey(entry.getKey()-1) == false){
                    list.add(entry.getKey());
                }
            }
        }
        return list ;
    }
}