
import java.util.*;

class Solution {
    public String evaluate(String s, List<List<String>> knowledge) {
            Map<String, String> dict = new HashMap<>();
                    for (List<String> pair : knowledge) {
                                dict.put(pair.get(0), pair.get(1));
                                        }
                                                
                                                        StringBuilder result = new StringBuilder();
                                                                StringBuilder currentKey = new StringBuilder();
                                                                        boolean inBracket = false;
                                                                                
                                                                                        for (char c : s.toCharArray()) {
                                                                                                    if (c == '(') {
                                                                                                                    inBracket = true;
                                                                                                                                } else if (c == ')') {
                                                                                                                                                String key = currentKey.toString();
                                                                                                                                                                result.append(dict.getOrDefault(key, "?"));
                                                                                                                                                                                currentKey.setLength(0);
                                                                                                                                                                                                inBracket = false;
                                                                                                                                                                                                            } else if (inBracket) {
                                                                                                                                                                                                                            currentKey.append(c);
                                                                                                                                                                                                                                        } else {
                                                                                                                                                                                                                                                        result.append(c);
                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                                    
                                                                                                                                                                                                                                                                                            return result.toString();
                                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                                }