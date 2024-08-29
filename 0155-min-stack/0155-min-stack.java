class MinStack {
    private Stack<Integer> st ;
    private Stack<Integer> minst;
    //int min = Integer.MIN_VALUE;

    public MinStack() {
        st = new Stack<>();
        minst = new Stack<>();
        //minst.push(min);
    }
    
    public void push(int val) {
        st.push(val);
        if(minst.isEmpty()){
             minst.push(val);
        } else { 
            if(val>minst.peek()){
            minst.push(minst.peek());
            //minst.push(val);
            }else{
           minst.push(val);
            }
        }
    }
    
    public void pop() {
        st.pop();
        minst.pop();
    }
    
    public int top() {
       return st.peek();
    }
    
    public int getMin() {
       return minst.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */