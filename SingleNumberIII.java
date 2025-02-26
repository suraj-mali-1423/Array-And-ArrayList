import java.util.Arrays;
public class SingleNumberIII {
    public static int [] SingleIII( int [] arr ){
        int n = arr.length;
        int [] helper = new int[2];
        Arrays.sort(arr);
        int j = 0 ;
        for (int i = 0; i < n-1; i +=2) {
            if ( arr[i] != arr[i+1]){
                helper[j] = arr[i];
                j++;
            }
        }

        if (arr[n-1] != arr[n-2]){
            helper[j] = arr[n-1];
        }

        return  helper;
    }
    public static void main(String[] args) {
        int i;
        int [] arr  = { 1,2,1,3,2,5};
        int [] result = SingleIII(arr);
        for(  i = 0 ; i < result.length ; i++ ){
            System.out.print(result[i] +"  ");
        }
    }
}
