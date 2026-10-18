import java.util.ArrayList;
import java.util.List;

class Solution {
    private static final int MOD = 1_000_000_007;
        private long[][] table;

            public int numOfWays(int[] nums) {
                    int n = nums.length;
                            table = new long[n + 1][n + 1];
                                    
                                            // Precompute combinations using Pascal's triangle
                                                    for (int i = 0; i <= n; i++) {
                                                                table[i][0] = 1;
                                                                            for (int j = 1; j <= i; j++) {
                                                                                            table[i][j] = (table[i - 1][j - 1] + table[i - 1][j]) % MOD;
                                                                                                        }
                                                                                                                }

                                                                                                                        List<Integer> list = new ArrayList<>();
                                                                                                                                for (int num : nums) {
                                                                                                                                            list.add(num);
                                                                                                                                                    }

                                                                                                                                                            return (int) (dfs(list) - 1 + MOD) % MOD;
                                                                                                                                                                }

                                                                                                                                                                    private long dfs(List<Integer> nums) {
                                                                                                                                                                            if (nums.size() <= 2) {
                                                                                                                                                                                        return 1;
                                                                                                                                                                                                }

                                                                                                                                                                                                        int root = nums.get(0);
                                                                                                                                                                                                                List<Integer> leftTree = new ArrayList<>();
                                                                                                                                                                                                                        List<Integer> rightTree = new ArrayList<>();

                                                                                                                                                                                                                                for (int i = 1; i < nums.size(); i++) {
                                                                                                                                                                                                                                            if (nums.get(i) < root) {
                                                                                                                                                                                                                                                            leftTree.add(nums.get(i));
                                                                                                                                                                                                                                                                        } else {
                                                                                                                                                                                                                                                                                        rightTree.add(nums.get(i));
                                                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                                                            }

                                                                                                                                                                                                                                                                                                                    long leftWays = dfs(leftTree) % MOD;
                                                                                                                                                                                                                                                                                                                            long rightWays = dfs(rightTree) % MOD;

                                                                                                                                                                                                                                                                                                                                    int L = leftTree.size();
                                                                                                                                                                                                                                                                                                                                            int R = rightTree.size();

                                                                                                                                                                                                                                                                                                                                                    // Combinations of interleaving left and right elements
                                                                                                                                                                                                                                                                                                                                                            long ways = table[L + R][L];
                                                                                                                                                                                                                                                                                                                                                                    ways = (ways * leftWays) % MOD;
                                                                                                                                                                                                                                                                                                                                                                            ways = (ways * rightWays) % MOD;

                                                                                                                                                                                                                                                                                                                                                                                    return ways;
                                                                                                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                                                                                                        }