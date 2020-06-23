/*
 * @lc app=leetcode.cn id=67 lang=java
 *
 * [67] 二进制求和
 */


// @lc code=start
class Solution67 {
    public String addBinary(String a, String b) {
        char[] charA = a.toCharArray();
        char[] charB = b.toCharArray();
        int resultLength = charA.length;
        if(charB.length > resultLength) resultLength = charB.length;
        char[] result = new char[resultLength];
        int carry = 0, n;
        for (int i = 1; i <= resultLength; i++) {
            n = (charA.length >= i && charA[charA.length - i] == '1' ? 1 : 0) +
                    (charB.length >= i && charB[charB.length - i] == '1' ? 1 : 0) +
                    carry;
            result[resultLength - i] = n == 0 || n == 2 ? '0' : '1';
            carry = n >= 2 ? 1 : 0;
        }
        return (carry == 1 ? "1" : "") + (new String(result));
    }
}
// @lc code=end

