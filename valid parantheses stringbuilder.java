class Solution {
    public boolean isValid(String s) {
        StringBuilder sb = new StringBuilder();
        for(char c: s.toCharArray()){
            if(c == '(' || c =='[' || c == '{' ){
                sb.append(c);
            }else if(c == '}'){
                boolean ans = checker(sb, '{');
                if(ans == false){
                    return false;
                }
            }else if(c == ')'){
                boolean ans = checker(sb, '(');
                 if(ans == false){
                     return false;
                 }
            }
            else if(c == ']'){
                boolean ans = checker(sb, '[');
                if(ans == false){
                    return false;
                }
            }
        }
        return sb.length() == 0;
    }
    public boolean checker(StringBuilder sb, char c){
        if(sb.length() == 0){
            return false;
        }else if(sb.charAt(sb.length() - 1) != c){
            return false;
        }
        sb.deleteCharAt(sb.length()-1);
        return true;
    }
}