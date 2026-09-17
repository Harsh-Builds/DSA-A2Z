public class rotate {
    public static void main(String[] args) {
        int[] arr = {4,5,6,2,3,1};

        int d = 3;

        int[] arr2 = new int[arr.length];
       
        // this code for inserting  all arr elem who comes after starting 2 indx into arr2
        int count = 0;
        for (int i = d; i < arr2.length; i++) {
            arr2[count] = arr[i];
            count ++;
        }
       
        // this for remaining elm of arr in arr2
        for (int j = 0; j < d; j++) {
            arr2[count] = arr[j];
            count++;
           
        }

        // now arr2 --> arr
        for (int i = 0; i < arr2.length; i++) {
            arr[i] = arr2[i];
        }

        print(arr);
        System.out.println();
         print(arr2);
    }

    public static void print(int[] a){
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+" ");
        }
    }
}
