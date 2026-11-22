class Solution {
    public int minAddToMakeValid(String s) {
        // () )) ((
        if(s.isEmpty()){
            return 0;
        }
        int count = 0;
        Stack<Character> stack = new Stack<>();

        for(int i = 0 ; i<s.length() ; i++){
            char ch = s.charAt(i);
            if(ch=='('){
                stack.push(ch);
                count++;
            }else{
                if(stack.isEmpty()){
                   stack.push(ch);
                   count++;
                }
                else if(stack.peek()=='('){
                    stack.pop();
                    count--;
                }else{
                    count++;
                }
            }
        }

    return count;
    }
}