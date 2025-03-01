import java.util.Scanner;

public class ReverseKthII {
    public static  void ReverseKth( int [] arr , int i , int j ){
        int n = arr.length;

        while ( i <= j ){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++; j--;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.print(" Enter the Kth Number : ");
        int k = Sc.nextInt();
        int [] arr = {1 , 2 , 3 , 4 , 5 , 6 , 7};
        int n  = arr.length;

        k = k % n;

        ReverseKth(arr ,  0 , (n - k - 1));
        System.out.println(" Rotating Array of : ( 0 to N-K-1 ) ");
        for ( int X  : arr ){
            System.out.print(X +"  ");
        }
        ReverseKth(arr ,  (n-k) , (n-1) );
        System.out.println(" Rotating Array : (N-K To N-1) ");
        for ( int X  : arr ){
            System.out.print(X +"  ");
        }
        ReverseKth(arr ,  0 , n-1);
        System.out.println(" Rotating Array : (0 To N-1 ) ");
        for ( int X  : arr ){
            System.out.print(X +"  ");
        }
    }
}
