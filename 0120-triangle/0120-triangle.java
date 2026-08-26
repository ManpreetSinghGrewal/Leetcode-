class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        List<List<Integer>> dp = new ArrayList<>();
        int n = triangle.size();
        if(n==1){
            return triangle.get(0).get(0);
        }
        for(int i = 0;i < n;i++){
            dp.add(new ArrayList<>());
        }
        dp.get(0).add(triangle.get(0).get(0));
        for(int i = 1;i<n;i++){
            for(int j = 0;j<=i;j++){
                if(j == 0){
                    dp.get(i).add(triangle.get(i).get(j) + dp.get(i-1).get(j));
                }
                if(j == i){
                    dp.get(i).add(triangle.get(i).get(j) + dp.get(i-1).get(j-1));
                }
                if(j!=i && j != 0){
                    dp.get(i).add(triangle.get(i).get(j) + Math.min(dp.get(i-1).get(j),dp.get(i-1).get(j-1)));
                }
            }
        }
        int min = Integer.MAX_VALUE;
        for(int i = 0;i < n;i++){
            if(min > dp.get(n-1).get(i)){
                min = dp.get(n-1).get(i);
            }
        }
        return min;
    }
}