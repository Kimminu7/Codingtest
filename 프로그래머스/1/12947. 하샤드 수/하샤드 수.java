class Solution {
    public boolean solution(int x) {
        
        String n = Integer.toString(x); // 정수형 -> 문자열로 변환
        String[] arr = n.split(""); // split으로 쪼개어 배열로 변환

        int sum = 0;
        for(int i=0; i<arr.length; i++) {
            sum += Integer.parseInt(arr[i]); // 문자열 -> 정수형 변환
        } 
        
        if (x % sum == 0) {
            return true;
        }
        return false;
    }
}
