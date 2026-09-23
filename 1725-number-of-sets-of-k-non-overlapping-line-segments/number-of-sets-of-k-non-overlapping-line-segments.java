class Solution {
        public int numberOfSets(int n, int k) {
                int MOD = 1000000007;
                        
                                // We are choosing 2k points out of n + k - 1 points.
                                        int totalPoints = n + k - 1;
                                                int pointsToChoose = 2 * k;
                                                        
                                                                if (pointsToChoose > totalPoints) {
                                                                            return 0;
                                                                                    }
                                                                                            
                                                                                                    long ans = 1;
                                                                                                            for (int i = 1; i <= pointsToChoose; i++) {
                                                                                                                        ans = (ans * (totalPoints - i + 1)) % MOD;
                                                                                                                                    ans = (ans * modInverse(i, MOD)) % MOD;
                                                                                                                                            }
                                                                                                                                                    
                                                                                                                                                            return (int) ans;
                                                                                                                                                                }
                                                                                                                                                                    
                                                                                                                                                                        // Fermat's Little Theorem for modular inverse
                                                                                                                                                                            private long modInverse(int n, int mod) {
                                                                                                                                                                                    long power = mod - 2;
                                                                                                                                                                                            long res = 1;
                                                                                                                                                                                                    long base = n;
                                                                                                                                                                                                            
                                                                                                                                                                                                                    while (power > 0) {
                                                                                                                                                                                                                                if (power % 2 == 1) {
                                                                                                                                                                                                                                                res = (res * base) % mod;
                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                        base = (base * base) % mod;
                                                                                                                                                                                                                                                                                    power /= 2;
                                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                                                    return res;
                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                        }
