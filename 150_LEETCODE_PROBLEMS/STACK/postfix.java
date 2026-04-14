class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer>st=new Stack<>();
        
        // loop through the tokens
        for(String token:tokens){
            if(token.equals("+") || token.equals("*") || token.equals("/") || token.equals("-")){
                int b=st.pop();// second operand
                int a =st.pop();//first operand

                if(token.equals("+")){
                    st.push(a+b);
                }
                else if(token.equals("-")){
                    st.push(a-b);
                }
                else if(token.equals("/")){
                    st.push(a/b);
                }
                else if(token.equals("*")){
                    st.push(a*b);
                }
                
            }
            else{
                st.push(Integer.parseInt(token));
            }
        }
        return st.peek();
    }
}