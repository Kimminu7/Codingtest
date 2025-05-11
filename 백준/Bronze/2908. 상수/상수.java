import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String num1 = sc.next();
        String num2 = sc.next();

        int revnum1 = reverse(num1);
        int revnum2 = reverse(num2);

        if(revnum1 > revnum2) {
            System.out.println(revnum1);
        } else {
            System.out.println(revnum2);
        }
    }

    public static int reverse(String str) {
        StringBuilder sb = new StringBuilder(str);
        sb.reverse();
        return Integer.parseInt(sb.toString());
    }
}
