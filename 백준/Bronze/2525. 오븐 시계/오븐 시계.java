import java.util.Scanner;
class Main {

  public static void main(String[] args){
    Scanner s = new Scanner(System.in);

    int h = s.nextInt();
    int m = s.nextInt();

    int add = s.nextInt();

    h += add/60;
    m += add%60;

    if (m >= 60){
      h++;
      m -= 60;
    }
    if (h >= 24){
      h -= 24;
    
    }

   System.out.print(h+" "+m);

  }
}