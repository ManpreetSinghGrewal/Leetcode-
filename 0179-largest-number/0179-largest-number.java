class Solution {
    public String largestNumber(int[] nums) {
        int n = nums.length;
        String num[] = new String[n];
        for(int i = 0;i<n;i++){
            num[i] = String.valueOf(nums[i]);
        }
        StringBuilder res = new StringBuilder();
        Arrays.sort(num, (a,b) -> (b+a).compareTo(a+b));
        if(num[0].equals("0")){
            return "0";
        }
        for(String x: num){
            res.append(x);
        }
        return res.toString();
    }
}