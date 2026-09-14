public class ArrSearch {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,-1,9};

        int x = 6;
        int res = -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
               res = i;
               break;
            }
        }
        
        if (res == -1) {
            System.out.println(-1);
        }else{
            System.out.println(res);
        }

    }
}
