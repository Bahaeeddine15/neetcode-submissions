class Solution {
    public boolean isValid(String s) {
        Stack<Character> valid = new Stack<>();
        for(int i = 0;i<s.length();i++){
            char c = s.charAt(i);
            if(c=='(' || c=='{' || c=='['){
                valid.push(c);
            }else{
                if(valid.isEmpty()){
                    return false;
                }
                char lastItem = valid.pop();
                if(c==')' && lastItem!='('){
                    return false;
                }
                if(c=='}' && lastItem!='{'){
                    return false;
                }
                if(c==']' && lastItem!='['){
                    return false;
                }
            }
        }
        return valid.isEmpty();
    }
}
