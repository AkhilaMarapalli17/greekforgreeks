/*
class Node {
    int data;
    Node left;
    Node right;
    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
} */

class Solution {
    int res=0;
    public int diameter(Node root) {

        // code here
        height(root);
        return res;
    }
    int height(Node root){
        if(root==null){
            return 0;
        }
        else{
            int l=height(root.left);
            int r=height(root.right);
            res=Math.max(res,l+r);
            return 1+Math.max(l,r);
        }
    }
}