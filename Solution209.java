/*
 * @lc app=leetcode.cn id=209 lang=java
 *
 * [209] 长度最小的子数组
 */


// @lc code=start
class Solution209 {
    public int minSubArrayLen(int s, int[] nums) {
        if(nums.length == 0) return 0;
        int start = 0, end = 0, min = 0, now = nums[0];
        while(true){
            if(min == 1) return 1;
            if(now >= s){
                if(min == 0 || end - start < min) min = end - start + 1;
                now -= nums[start];
                start++;
            }else{
                if(end == nums.length - 1) return min;
                end++;
                now += nums[end];
            }
        }
    }
}
// @lc code=end

