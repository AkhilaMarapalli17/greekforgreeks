class Solution {
    public void reverseQueue(Queue<Integer> q) {
        // code here
        // Queue<Integer> q=new Queue<>();
        Stack<Integer> stack=new Stack<>();
        while(!q.isEmpty())
        {
            stack.push(q.remove());
        }
        while(!stack.isEmpty())
        {
            q.add(stack.pop());
        }
        
    }
}