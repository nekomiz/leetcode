package org.nekomiz.problems.n1929ConcatenationofArray;


class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] concat = new int[nums.length * 2];
        for (int i = 0; i < nums.length; i++) {
            concat[i] = nums[i];
            concat[nums.length + i] = nums[i];
        }
        return concat;
    }
}
