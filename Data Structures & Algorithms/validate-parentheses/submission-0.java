class Solution {
    public boolean isValid(String s) {
        Stack <Character> stack = new Stack<>();

        String open = "([{";
        String closed = ")]}";

        int i = 0;
        while(i < s.length()){
            char c = s.charAt(i);
            if(open.indexOf(c) >= 0){
                stack.push(s.charAt(i));
            } else{
                if(stack.isEmpty() || closed.indexOf(c) != open.indexOf(stack.pop())){
                    return false;
                }
            }
            i++;        
        }

        return stack.empty();
    }
}
