/*
 * @lc app=leetcode.cn id=5460 lang=java
 *
 * [5460] 好数对的数目
 */


import java.util.HashMap;

// @lc code=start
class Solution5460 {
    public int numIdenticalPairs(int[] nums) {
        int result = 0;
        HashMap<Integer, Integer> numbers = new HashMap<>();
        for (int i:
             nums) {
            if(numbers.get(i) == null) numbers.put(i, 1);
            else numbers.put(i, numbers.get(i) + 1);
        }
        for (int key:
             numbers.keySet()) {
            int number = numbers.get(key);
            if(number > 1){
                result += (number - 1) * number / 2;
            }
        }
        return result;
    }
}
// @lc code=end

