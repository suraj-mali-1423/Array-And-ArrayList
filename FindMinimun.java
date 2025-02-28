public class FindMinimun {
    public static void main(String[] args) {
        int [] arr = { 2 , 4 , 5 , 6 , 1};
        int n = arr.length;
        int  Min = Integer.MAX_VALUE;

        for ( int i = 0 ; i < n ; i++ ){
            if (Min > arr[i]){
                 Min  = arr[i];
            }
        }

        System.out.println(" The Smaller Element Is : " +Min);
    }
}
