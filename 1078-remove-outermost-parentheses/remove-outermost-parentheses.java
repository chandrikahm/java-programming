class Solution {
        public String removeOuterParentheses(String s) {
                StringBuilder result = new StringBuilder();
                        int depth = 0;
                                
                                        for (char c : s.toCharArray()) {
                                                    if (c == '(') {
                                                                    // If depth is greater than 0, it's not an outermost '('
                                                                                    if (depth > 0) {
                                                                                                        result.append(c);
                                                                                                                        }
                                                                                                                                        depth++;
                                                                                                                                                    } else if (c == ')') {
                                                                                                                                                                    depth--;
                                                                                                                                                                                    // If depth is greater than 0 after decrementing, it's not an outermost ')'
                                                                                                                                                                                                    if (depth > 0) {
                                                                                                                                                                                                                        result.append(c);
                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                    
                                                                                                                                                                                                                                                                            return result.toString();
                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                }
