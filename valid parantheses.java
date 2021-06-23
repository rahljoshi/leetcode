class Solution {
    public boolean isValid(String s) {
        Stack<Character> st=new Stack();
        for(int i=0;i<s.length();i++){
            Character ch=s.charAt(i);
            if(ch == '(' || ch == '[' || ch == '{'){
                st.push(ch);
            }
            else if(ch == '}' || ch == ']' || ch ==')'){
                if(ch == '}'){
                 boolean ans=checker(st, '{');
                    if(ans == false){
                        return false;
                    }
                }
                else if(ch == ']' ){
                   boolean ans=checker(st, '[');
                    if(ans == false){
                        return false;
                    }
                }
                else if(ch == ')'){
                     boolean ans=checker(st, '(');
                    if(ans == false){
                        return false;
                    }
                }
            }
        }
        return st.size()==0?true:false;
    }
    public boolean checker(Stack<Character> st, char ch){
        if(st.size() == 0){
            return false;
        }
        else if(st.peek() != ch){
            return false;
        }
        else if(st.peek() == ch){
            st.pop();
            return true;
        }
        return true;
    }
}