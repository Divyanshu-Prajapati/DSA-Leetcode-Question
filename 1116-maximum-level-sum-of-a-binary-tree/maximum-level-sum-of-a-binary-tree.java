class Solution {
    int n;

    public int level(TreeNode root){
        if(root == null) return 0;
        return 1 + Math.max(level(root.left), level(root.right));
    }

    public int helper(TreeNode root, int level){
        if(root == null) return 0;

        int sum = 0;
        if(level == n){
            sum += root.val;
        }

        sum += helper(root.left, level + 1);
        sum += helper(root.right, level + 1);

        return sum;
    }

    public int maxLevelSum(TreeNode root) {
        int h = level(root);
        int max = Integer.MIN_VALUE;
        int lev = 1;

        for(int i = 1; i <= h; i++){
            n = i;
            int value = helper(root, 1);
            if(value > max){
                max = value;
                lev = i;
            }
        }
        return lev;
    }
}
