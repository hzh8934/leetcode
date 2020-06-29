/*
 * @lc app=leetcode.cn id=215 lang=java
 *
 * [215] 数组中的第K个最大元素
 */


// @lc code=start
class Solution215 {
    public int findKthLargest(int[] nums, int k) {
        boolean isMax = true;
        if(nums.length / 2 < k){
            k = nums.length - k + 1;
            isMax = false;
        }
        int extreme, n;
        for (int i = 0; i < k; i++) {
            extreme = i;
            for (int j = i + 1; j < nums.length; j++) {
                if(isMax == nums[j] > nums[extreme]){
                    extreme = j;
                }
            }
            n = nums[i];
            nums[i] = nums[extreme];
            nums[extreme] = n;
        }
        return nums[k - 1];
    }
}
// @lc code=end

