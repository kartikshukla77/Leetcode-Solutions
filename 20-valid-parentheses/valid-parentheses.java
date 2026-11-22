class Solution {
    public boolean isValid(String s) {
    char A  = '(';
    char B = '[';
    char C = '{';

    Stack<Character> stack = new Stack<>();

    for(int i = 0 ; i<s.length() ; i++){
        char ch = s.charAt(i);
        if(ch==A || ch==B || ch==C){
            stack.push(ch);
        }else{
            if(stack.isEmpty()){
                return false;
            }else if( (ch==')' && stack.peek()=='(')  || (ch==']' && stack.peek()=='[')  || (ch=='}' && stack.peek()=='{')  ){
                stack.pop();
            }else{
                return false;
            }
        } 
        
    }

    if(stack.isEmpty()){
        return true;
    }else{
       return false;
    }    

    }
}