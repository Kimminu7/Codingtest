class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        Long checkP = Long.parseLong(p);
        
        for(int i=0; i<t.length() - p.length() + 1; i++) {
            String check = t.substring(i, i + p.length());
            Long checkLong = Long.parseLong(check);
            if (checkLong <= checkP) {
                answer += 1;
            }
        }
        
        return answer;
    }
}