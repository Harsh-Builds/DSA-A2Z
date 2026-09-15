public class TwoSum {
    public static void main(String[] args) {
        
        int[] arr = {2,34,1,3,5};

        int target = 2;
        boolean found = true;

        for (int i = 0; i < arr.length; i++) {

            for (int j = i+1; j < arr.length; j++) {
                
                
                if (arr[i] + arr[j] == 2) {
                    System.out.println("target found : "+ arr[i]+ " + " + arr[j] + " = "+ " "+ target);
                    found = false;
                    // break;
                }
            }
            // if (found == false) {
            //     break;
            // }
            
        }
        if (found) {
                System.out.println("target not found");
            }
    }
}
