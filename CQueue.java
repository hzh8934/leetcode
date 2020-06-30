/*
 * @lc app=leetcode.cn id=剑指 Offer 09 lang=java
 *
 * [剑指 Offer 09] 用两个栈实现队列
 */


import java.util.Stack;

// @lc code=start
class CQueue {

    private Stack<Integer> input;
    private Stack<Integer> output;

    public CQueue() {
        input = new Stack<>();
        output = new Stack<>();
    }

    public void appendTail(int value) {
        input.push(value);
    }

    public int deleteHead() {
        if(!output.empty()) return output.pop();
        if(input.empty()) return -1;
        while (input.size() > 1){
            output.push(input.pop());
        }
        return input.pop();
    }
}

/**
 * Your CQueue object will be instantiated and called as such:
 * CQueue obj = new CQueue();
 * obj.appendTail(value);
 * int param_2 = obj.deleteHead();
 */
// @lc code=end

