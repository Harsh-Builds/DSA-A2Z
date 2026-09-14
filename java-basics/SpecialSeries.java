
import java.util.Scanner;

public class SpecialSeries {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("enter the num: ");
        int n = sc.nextInt();

        int a = 1;

        for(int i = n; i >= 1 ; i--){

            System.out.println(a);
            System.out.println(n);

            a = a+1;
            n = n-1;
        }
    }
}
