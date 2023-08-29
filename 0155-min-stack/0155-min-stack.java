class MinStack {
    Node head;
    class Node {
        int min;
        int val;
        Node next;

        Node(int min, int val, Node next) {
            this.min = min;
            this.val = val;
            this.next = next;
        }
    }
    public MinStack() {
        head = null;
    }
    
    public void push(int val) {
        int min = (head==null) ? val : head.min;
        Node newNode = new Node(Math.min(min, val), val, head);
        head = newNode;
    }
    
    public void pop() {
        if (head.next == null || head == null) {
            head = null;
            return;
        }

        head = head.next;
    }
    
    public int top() {
        return head.val;
    }
    
    public int getMin() {
        return head.min;
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