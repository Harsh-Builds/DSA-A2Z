import java.util.*;

public class oddEven {
   public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);

     int[] arr = {4,34,7,12,80};

     print(arr);

     for (int i = 0; i < arr.length; i++) {
        if (i%2 ==0) {
            arr[i] += 10;
        }else{
            arr[i] *= 2;
        }
     }
     System.out.println();
     print(arr);

   } 

   public static void print(int[] x){
    for (int i = 0; i < x.length; i++) {
        System.out.print(x[i]+" ");
    }
   }
}
