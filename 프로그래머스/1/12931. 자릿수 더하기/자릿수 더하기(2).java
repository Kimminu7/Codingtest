public class Solution {
    public int solution(int n) {
        String m = String.valueOf(n); // 문자열화 시킴.
        int answer = 0;

        for (int i=0; i<m.length(); i++) {
            answer += m.charAt(i) - '0'; // 아스키 코드 값으로 값을 뺌.
        }

        return answer;
    }
}
