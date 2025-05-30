import java.util.*;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        
        for (int m = 0; m < commands.length; m++) {
            int i = commands[m][0];
            int j = commands[m][1];
            int k = commands[m][2];
            
            int[] temp = new int[j-i+1];
            int o = 0;
            for (int n = i-1; n < j; n++) {
                temp[o] = array[n];
                o++;
            } 
            Arrays.sort(temp);
            
            answer[m] = temp[k-1];
        }
        return answer;
    }
}