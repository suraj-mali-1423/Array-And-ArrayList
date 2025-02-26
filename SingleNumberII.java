import java.util.Arrays;

public class SingleNumberII {
    public static int SingleII ( int [] arr ){
        int n = arr.length;
        Arrays.sort(arr);

        for ( int i = 0 ; i < n - 1 ; i += 3 ){
            if ( arr[i] != arr[i+1]){
                return arr[i];
            }
        }

        return arr[n-1];
    }
    public static void main(String[] args) {
        int [] arr = {2,2,3,2};
        int Single = SingleII(arr);

        System.out.println(" The Unique Number is : "+Single );
    }
}
