import java.util.List;

class Solution {
    public int maxSum(List<Integer> nums, int k) {
            int[] bitCounts = new int[32];
                    
                            // Count the number of set bits at each position across all numbers
                                    for (int num : nums) {
                                                for (int i = 0; i < 32; i++) {
                                                                if ((num & (1 << i)) != 0) {
                                                                                    bitCounts[i]++;
                                                                                                    }
                                                                                                                }
                                                                                                                        }
                                                                                                                                
                                                                                                                                        long totalSum = 0;
                                                                                                                                                long MOD = 1_000_000_007;
                                                                                                                                                        
                                                                                                                                                                // Build the k numbers greedily to make them as large as possible
                                                                                                                                                                        for (int step = 0; step < k; step++) {
                                                                                                                                                                                    long currentVal = 0;
                                                                                                                                                                                                for (int i = 0; i < 32; i++) {
                                                                                                                                                                                                                if (bitCounts[i] > 0) {
                                                                                                                                                                                                                                    currentVal |= (1L << i);
                                                                                                                                                                                                                                                        bitCounts[i]--;
                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                                                totalSum = (totalSum + (currentVal * currentVal) % MOD) % MOD;
                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                                
                                                                                                                                                                                                                                                                                                                        return (int) totalSum;
                                                                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                                                                            }