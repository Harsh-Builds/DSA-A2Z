
import java.util.Scanner;

public class StarOne{

    public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);

          int raw = sc.nextInt();
          int col = sc.nextInt();

          for (int i = 1; i <= raw; i++) {

            for (int j = 1; j <= col; j++) {

                 System.out.print("* ");
                
            }

            System.out.println();
            
          }
    }
}