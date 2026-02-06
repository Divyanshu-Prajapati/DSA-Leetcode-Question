/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> list=new ArrayList<>();
        Queue<TreeNode> q=new LinkedList<>();
        if(root!=null)q.add(root);
        while(!q.isEmpty()){
            List<Integer> temp=new ArrayList<>();
            int size=q.size();
            while(size!=0){
                TreeNode value=q.poll();
                temp.add(value.val);
                if(value.left!=null)q.add(value.left);
                if(value.right!=null)q.add(value.right);
                size--;
            }
            list.add(temp);
        }
        return list;
    }
}