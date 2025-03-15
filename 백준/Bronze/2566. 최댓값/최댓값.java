import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[9][9];

        for(int i=0; i<arr.length; i++) {
            for(int j=0; j<arr[i].length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        
        int max = 0;
        int row = 1, column = 1;

        for(int i=0; i<arr.length; i++) {
            for(int j=0; j<arr[i].length; j++) {
                if (max < arr[i][j]){
                    max = arr[i][j];
                    row = i + 1;
                    column = j + 1;
                }
            }
        }
        System.out.println(max);
        System.out.print(row + " " + column);
    }
}
