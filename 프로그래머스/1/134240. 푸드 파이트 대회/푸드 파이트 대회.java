public class Solution {
    public String solution(int[] food) {
        StringBuilder left = new StringBuilder();

        // 1번부터 마지막 음식까지 반복
        for (int i = 1; i < food.length; i++) {
            int count = food[i] / 2; // 좌우 동일하게 먹어야 하므로 절반만 사용
            left.append(String.valueOf(i).repeat(count)); // 왼쪽 음식 추가
        }

        // 물(0번)을 가운데 두고, 오른쪽은 왼쪽을 뒤집은 것
        String right = new StringBuilder(left).reverse().toString();
        return left.toString() + "0" + right;
    }
}
