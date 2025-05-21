import java.util.*;
 
class Solution {
    public String[] solution(String[] strings, int n) {
        // 배열을 정렬하기 위해 Comparator를 정의합니다.
        Arrays.sort(strings, (a, b) -> {
            // n번째 문자를 기준으로 비교
            if (a.charAt(n) == b.charAt(n)) {
                // n번째 문자가 같으면 사전순으로 정렬
                return a.compareTo(b);
            }
            // n번째 문자를 기준으로 정렬
            return Character.compare(a.charAt(n), b.charAt(n));
        });
        return strings;
    }
}