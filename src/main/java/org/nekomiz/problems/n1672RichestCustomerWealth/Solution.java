package org.nekomiz.problems.n1672RichestCustomerWealth;


class Solution {
    public int maximumWealth(int[][] accounts) {
        int maxWealth = 0;

        for (int i = 0; i < accounts.length; i++) {
            int accountSum = accounts[i][0];

            for (int j = 1; j < accounts[i].length; j++) {
                accountSum += accounts[i][j];
            }

            if (accountSum > maxWealth) {
                maxWealth = accountSum;
            }
        }

        return maxWealth;
    }
}