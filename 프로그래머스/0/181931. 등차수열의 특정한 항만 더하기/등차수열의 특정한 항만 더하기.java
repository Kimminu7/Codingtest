class Solution {
    public int solution(int a, int d, boolean[] included) {
        int answer = 0;
        
        int startNum = a;
        
        int[] arr = new int[included.length];
        
        for(int i=0; i<included.length; i++) {
            arr[i] = startNum;
            startNum += d;
        }
        
        for(int i=0; i<included.length; i++) {
            if(included[i]) {
                answer += arr[i];
            }
        }
        
        return answer;
    }
}