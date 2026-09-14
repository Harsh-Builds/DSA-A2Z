import java.util.Scanner;

public class StarTwo {
    
    public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);

          int n = sc.nextInt();

          int i=1;
          while (i <= n) {
            
            for (int j = 1; j <= n; j++) {
                System.out.print("* ");
            }
            System.out.println();
            i++;
          }
    }
}
