class Solution {
    public long solution(long num) {
        if (num == 1) return 0;
        int i = 0;
        while(i < 500) {
            if (num % 2 == 0) {
                num /= 2;
            } else {
                num = num * 3 + 1;
            } 
            i++;
            if (num == 1) {
                return i;
            }
        }    
        return -1;
    }
}