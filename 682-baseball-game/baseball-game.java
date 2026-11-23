class Solution {
    public int calPoints(String[] s) {
        Stack<Integer> stack = new Stack<>();

        for(int i = 0 ; i<s.length ; i++){

            String el = s[i]; 

            if(el.equals("D")){
                stack.push(stack.peek()*2);
            }else if(el.equals("C")){
                stack.pop();
            }else if(el.equals("+")){
                int a = stack.pop();
                int b = stack.peek();
                int sum = a+b;
                stack.push(a);
                stack.push(sum);
            }else{
               int val =  Integer.parseInt(el);
               stack.push(val);
            }
        }

        int sum = 0;
        while(!stack.isEmpty()){
            sum = sum + stack.pop();
        }
        return sum;
    }
}