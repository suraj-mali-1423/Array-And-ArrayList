public class GreatestNum {
    public static void main(String[] args) {
        int [] arr = { 12 , 8 , 41 , 37 , 2 , 49 , 16 , 28 , 21};
        int n = arr.length;
        int [] Helper = new int[n];

        // Way 1 To Find the Next Greatest Element
//        for ( int i = 0 ; i < n - 1 ; i++){
//            int Max = 0 ;
//            for ( int j = i + 1 ; j < n ; j++){
//                if ( Max < arr[j]){
//                    Max = arr[j];
//                }
//            }
//            Helper[i] = Max;
//        }

        // Way 2 to Find the The Next Greatest Element
         Helper[n-1] = -1;
         int NGE = arr[n-1];
           for ( int i = n - 2 ; i >= 0 ; i-- ){
               Helper[i] = NGE;
               NGE = Math.max(NGE , arr[i]);
           }
        for ( int X : Helper){
            System.out.print( X +"  ");
        }
    }
}
