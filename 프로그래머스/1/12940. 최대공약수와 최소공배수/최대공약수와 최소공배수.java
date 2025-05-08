public class Solution {
    public int[] solution(int n, int m) {
        int gcd = gcd(n, m);
        int lcm = (n * m) / gcd;
        return new int[]{gcd, lcm};
    }

    // 최대공약수 구하는 유클리드 호제법
    private int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }
}
