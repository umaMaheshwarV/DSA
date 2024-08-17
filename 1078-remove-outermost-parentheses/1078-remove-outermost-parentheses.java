class Solution {
    public String removeOuterParentheses(String s) {
        int incr = 0;
        StringBuilder sb =new StringBuilder() ;
        //((((()))))
        for (char ch : s.toCharArray()){
            if(ch == '('){
                incr+=1;
                if(incr>1){
                sb.append(ch);
                }
            }else{
                incr-=1;
                if(incr > 0) {
                    sb.append(ch);
                }
            }
            
        }
    return sb.toString();
    }
}