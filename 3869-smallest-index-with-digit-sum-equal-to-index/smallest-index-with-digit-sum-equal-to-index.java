class Solution {
        public int smallestIndex(int[] nums) {
                for (int i = 0; i < nums.length; i++) {
                            int currentNum = nums[i];
                                        int digitSum = 0;
                                                    
                                                                // Calculate the sum of the digits of nums[i]
                                                                            while (currentNum > 0) {
                                                                                            digitSum += currentNum % 10;
                                                                                                            currentNum /= 10;
                                                                                                                        }
                                                                                                                                    
                                                                                                                                                // Check if the digit sum equals the index
                                                                                                                                                            if (digitSum == i) {
                                                                                                                                                                            return i;
                                                                                                                                                                                        }
                                                                                                                                                                                                }
                                                                                                                                                                                                        
                                                                                                                                                                                                                // If no such index exists, return -1
                                                                                                                                                                                                                        return -1;
                                                                                                                                                                                                                            }
                                                                                                                                                                                                                            }
