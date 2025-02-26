public class TwoSum {
    public static  int[] twoSum(int[] nums, int target) {
        int [] Helper = new int[2];
        int n  = nums.length;

        for ( int i = 0 ; i < n - 1 ; i++ ){
            boolean flag = false;
            for ( int j = i+1 ; j < n; j++ ){
                if ( nums[i] + nums[j] == target ){
                    Helper[0] = i;
                    Helper[1] = j;
                    flag = true;
                    break;
                }
            }
            if( flag == true ) break;
        }

        return Helper;
    }

    public static void main(String[] args) {
        int [] arr = { 1 ,2 ,3 ,4 ,5};
        int target = 6;

        int [] result = twoSum(arr , target);
        for( int x : result){
            System.out.print(x +"  ");
        }
    }
}
