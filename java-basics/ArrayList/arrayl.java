package ArrayList;
import java.util.*;

public class arrayl {

    public static void main(String[] args) {

        ArrayList<Integer> arr = new ArrayList<>();

        arr.add(10);
        arr.add(20);
        arr.add(30);
        arr.add(40);
        arr.add(50);

         arr.set(3,333);

        System.out.println(arr.size());
        System.out.println(arr);
        
       arr.remove(0);

        for (int i = 0; i < arr.size(); i++) {
            System.out.print(arr.get(i)+" ");
        }
    }
    
}
