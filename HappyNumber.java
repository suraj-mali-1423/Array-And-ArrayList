public class HappyNumber {
    public static int SquareSum ( int n ){
         int digit , sum = 0;

         while ( n > 0 ){
              digit = n % 10;
              sum = sum + (digit * digit);
              n = n / 10;
         }

         return sum;
    }
    public  static boolean IsHappy( int n ){

         if ( n == 1 || n == 7 ) return true;

         int sum = SquareSum(n);
         while( sum != 1 && sum != 4 ){
                sum = SquareSum(sum);
         }

         return (sum == 1);
    }
    public static void main(String[] args) {
        System.out.println(IsHappy(19));
    }
}
