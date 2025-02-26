import java.util.Arrays;

public class Single {
    public  static int SingleNumber( int [] arr ){
        int  X = 0;
        int  n = arr.length;
        for( int i = 0 ; i < n; i++){
            X = X ^ arr[i];
        }

        return X;
    }
    public static void main(String[] args) {
         int [] arr = { 2 , 1 , 3, 2 , 1 , 3, 5};
          int Single = SingleNumber(arr);

        System.out.println(" The Unique Numbe ris : "+Single );
    }
}
