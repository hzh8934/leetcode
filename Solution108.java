/*
 * @lc app=leetcode.cn id=108 lang=java
 *
 * [108] 将有序数组转换为二叉搜索树
 */


import java.util.Arrays;

class TreeNode {
   int val;
   TreeNode left;
   TreeNode right;
   TreeNode(int x) { val = x; }
}
// @lc code=start
class Solution108 {
    public TreeNode sortedArrayToBST(int[] nums) {
        if(nums.length == 0) return null;
        int center = nums.length / 2;
        TreeNode treeNode = new TreeNode(nums[center]);
        if(center - 1 >= 0){
            treeNode.left = sortedArrayToBST(Arrays.copyOfRange(nums, 0, center));
        }
        if(center + 1 <= nums.length){
            treeNode.right = sortedArrayToBST(Arrays.copyOfRange(nums, center + 1, nums.length));
        }
        return treeNode;
    }

}
// @lc code=end

