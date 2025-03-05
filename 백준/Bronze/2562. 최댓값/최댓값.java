import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[9];

        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }

        int max = 0;

        for(int i=0; i<arr.length; i++) {
            if(max < arr[i]) {
                max = arr[i];
            }
        }
        System.out.println(max);

        int seat = 0;
        for(int i=0; i<arr.length; i++) {
            if(max == arr[i]) {
                seat = i;
            }
        }

        System.out.println(seat + 1);
    }
}
