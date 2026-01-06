//postorder-> reverse of(reverse preorder).
class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
        
        //preorder->  root->left->right
        //reverse preorder->   root->right->left.
        Stack<TreeNode> st=new Stack<>();
        List<Integer> list=new ArrayList<>();
        if(root!=null)st.push(root);
        while(st.size()>0){
            TreeNode curr=st.pop();
            list.add(curr.val);
            if(curr.left!=null)st.push(curr.left);
            if(curr.right!=null)st.push(curr.right);
        }
        Collections.reverse(list);
        return list;


    }
}