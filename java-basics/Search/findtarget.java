import java.util.*;

class findtarget{

    public static void main(String[] args) {
        
        int[] arr = {54,42,32,32,32,32,23,12,7,5,2,1};

        int k = 32;

        int idx = -1;

        int n = arr.length;
        int hi = 0;
        int lo = n-1; 

        while(hi <= lo){

            int mid = (hi+lo)/2;

            if (arr[mid] == k) {
                
                idx = mid;
                lo = mid-1;
                

            }else if(arr[mid] > k){

                hi = mid+1;
            }else{
                lo = mid-1;
            }
        }

        System.out.println(idx);
    }
    

}