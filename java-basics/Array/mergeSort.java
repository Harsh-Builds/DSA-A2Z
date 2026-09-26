
// two sorted arrays in asc order merge them together and make new sorted array

public class mergeSort {
    
    public static void main(String[] args) {
        
        int[] a = {2,4,4,12,14,71};
        int[] b = {3,21,27,69};

        int n = a.length + b.length;
        int[] c = new int[n];

        sortArr(a,b,c);

        for (int i = 0; i < c.length; i++) {
            System.out.print(c[i]+" ");
        }
    }

    public static void sortArr(int[] a, int[] b, int[] c){

       int i = 0;
       int j = 0;

       int k = 0;

       while( i < a.length && j < b.length){

        if (a[i] < b[j]) {
            c[k] = a[i];
            i++;
        }else{
            c[k] = b[j];
            j++;
        }

          k++;
       }
       
       while (k < c.length) {

        if(i < a.length)  c[k] = a[i]; i++;
        if (j < b.length) c[k] = b[j]; j++;
       
        k++;
       }

       
       
    }
}



// Apporoach:-

/*
1)-  new merged array c ka size a+b array size ke equal hoga .
2)- code ki readability and better understanding ke liye function banayege- arr a , arr b and third arr c pass krenge
3)- Main logic:
    -> bcz both arrays sorted hai in asc order, so first elemets ko compare krenge jo ki dono arrays ke sbse chote elements honge.
    -> now chote wale ko new array mai insert kra denge and uski index aage bda denge same bde wale se compare krne ke liye if nex ele bda hua tb dusre arr ke chote ko insert kr denge and bda denge , cycle run....

4)-  main concept:
    -> kyuki comarision ke time definitely koi ek array cmplt ho jayega and out of index na jaye isliye hum dono ki same condion rkhenge ki dono jb tk apne size se chote h .
    -> but jaise he condition false hui loop se bahar, still remaining ele of the anyone of them both's array needs to be insert in the last of new array so jiske bhi elements baki hai new condition lga kr unko add krdo jb tk humara new array ka size fullfill na ho.

*/