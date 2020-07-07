/*
 * @lc app=leetcode.cn id=112 lang=java
 *
 * [112] 二进制求和
 */


// @lc code=start
class Solution112 {
    public boolean hasPathSum(TreeNode root, int sum) {
        if(root == null) return false;
        if(sum == root.val && root.left == null && root.right == null){
            return true;
        }
        boolean left = false, right = false;
        if(root.left != null) left = hasPathSum(root.left, sum - root.val);
        if(root.right != null) right = hasPathSum(root.right, sum - root.val);
        return left || right;
    }

    public boolean hasPathSum2(TreeNode root, int sum) {
        if(root == null){
            return false;
        }
        if(sum == root.val && root.left == null && root.right == null){
            return true;
        }
        if(root.left != null && this.hasPathSum(root.left, sum - root.val)){
            return true;
        }
        if(root.right != null && this.hasPathSum(root.right, sum - root.val)){
            return true;
        }
        return false;
    }
}
// @lc code=end

