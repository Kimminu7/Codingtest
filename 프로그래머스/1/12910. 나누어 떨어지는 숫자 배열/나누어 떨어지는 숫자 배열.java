import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        List<Integer> list = new ArrayList<Integer>();

        for(int i=0; i<arr.length; i++){
            if(arr[i] % divisor == 0){
                list.add(arr[i]); // List 에 담기
            }
        }

        Collections.sort(list); // 정렬

        int[] answer; // 값을 반환할 배열 생성

        if(list.isEmpty()){
            answer = new int[]{-1};
        }
        else {
            answer = new int[list.size()];
            for(int i=0; i<list.size(); i++){
                answer[i] = list.get(i);
            }
        }
        return answer;
    }
}
