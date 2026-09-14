import java.util.*;

public class factorial {

    public static int fact(int a ){

        int num = 1;

        for (int i = 1; i <= a; i++) {
            num *= i;   
        }

        return num;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();

       int result = fact(x);
       System.out.println(result);
    }
}
