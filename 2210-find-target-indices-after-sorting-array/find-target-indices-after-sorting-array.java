import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
            int count = 0;
                    int smallerCount = 0;
                            
                                    for (int num : nums) {
                                                if (num < target) {
                                                                smallerCount++;
                                                                            } else if (num == target) {
                                                                                            count++;
                                                                                                        }
                                                                                                                }
                                                                                                                        
                                                                                                                                List<Integer> result = new ArrayList<>();
                                                                                                                                        for (int i = 0; i < count; i++) {
                                                                                                                                                    result.add(smallerCount + i);
                                                                                                                                                            }
                                                                                                                                                                    
                                                                                                                                                                            return result;
                                                                                                                                                                                }
                                                                                                                                                                                }