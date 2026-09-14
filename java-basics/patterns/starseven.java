import java.util.Scanner;

public class starseven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

         int n = sc.nextInt();
            // int a = n;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j < i ; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= n-i+1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

       

    }
}
