class Solution {
    public int solution(int a, int d, boolean[] included) {
        int answer = 0;
        
        int leng = included.length;
        
        int startNum = a;
        
        int[] arr = new int[leng];
        
        for(int i=0; i<leng; i++) {
            arr[i] = startNum;
            startNum += d;
        }
        
        for(int i=0; i<leng; i++) {
            if(included[i]) {
                answer += arr[i];
            }
        }
        
        return answer;
    }
}