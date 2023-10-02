public class firstAndLastOccurance {
    public static void main(String[] args) {
        int[] arr = {1,2,4,6,7,8,8,8,10,10};
        int n = arr.length;
        System.out.println("first and last occur is: " + firstAndLAstOccur(arr,12,n));
    }
    static int lowerBound(int[] arr, int x, int n){
        int low = 0;
        int high = n -1;
        int ans = n;

        while(low <= high){
            int mid = low+(high-low)/2;
            if( arr[mid] >= x){
                ans = mid;
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
        }

        return ans;

    }
    static int upperBound(int[] arr, int x, int n){
        int low = 0;
        int high = n -1;
        int ans = n;

        while(low <= high){
            int mid = low+(high-low)/2;
            if( arr[mid] > x){
                ans = mid;
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
        }

        return ans;
    }


    public static int[] firstAndLAstOccur(int[] arr, int x, int n){
        int lb = lowerBound(arr,x,n);
        if ( lb == n || arr[lb] != x) return new int[]{-1, -1};
        return new int[]{lb, upperBound(arr, x, n) - 1};
    }

}
