package org.nekomiz.problems.n1480RunningSumof1dArray;


class Solution {
    public int[] runningSum(int[] nums) {
        if (nums.length == 0) {
            return nums;
        }

        int[] output = new int[nums.length];
        output[0] = nums[0];

        for (int i = 1; i < nums.length; i++) {
            output[i] = output[i-1] + nums[i];
        }
        return output;
    }
}
