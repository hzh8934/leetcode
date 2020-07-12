/*
 * @lc app=leetcode.cn id=5461 lang=java
 *
 * [5461] 仅含 1 的子串数
 */



// @lc code=start
class Solution5461 {
    public int numSub(String s) {
        int result = 0;
        char[] ch = s.toCharArray();
        double nowOneNum = 0;
        for (char i:
             ch) {
            if(i == '1') nowOneNum++;
            else if(nowOneNum != 0) {
                result += ((nowOneNum + 1) * nowOneNum / 2) % (1e9 + 7);
                result %= (1e9 + 7);
                nowOneNum = 0;
            }
        }
        if(nowOneNum != 0){
            result += ((nowOneNum + 1) * nowOneNum / 2) % (1e9 + 7);
            result %= (1e9 + 7);
        }
        return result;
    }
}
// @lc code=end

