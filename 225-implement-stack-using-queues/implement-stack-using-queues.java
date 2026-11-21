class MyStack {

    Queue <Integer> queue = new LinkedList<>();

    public MyStack() {}
    
    public void push(int x) {
        queue.offer(x);
    }
    
    public int pop() {
     
      int i = 0;
      while(i<queue.size()){
         if(i==queue.size()-1){
            return queue.poll();
         }
          queue.offer(queue.poll());
          i++;
      }
      return -1;
    }
    
    public int top() {
      int ans = -1;
      int i = 0;
      while(i<queue.size()){
         if(i==queue.size()-1){
            ans =  queue.peek();
         }
          queue.offer(queue.poll());
          i++;
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
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */


/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */