// display ap 2 ,5,8,11.....n terms
import java.util.Scanner;

public class Ap{

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the terms : ");
        int n = sc.nextInt();

        for (int i = 2; i <= (n*3)-1; i = i+3) {
            System.out.println(i+" ");
        }
    }

}