public class reversearray {
    public static void main(String[] args) {
        int[] arr = {6,8,1,2,4,9,4};

        for(int ele : arr){
            System.out.print(ele+" ");
        }
        
          int n = arr.length - 1;

        for (int i = 0; i < n; i++) {
            int temp = arr[i];
            arr[i] = arr[n];
            arr[n] = temp;
             
            n--;
        }
        System.out.println();
        for(int ele : arr){
            System.out.print(ele+" ");
        }
    }
}
