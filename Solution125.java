/*
 * @lc app=leetcode.cn id=125 lang=java
 *
 * [125] 验证回文串
 */

public class Solution125 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.isPalindrome("A man, a plan, a anal: Panama"));
    }
}

// @lc code=start
class Solution {
    public boolean isPalindrome(String s) {
        char[] c = s.toCharArray();
        int start = 0, end = c.length - 1;
        while(start < end){
            if(!Character.isLetterOrDigit(c[start])){
                start++;
            }else if(!Character.isLetterOrDigit(c[end])){
                end--;
            }else if(c[start] == c[end] || (c[start] > '9' && c[end] > '9' && (c[start] - c[end] == 'a' - 'A' || c[start] - c[end] == 'A' - 'a'))){
                start++;
                end--;
            }else{
                return false;
            }
            
        }
        return true;
    }
}
// @lc code=end

