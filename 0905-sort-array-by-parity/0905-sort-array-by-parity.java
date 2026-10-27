class Solution {
    public int[] sortArrayByParity(int[] nums) {
        Integer[] boxedNums = new Integer[nums.length];
        for (int i = 0; i < nums.length; i++) {
            boxedNums[i] = nums[i];
        }
        Arrays.sort(boxedNums,(a,b) -> {
            if((a%2 == 0 && b%2 ==0) || (a%2 == 1 && b%2 ==1)){
            return a.compareTo(b);
        }
        return (a % 2 == 0) ? -1 : 1;
        });
        for (int i = 0; i < nums.length; i++) {
            nums[i] = boxedNums[i];
        }
        return nums;
    }
}
