import java.util.ArrayList;

public class unique {
    
    public static void main(String[] args) {
        
        int[] nums = {1,2,2,2,5,5,13,23,45,45,56};
        int k = 1;

    for(int e : nums){
        System.out.print(e+" ");
      }
       System.out.println();

        ArrayList<Integer>arr = new ArrayList<>();

        arr.add(nums[0]);

        for (int i = 0; i < nums.length; i++) {
            if(i != 0 ){
                if (nums[i] != nums[i-1]) {
                    arr.add(nums[i]);
                    k++ ; 
                }
            }
        }
      for (int i = 0; i < arr.size(); i++) {
        nums[i] = arr.get(i);
      }

      for(int e : nums){
        System.out.print(e+" ");
      }

      System.out.println();
       System.out.println(k);
    }
}
