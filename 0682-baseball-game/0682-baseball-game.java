class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> st = new Stack<>();
        int res = 0;
        for(int i=0;i<operations.length;i++){
            String c = operations[i];
            if(c.equals("+")){
                int o = st.pop();
                int s = st.pop();
                st.push(s);
                st.push(o);
                
                st.push(o+s);
            }
            else if(c.equals("D")){
                int top = st.peek();
                st.push(top * 2);
            }
            else if(c.equals("C")){
                int top = st.pop();
            }
            else {
                st.push(Integer.parseInt(c));
            }
        }
        while(!st.isEmpty()){
            res += st.pop();
        }
        return res;
    }
}