class Solution {
    public int solution(int n) {
        int sum = 0;
        
//         for(int i=0; i<=n; i+=2) {  2씩증가 표현도 가능함.
//             sum += i;
//         }
        
        for(int i=0; i<=n; i++) {
            if(i % 2 == 0) {
                sum += i;
            }
        }
        
        return sum;
    }
}
