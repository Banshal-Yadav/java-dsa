// Qs. 1672 - Richest Customer Wealth
package Leetcode.Arrays;

public class MaxWealth {
    public int maximumWealth(int[][] accounts) {
        int cuu = 0;
        int maxWealth = 0;
        // rows loop
        for(int row = 0; row < accounts.length; row++){
            // resets current wealth sum every row
            cuu = 0;
            // cols loop
            for(int col = 0; col < accounts[row].length; col++) {
                // sum of wealth in single row
                cuu += accounts[row][col];
            }
            // update max sum every rows loop
            if(cuu > maxWealth) {
                maxWealth = cuu;
            }
        }
        return maxWealth;
    }
}
