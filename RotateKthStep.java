import java.sql.SQLOutput;

public class RotateKthStep {
    public  static  void ReverseKth( int [] arr , int k ){
        int n = arr.length;
        int [] Result = new int [n];

        for ( int i = 0 ; i < n ; i++ ){
            Result[(i+k) % n] = arr[i];
        }

        for ( int i = 0 ; i < n ; i++ ){
             arr[i] = Result[i];
        }

    }
    public static void main(String[] args) {
        int [] arr = {1 , 2 , 3 , 4 , 5 , 6 , 7};
        ReverseKth(arr , 2);

        System.out.println(" Rotating Array : ");
        for ( int X  : arr ){
            System.out.print(X +"  ");
        }
    }
}
