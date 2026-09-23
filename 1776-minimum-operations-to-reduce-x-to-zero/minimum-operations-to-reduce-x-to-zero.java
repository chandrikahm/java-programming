class Solution {
        public int minOperations(int[] nums, int x) {
                int target = -x;
                        for (int num : nums) {
                                    target += num;
                                            }

                                                    // If total sum is strictly less than x, it's impossible.
                                                            if (target < 0) return -1;
                                                                    // If total sum equals x, we must remove all elements.
                                                                            if (target == 0) return nums.length;

                                                                                    int n = nums.length;
                                                                                            int left = 0;
                                                                                                    int currentSum = 0;
                                                                                                            int maxLength = -1;

                                                                                                                    // Sliding window to find the longest subarray with sum == target
                                                                                                                            for (int right = 0; right < n; right++) {
                                                                                                                                        currentSum += nums[right];

                                                                                                                                                    while (currentSum > target && left <= right) {
                                                                                                                                                                    currentSum -= nums[left];
                                                                                                                                                                                    left++;
                                                                                                                                                                                                }

                                                                                                                                                                                                            if (currentSum == target) {
                                                                                                                                                                                                                            maxLength = Math.max(maxLength, right - left + 1);
                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                }

                                                                                                                                                                                                                                                        return maxLength != -1 ? n - maxLength : -1;
                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                            }
