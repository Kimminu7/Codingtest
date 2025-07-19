class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        String holl = "";
        String jjak = "";
        for(int i=0; i<num_list.length; i++) {
            if (num_list[i] % 2 != 0) {
                holl += num_list[i];
            } else {
                jjak += num_list[i];
            }
        }
        answer = Integer.parseInt(holl) + Integer.parseInt(jjak);
        
        return answer;
    }
}