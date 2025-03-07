
public class TrapWater {
    public static int Trap( int [] arr ){
        int n = arr.length;
        int res = 0;
        for ( int i = 1 ; i < n - 1; i++ ){
            int left = arr[i];
            for (int j = 0 ; j < i ; j++ ){
                left = Math.max(left , arr[j]);
            }
            int right = arr[i];
            for (int j = i+1 ; j < n ; j++ ){
                right = Math.max(right , arr[j]);
            }
            res += Math.min(left , right) - arr[i];
        }
        return  res;
    }
    public static void main(String[] args) {
           int [] arr = {4,2,0,3,2,5};
           int Result = Trap(arr);
        System.out.print(" The Trap water is :"+Result);
    }
}
