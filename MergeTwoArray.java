public class MergeTwoArray {
    public static int []  Merge ( int [] arr1 , int []arr2 ){
         int i = 0;
         int  j = 0;
         int k =  0;
         int [] helper = new int[arr1.length + arr2.length];
         while (i < arr1.length && j < arr2.length ){
             if ( arr1[i] <= arr2[j] ){
                 helper[k++] = arr1[i];
                 i++;
             }
             else {
                 helper[k++] = arr2[j];
                 j++;
             }
         }

         while( i < arr1.length){
             helper[k++] = arr1[i];
             i++;
         }
        while( j < arr2.length){
            helper[k++] = arr2[j];
            j++;
        }
        return helper;
    }
    public static void main(String[] args) {
        int [] arr1 = { 1 ,2 ,3};
        int n = arr1.length;

        int [] arr2 = { 4 , 5 ,6 , 7};
        int m = arr2.length;
       int [] Result =  Merge(arr1, arr2  );

         for ( int X : Result){
             System.out.print(X +"  ");
         }

    }
}
