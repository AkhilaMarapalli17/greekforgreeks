/*
class Node {
    int data;
    Node left, right;

    Node(int d)
    {
        data = d;
        left = right = null;
    }
}
*/

class Solution {
    int res=0;
    public boolean isBalanced(Node root) {
        // code here
     return height(root)!=-1;
    }
    public int height(Node root){
        if(root==null){
            return 0;
        }
        int l=height(root.left);
        if(l==-1) return -1;
        int r=height(root.right);
        if(r==-1) return -1;
        if(Math.abs(l-r)>1) return -1;
        return 1+Math.max(l,r);
    }
}