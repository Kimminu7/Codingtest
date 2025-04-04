class Solution {
    public int solution(int[] numbers) {       
        int allSum = 0+1+2+3+4+5+6+7+8+9;
        
        for(int num : numbers) {
            allSum -= num;
        }
        
        return allSum;
    }
}