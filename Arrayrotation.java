public class Arrayrotation {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 45, 3, 4, 2, 2, 1};
        int n = arr.length;
        leftRotate(arr,3,n);
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    static void leftRotate(int[] a, int d, int n){
        if ( d == 0 )
            return;
        d = d % n;
        if ( d > n )
            return;
        int[] temp = new int[d];
        for (int i = 0; i < d; i++){
            temp[i] = a[i];
        }
        for (int i = d; i < n - d; i++){
            a[ i-d] = a[i];
        }
        for (int i = n-d; i < n; i++){
            a[i] = temp[ i -( n - d)];
        }

    }

}
