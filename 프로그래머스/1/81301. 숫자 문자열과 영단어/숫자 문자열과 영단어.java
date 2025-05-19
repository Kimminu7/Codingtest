import java.util.*;

class Solution {
    public int solution(String s) {
        int answer = 0;
        
        Map<String, String> hash = new HashMap<>();
        hash.put("zero", "0");
        hash.put("one", "1");
        hash.put("two", "2");
        hash.put("three", "3");
        hash.put("four", "4");
        hash.put("five", "5");
        hash.put("six", "6");
        hash.put("seven", "7");
        hash.put("eight", "8");
        hash.put("nine", "9");
        
        for (String key : hash.keySet()) {
            s = s.replaceAll(key, hash.get(key));
        }
        
        answer = Integer.parseInt(s);
        
        return answer;
    }
}