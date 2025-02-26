import java.util.Arrays;
public class SingleNumberIII {
    public static int [] SingleIII ( int [] arr ){
        int n = arr.length;
        Arrays.sort(arr);
        int [] helper = new int[2];
        int j =  0;

        for ( int i = 0 ; i < n - 1 ; i ++ ){
            if ( arr[i] != arr[i+1]){
                helper[j] = arr[i];
                j++;
            }else i++;
        }

        if( arr[n-2] != arr[n-1]){
            helper[j] = arr[n-1];
        }
        return helper;
    }
    public static void main(String[] args) {

         int [] arr = {1,2,1,3,2,4,4,5};

         int [] result = SingleIII(arr);

         for( int x : result){
             System.out.print(x +"  ");
         }
    }
}
