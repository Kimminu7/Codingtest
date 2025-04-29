class Solution {
    public long solution(int price, int money, int count) {
        long result = 0;
        long usedMoney = 0;
        for (int i = 1; i <= count; i++) {
            usedMoney += (long)price * i;
        }
        if (money >= usedMoney) {
            result = 0;
        } else {
            result = usedMoney - money;
        }
        return result;  
    }
}