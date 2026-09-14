import java.util.*;

public class diamond {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        // for upper triangle 
        int star = 1;
        int space = n-1;

for (int i = 1; i <= n; i++) {

      for (int j = 1; j <= space; j++) {
            System.out.print("  ");
        }
        space-- ;

      for (int k = 1; k <= star; k++) {
        System.out.print("* ");
      }
      star += 2 ;
    
      System.out.println();
}
      // for lower triangle 

        int star_2 = star - 4;
    for (int i = 1; i <= n-1; i++) {

        for (int j = 1; j <= i; j++) {
            System.out.print("  ");
        }
        for (int k = 1; k <= star_2; k++) {
            System.out.print("* ");
        }
        System.out.println();
        star_2 -= 2;
    }
      
    }
}
