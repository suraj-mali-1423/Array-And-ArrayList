public class SecondGreater {
    public static void main(String[] args) {
        int [] arr = { 1 , 2 , 10 , 11 , 0};
        int n = arr.length;

        int Max1 = Integer.MIN_VALUE , Max2 = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            if ( Max1 < arr[i]){

                Max2 = Max1;
                Max1 = arr[i];
            }
            else if(Max2 < arr[i] && Max1  != arr[i] ){
                Max2 = arr[i];
            }

        }

        System.out.println(" The Second Lagest element is "+Max2);
    }
}
