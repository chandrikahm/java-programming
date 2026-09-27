class Solution {
        public String reverseParentheses(String s) {
                int n = s.length();
                        int[] pair = new int[n];
                                Stack<Integer> stack = new Stack<>();
                                        
                                                // First pass: Find pairs of matching parentheses
                                                        for (int i = 0; i < n; i++) {
                                                                    if (s.charAt(i) == '(') {
                                                                                    stack.push(i);
                                                                                                } else if (s.charAt(i) == ')') {
                                                                                                                int j = stack.pop();
                                                                                                                                pair[i] = j;
                                                                                                                                                pair[j] = i;
                                                                                                                                                            }
                                                                                                                                                                    }
                                                                                                                                                                            
                                                                                                                                                                                    // Second pass: Build the result by jumping through matched parentheses 
                                                                                                                                                                                            StringBuilder res = new StringBuilder();
                                                                                                                                                                                                    int i = 0, dir = 1;
                                                                                                                                                                                                            
                                                                                                                                                                                                                    while (i < n) {
                                                                                                                                                                                                                                if (s.charAt(i) == '(' || s.charAt(i) == ')') {
                                                                                                                                                                                                                                                // "Teleport" to the matching parenthesis and reverse direction
                                                                                                                                                                                                                                                                i = pair[i];
                                                                                                                                                                                                                                                                                dir = -dir;
                                                                                                                                                                                                                                                                                            } else {
                                                                                                                                                                                                                                                                                                            res.append(s.charAt(i));
                                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                                                    i += dir;
                                                                                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                                                                                                    
                                                                                                                                                                                                                                                                                                                                                            return res.toString();
                                                                                                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                                                                                                }
