public class moveZero {

    public static void print(int[] arr){
        for(int ele : arr){
            System.out.print(ele+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr = {1,0,-2,3,0,4,8,0,10,12};

        for (int i = 0; i < arr.length-1; i++) {
            
            
            for (int j = 0; j < arr.length-1-i; j++) {
                if (arr[j] == 0 ) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp; 
                    
                }
            }

         
        }
        print(arr);
    }
}
