class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> stack = new Stack<>();
        int len = operations.length;
        for(int i=0;i<len;i++){
            String operation = operations[i];
            if(operation.equals("C") ||operation.equals("D") || operation.equals("+")) {
                if (operation.equals("C")){
                    stack.pop();
                }else if (operation.equals("D")){
                    int temp=stack.peek();
                    stack.push(temp*2);
                }else{
                    int temp1=stack.pop();
                    int temp2=stack.pop();
                    stack.push(temp2);
                    stack.push(temp1);
                    stack.push(temp1+temp2);
                }
            }else{
                stack.push(Integer.parseInt(operations[i]));
            }
        }
        int count =0;
        while(!stack.isEmpty()){
            count+=stack.pop();
        }
        return count;
    }
}