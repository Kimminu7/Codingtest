class Solution {
    public double solution(int[] arr) {
        double sum = 0;
        for(double num : arr) {
            sum += num;
        }
        double avg = sum / arr.length;
        return avg;
    }
}