class MyStack {
    private int[] arr;
    private int top;

    public MyStack() {
        arr = new int[1000];
        top = -1;
    }

    public void push(int x) {
        // Your Code
        arr[++top] = x;     // Pre Increment
    }

    public int pop() {
        // Your Code
       if(top == -1){
           return -1;
       } 
       else {
           return arr[top--];    // post-decrement
       }
    }
}

