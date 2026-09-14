import java.util.Scanner;

public class IfElse{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        if(n != -n) System.out.println(-n);
    }
}
