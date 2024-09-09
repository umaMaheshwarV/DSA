
class Solution {
    public String makeGood(String s) {
        Stack<Character> stack = new Stack<>();
        
        for (char ch : s.toCharArray()) {
            if (stack.isEmpty()) {
                stack.push(ch);
            } else if (Character.isUpperCase(ch)) {
                char temp = stack.peek();
                if (temp == Character.toLowerCase(ch)) {
                    stack.pop(); // Remove the matching lowercase character
                } else {
                    stack.push(ch); // Push the current uppercase character
                }
            } else { // ch is lowercase
                char temp = stack.peek();
                if (temp == Character.toUpperCase(ch)) {
                    stack.pop(); // Remove the matching uppercase character
                } else {
                    stack.push(ch); // Push the current lowercase character
                }
            }
        }
        
        // Build the final string from the stack
        StringBuilder sb = new StringBuilder();  
        while (!stack.isEmpty()) {
            sb.append(stack.pop());
        }
        
        // Since we popped characters from the stack, we need to reverse the StringBuilder
        return sb.reverse().toString();
    }
}