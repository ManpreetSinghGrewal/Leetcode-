class Solution {
    public int evalRPN(String[] tokens) {
        Stack <String> st = new Stack<>();
        int n = tokens.length;
        // for(int i =n-1;i>=0;i--){
        //     st.push(tokens[i])
        // }
        for(int i =0;i<n;i++){
            String aa = tokens[i] ;
            if(aa.equals("+")){
                int a =Integer.valueOf(st.pop());
                int b = Integer.valueOf(st.pop());
                st.push(Integer.toString(b+a)); 
            }
            else if(aa.equals("-")){
                int a =Integer.valueOf(st.pop());
                int b = Integer.valueOf(st.pop());
                st.push(Integer.toString(b-a));
            }
            else if(aa.equals("*")){
                int a =Integer.valueOf(st.pop());
                int b = Integer.valueOf(st.pop());
                st.push(Integer.toString(b*a));
            }
            else if(aa.equals("/")){
                int a =Integer.valueOf(st.pop());
                int b = Integer.valueOf(st.pop());
                st.push(Integer.toString(b/a));
            }
            else{
                st.push(aa);
            }
        }
        String res = st.pop();
        return Integer.valueOf(res);
    }
}