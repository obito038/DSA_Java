public class Solution {
    public static boolean searchInARotatedSortedArrayII(int []A, int key) {
        // Write your code here.
        int low = 0;
        int high = A.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (A[mid] == key) {
                return true;
            }
            if(A[low] == A[mid] && A[mid] == A[high]){
                low++;
                high++;
                continue;
            }

            if (A[mid] >= A[low]) {
                if (A[low] <= key && key <= A[mid]) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            } else {
                if (A[mid] <= key && A[mid] <= A[high]) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }
        }

        return false;
    
    }
}
