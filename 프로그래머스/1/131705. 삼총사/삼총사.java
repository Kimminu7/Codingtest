class Solution {
    public int solution(int[] number) {
        int answer = 0;

        // 세 숫자의 합이 0인 경우의 수를 찾기 위해 중첩 반복문 사용
        for (int i = 0; i < number.length - 2; i++) {
            for (int j = i + 1; j < number.length - 1; j++) {
                for (int k = j + 1; k < number.length; k++) {
                    int sum = number[i] + number[j] + number[k]; // 세 숫자의 합 계산
                    if (sum == 0) {
                        answer++; // 합이 0이라면 카운트 증가
                    }
                }
            }
        }

        return answer;
    }
}