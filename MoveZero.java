public class MoveZero {
    public static void Sort( int [] arr){
        int i = 0;
        int j = arr.length - 1;

        while ( i <= j ){
            if ( arr[i] == 0  ) i++;
            else if ( arr[i] > arr[j]){
               arr[i] = 0;
               arr[j] = 1;
                i++;j--;
            }
            else  j--;
        }


    }
    public static void main(String[] args) {
         int [] arr = { 0 , 1 , 0 , 1 , 0 , 1 , 0 };

         Sort(arr);

         for ( int X  : arr){
             System.out.print(X +"  ");
         }
    }
}
