package org.nekomiz.problems.n1920BuildArrayfromPermutation;

class Solution {
    public int[] buildArray(int[] nums) {
        int[] builded = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            builded[i] = nums[nums[i]];
        }
        return builded;
    }
}