/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public boolean isSameTreeRecussion(TreeNode p, TreeNode q) {
        // base case
        if(p == null && q == null) return true;
        if(p == null || q == null) return false;
        
        // recursion
        return p.val == q.val && isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }
    
    
    
    public boolean isSameTreeIterative(TreeNode p, TreeNode q) {
        if(p == null && q == null) return true;
        if(p == null || q == null) return false;
        ArrayDeque<TreeNode> aq = new ArrayDeque();
        aq.add(p);
        aq.add(q);
        TreeNode a;
        TreeNode b;
        while(!aq.isEmpty())
        {
            a = aq.pollFirst();
            b = aq.pollFirst();
            if(a.val != b.val) return false;
            if(a.left == null && b.left == null){
                //do nothing
            }
            else if(a.left == null || b.left == null) return false;
            else{
                aq.add(a.left);
                aq.add(b.left);
            }
            if(a.right == null && b.right == null){
                //do nothing
            }
            else if(a.right == null || b.right == null) return false;
            else{
                aq.add(a.right);
                aq.add(b.right);
            }
        }
        return true;
    }
}



