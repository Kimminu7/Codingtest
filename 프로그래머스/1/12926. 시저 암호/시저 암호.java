class Solution {
    public String solution(String s, int n) {
        StringBuilder result = new StringBuilder(); // 문자열을 효율적으로 만들기 위한 StringBuilder

        for (char ch : s.toCharArray()) { // 문자열을 문자 배열로 만들어서 하나씩 순회
            if (ch == ' ') { // 공백이면 그대로 추가
                result.append(' ');
            } else if (ch >= 'a' && ch <= 'z') { // 소문자일 경우
                // 'a'를 기준으로 얼마나 떨어져 있는지 계산 (0-25)
                // n만큼 밀고 26으로 나눈 나머지로 다시 'a'로부터의 위치 계산
                // 'a'의 ASCII 값에 더해서 새로운 소문자 ASCII 값을 얻음
                char shifted_char = (char) ('a' + (ch - 'a' + n) % 26);
                result.append(shifted_char);
            } else if (ch >= 'A' && ch <= 'Z') { // 대문자일 경우
                 // 'A'를 기준으로 얼마나 떨어져 있는지 계산 (0-25)
                // n만큼 밀고 26으로 나눈 나머지로 다시 'A'로부터의 위치 계산
                // 'A'의 ASCII 값에 더해서 새로운 대문자 ASCII 값을 얻음
                char shifted_char = (char) ('A' + (ch - 'A' + n) % 26);
                result.append(shifted_char);
            }
        }

        return result.toString(); // StringBuilder를 String으로 변환하여 반환
    }
}