class Solution {
    public TreeNode bstFromPreorder(int[] preorder) {
        int[] inorder=new int[preorder.length];
        for(int i=0;i<preorder.length;i++){
            inorder[i]=preorder[i];
        }
        Arrays.sort(inorder);
        int n=inorder.length-1;
        return makebst(inorder,preorder,0,n,0,n);
    }
    public TreeNode makebst(int[] inorder,int[] preorder,int prelo,int prehi,int inlo,int inhi){
        if(prelo>prehi || inlo>inhi)return null;
        TreeNode root=new TreeNode(preorder[prelo]);
        int r=0;
        while(preorder[prelo]!=inorder[r])r++;
        int leftsize=r-inlo;
        root.left=makebst(inorder,preorder,prelo+1,prelo+leftsize,inlo,r-1);
        root.right=makebst(inorder,preorder,prelo+leftsize+1,prehi,r+1,inhi);
        return root;
    }

}