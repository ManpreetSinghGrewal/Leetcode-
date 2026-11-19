class Solution {
    private void dfs(int num,int n,int k , List<Integer>res){
        if(n == 0){
            res.add(num);
            return;
        }
        int lastdigit = num%10;
        if(lastdigit+k <=9){
            dfs(num * 10 + lastdigit + k,n-1,k,res);
        }
        if(k>0 && lastdigit-k >=0){
            dfs(num * 10 +lastdigit - k,n-1,k,res);
        }
    }
    public int[] numsSameConsecDiff(int n, int k) {
        List<Integer> res = new ArrayList<>();
        for(int num = 1;num<=9;num++){
            dfs(num,n-1,k,res);
        }

        int retres[] = new int[res.size()];
        for(int i =0;i<res.size();i++){
            retres[i] = res.get(i);
        }
        return retres;
    }
}