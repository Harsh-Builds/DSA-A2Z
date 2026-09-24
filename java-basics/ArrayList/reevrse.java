package ArrayList;
import java.util.ArrayList;

public class reevrse {
   public static void main(String[] args) {
    ArrayList<Integer> arr = new ArrayList<>();

    arr.add(4);
    arr.add(6);
    arr.add(2);
    arr.add(9);
    arr.add(11);
    arr.add(8);

    System.out.print("original - ");
    for(int ele : arr){
        System.out.print(ele+" ");
    }

    System.out.println();
    System.out.print("After reverse - ");

    int j = arr.size()-1; 
    for (int i = 0; i < j; i++) {
        
        int temp = arr.get(i);
        arr.set(i, arr.get(j));
        arr.set(j, temp);

        j--;
    }

    for(int ele : arr){
        System.out.print(ele+" ");
    }

   } 
}
