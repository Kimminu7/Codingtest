class Solution {
    public int[] solution(int[] num_list) {
        int len = num_list.length;
        int last = num_list[len - 1];
        int secondLast = num_list[len - 2];
        
        // 새로 추가할 값
        int newElement;
        
        // 조건에 맞게 값 설정
        if (last > secondLast) {
            newElement = last - secondLast;
        } else {
            newElement = last * 2;
        }
        
        // 기존 배열보다 크기가 하나 더 큰 새로운 배열 생성
        int[] answer = new int[len + 1];
        
        // 기존 배열 값 복사
        for (int i = 0; i < len; i++) {
            answer[i] = num_list[i];
        }
        
        // 새로운 값 추가
        answer[len] = newElement;
        
        return answer;
    }
}
