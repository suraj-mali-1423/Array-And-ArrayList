public class ReverseArray {
    public static void Reverse_Array( int [] arr  ){
         int n = arr.length;
         int i = 0 ;
         int j = n - 1;

         while (i <= j ){
             int temp = arr[i];
             arr[i] = arr[j];
             arr[j] = temp;
             i++;
             j--;
         }
        System.out.println();
    }
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6,7};
        Reverse_Array(arr);

        for( int X  : arr ){
            System.out.print(X +"  ");
        }

    }
}
