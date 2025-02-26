import java.util.Arrays;
public class ContainDuplicate {
    public static boolean Duplicate( int [] arr ){
         int n = arr.length;
         Arrays.sort(arr);

         for ( int i = 1; i < n; i++ ){
              if ( arr[i] == arr[i-1]){
                  return true;
              }
         }

         return false;
    }
    public static void main(String[] args) {
        int [] arr = {1,2,3};

        boolean Result = Duplicate(arr);
        System.out.println(Result);
    }
}
