class Solution {
    public boolean solution(int x) {
        
        String n = Integer.toString(x);
        String[] arr = n.split("");

        
        int sum = 0;
        for(int i=0; i<arr.length; i++) {
            sum += Integer.parseInt(arr[i]);
        }

        if (x % sum == 0) {
            return true;
        }
        
        return false;
    }
}