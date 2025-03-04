public class PreviousGreatestEle {
    public static void main(String[] args) {
        int [] arr = { 12 , 8 , 41 , 37 , 2 , 49 , 16 , 28 , 21};
        int n = arr.length;
        int [] Helper = new int[n];

        Helper[0] = -1;
        int PGE = arr[0];

        for ( int i = 1 ; i < n; i++ ){
            Helper[i] = PGE;
            PGE = Math.max(arr[i], PGE);
        }

        for ( int X : Helper){
            System.out.print(X +"  ");
        }
    }
}
