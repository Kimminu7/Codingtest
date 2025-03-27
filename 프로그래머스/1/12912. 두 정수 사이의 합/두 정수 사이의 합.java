class Solution {
    public long solution(int a, int b) {        
        long sum = 0;
        if(a < b) {
            for(int i=a; i<=b; i++) {
                sum += i;    
            }
            return sum;
        } else if (a == b) {
            return a;
        } else {
            for(int i=b; i<=a; i++) {
                sum += i;
            }
        }
        return sum;
    }
}