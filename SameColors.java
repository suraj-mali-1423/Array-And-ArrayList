
import java.awt.*;

import static java.util.Collections.swap;

public class SameColors {

    public static void Colors ( int [] arr ){
        int lo = 0 ;
        int mid = 0;
        int hi = arr.length - 1;

        while(mid <= hi){
            if ( arr[mid] == 0){
                int temp = arr[lo];
                arr[lo] = arr[mid];
                arr[mid] = temp;
                lo++;
                mid++;
            }
            else if (arr[mid] == 1) mid++;
            else {
                int temp = arr[hi];
                arr[hi] = arr[mid];
                arr[mid] = temp;
                hi--;
            }
        }

    }
    public static void main(String[] args) {
           int [] arr = {2,0,2,1,1,0};
           Colors(arr);

           for ( int X : arr){
               System.out.print(X +"  ");
           }
    }
}
