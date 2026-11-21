class MyStack {

     Queue <Integer> queue = new LinkedList<>();
     Queue <Integer> temp = new LinkedList<>();



    public MyStack() {
        
    }
    
    public void push(int x) {
        queue.offer(x);
    }
    
    public int pop() {
        while(queue.size()>1){
            temp.offer(queue.poll());
        }
        int ans = queue.poll();
        while(!temp.isEmpty()){
            queue.offer(temp.poll());
        }
        return ans;
    }
    
    public int top() {
        int ans = -1;
        while(!queue.isEmpty()){
            if(queue.size()==1){
             ans = queue.peek();
            }
            temp.offer(queue.poll());
        }
        while(!temp.isEmpty()){
            queue.offer(temp.poll());
        }
        return ans;
    }
    
    public boolean empty() {
        if(queue.isEmpty()){
            return true;
        }else{
            return false;
        }
       
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */