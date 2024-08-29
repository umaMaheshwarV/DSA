class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        //int len = s.length;
        for(char ch: s.toCharArray()){
            if(ch == '(' || ch == '[' || ch == '{' ){
                stack.push(ch);
                //displayStack(stack);
            }else if ((ch == ')' || ch == ']' || ch == '}') && stack.isEmpty()){
                return false;
            }else if ((ch ==')' && stack.peek() == '(') ||(ch =='}' && stack.peek() == '{') || (ch ==']' && stack.peek() == '[')) {
                    stack.pop();
            }else{
                return false;
            }
        }
        if(stack.isEmpty()) return true;
    return false; 
    }
}