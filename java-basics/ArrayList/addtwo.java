import java.util.ArrayList;
import java.util.Collections;

public class addtwo{
    public static void main(String[] args) {

        int[] aa1 = {3,5,0,2,1};
        int[] aa2 = {9,9,9,9,9,5};

          int check1 = aa1.length;
          int check2 = aa2.length;

          ArrayList<Integer> result ;
          // to check which arr is big to be on top during addition.
          if (check1 > check2) {
           result = func(aa1, aa2);
          }else if(check1 < check2){
           result =  func(aa2, aa1);
          }else{
            result = func(aa1, aa2);
          }
       
          System.out.print(result);
    }

  public static  ArrayList<Integer> func(int[] abig, int[] asmall){

           ArrayList<Integer> arrayy = new ArrayList<>();

        // main logic here
        int n = asmall.length-1;
        // int sarnum = asmall[n];  for second arr element to add
        int carry = 0; // for carry

        for (int i = abig.length-1; i >= 0; i--) {

           if(n>=0){
                if(abig[i] + carry + asmall[n] <= 9){
                    arrayy.add(abig[i] + carry + asmall[n]);
                    carry = 0;
                }else{
                    arrayy.add((abig[i] + carry + asmall[n]) % 10);
                    carry = 1;
                }
           }else{
            if(abig[i] + carry <= 9){
                    arrayy.add(abig[i] + carry);
                    carry = 0;
             }else{
                    arrayy.add((abig[i] + carry) % 10);
                    carry = 1;
                }
           }
        
            n--;
        }
        if (carry ==1) {
            arrayy.add(1);
        }
        Collections.reverse(arrayy);
        return arrayy;


    }
}

/*
Notes - approach 

1 ->  2 arrays represented as a numbers add krne hai eg. 65432 + 6543.

2 ->  jab bhi hum 2 numbers add krte hai bda number upar likhte hai.
     isliye phele maine ye pta kra konsa array bda hai by using if else unke size ko compare krke

3 ->  ab jo bda hai definitely loop uske according chalega small wale array ko add krte hue     
        (note: add hum piche se krte to loop bhi arr ki last index se start krenge)

4 -> **best**: ab jab loop bde array ke according chalana hai , maybe 1st array bda hoga otherwise 2nd array.
        so instead of making two loops for same work based on the big array - maine use kra functions ko jha par bas argument pass krne hai konsa bda hai or konsa chota. so ek he loop mai work ho gya.

5 -> Main logic:
(a) 1st arr digit + 2nd array digit + carry. // initially hum carry ko 0 rkhenge kyuki first time adding pr koi  carry nhi hai.

(b) kyuki single digits 9 se upar ho he nhi skti one adding time pr (max- 9+9 = 18) isliye carry 1 hoga.

 (c) or agar add krne pr single digit he aaye (eg. 6+2=8), then carry 0.

(d) but result mai 18 to nhi likhenge add krne pr sirf 8 likhenge 1 tho carry chla gya isiliye add krne pr result agr 9 se jyda hai tb sirf last digit he lene ke liye modulus (%) 10 krenge. 

(e) ab niche wala arry agr chota hoga tb uski index cmplt hone ke baad hum wps usi array ki digit ko add krte hai tb array out of index exeption through krega(bcz arr-- hone pr -1 index chla jayega ).

(f) to solve this i use that parent if-else - add kro dono arrays and carry ko jb tk chota array 0th index tk hai usse niche mtlb ab chote array cmplt ho gya hai tb else section mai sirf 1st arry or carry add kro.

(g) agr last mai koi double digit result ata hai add krne pr (eg. 15) so acc. to main logic sirf 5 he likhenge 1 carry reh jayega kyuki loop uske liye chla he nhi.(that's why i use if carry 1 hai then 1 bhi add krdoat the end of array list then humari cmplt addition ho jayegi)

(h) then reverse the arraylist (bcz elements last se add ho rhe the original sequence ke liye reverse krdo)
*/