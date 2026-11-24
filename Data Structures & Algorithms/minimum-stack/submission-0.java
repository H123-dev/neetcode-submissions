class MinStack {

    Stack<Integer> s;
    Stack<Integer> min;

    public MinStack() {
        this.s = new Stack<>();
        this.min = new Stack<>();
    }
    
    public void push(int val) {
        s.push(val);
        if(min.empty()||min.peek()>val)
            min.push(val);
        else
            min.push(min.peek());
    }
    
    public void pop() {
        s.pop();
        min.pop();
    }
    
    public int top() {
        return s.peek();
    }
    
    public int getMin() {
        return min.peek();
    }
}
