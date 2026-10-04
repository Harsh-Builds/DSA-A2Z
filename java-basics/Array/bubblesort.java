public class bubblesort {

    public static void print(int[] arr){

        for(int ele : arr){
            System.out.print(ele+" ");
        }
    }
    public static void main(String[] args) {

        int[] arr = {4,7,12,3,54,2,4,23};
        print(arr);

        /* 
        boolean check = false;
        for (int i = 0; i < arr.length-1; i++) {
            if (arr[i] < arr[i+1]) {
                check = true;
                break;
            }
        }
            we don't need this code bcz we are performing the same things in inner loop for same situation (best case) where array is already sortedd tc- O(n)
*/
        // if (check) {

            for (int i = 0; i < arr.length-1; i++) {

                boolean check2 = true;
                for (int j = 0; j < arr.length-1-i; j++) { // we are using -1 from length bcz we don't want to exceed the index and -i because after each pass we will get last ele sorted so loop will go less
                    if (arr[j] < arr[j+1]) {
                        int temp = arr[j];
                        arr[j] = arr[j+1];
                        arr[j+1] = temp;

                        check2 = false;
                    }    
                 }

                 if (check2 == true) {  // if check2 is true it means we dosnt perform any swapping and arr is sorted already
                    break;
                 }
            
            }
        // }
      
        System.out.println();
        print(arr);
    }
}
