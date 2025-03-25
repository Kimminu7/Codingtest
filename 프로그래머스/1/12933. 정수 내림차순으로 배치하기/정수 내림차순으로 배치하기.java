import java.util.Arrays;

class Solution {
    public long solution(long n) {
        // n을 문자열로 바꾸고 각 자릿수를 문자 배열로 변환
        char[] digits = Long.toString(n).toCharArray();
        
        // 정렬
        Arrays.sort(digits);
        
        StringBuilder sortedNumber = new StringBuilder(new String(digits));
        sortedNumber.reverse();  // 내림차순으로 정렬
        
        // long 타입으로 변환하여 반환
        return Long.parseLong(sortedNumber.toString());
    }
}