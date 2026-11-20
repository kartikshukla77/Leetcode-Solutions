class MyQueue {
    Stack <Integer>s = new Stack<Integer>();
    Stack<Integer> temp = new Stack<Integer>();
    public MyQueue() {
         
    }
    
    public void push(int x) {
         s.push(x);
    }
    
    public int pop() {

        if(this.empty()){
            return -1;
        }
         while(!s.isEmpty()){
            temp.push(s.pop());
         }

         int ans = temp.pop();

         while(!temp.isEmpty()){
            s.push(temp.pop());
         }

        return ans;
    }
    
    public int peek() {
            while(!s.isEmpty()){
            temp.push(s.pop());
         }
         
         int ans = temp.peek();

         while(!temp.isEmpty()){
            s.push(temp.pop());
         }

        return ans;   



        
    }
    
    public boolean empty() {
        if(s.isEmpty()){
            return true;
        }else{
            return false;
        }
    }
}
/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */