public class secondMax {
    public static void main(String[] args) {
        int[] arr = {4,10,6,3,8,5,23,65,43,10};

        int max = arr[0];

        // int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }

        System.out.println(max);
        int maxx = arr[0];
        for (int j = 0; j < arr.length; j++) {
            if (maxx < arr[j] && arr[j] != max) {
                maxx = arr[j];
            }
        }

        System.out.println(maxx);
    }
}
