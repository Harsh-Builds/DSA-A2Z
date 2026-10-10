package ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class common {
    public static void main(String[] args) {
        int[]a = {3,4,2,2,4};
        int[]b = {3,2,2,7};

           Arrays.sort(a);
        Arrays.sort(b);
        
        ArrayList<Integer>arr = new ArrayList<>();
        
            int i = 0;
            int j = 0;
        
        while(i < a.length && j < b.length){
            
            if(a[i] == b[j]){
                arr.add(a[i]);
                i++;
                j++;
                
            }else if(a[i]<b[j]){
                i++;
            }else{
                j++;
            }
        }
        
        for (int k = 0; k < arr.size(); k++) {
            System.out.print(arr.get(k));
          }
    }
}
