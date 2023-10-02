public class floor {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        int n = arr.length;
        System.out.println("floor is: " + func(arr, 25, n));
    }

    static int func(int[] arr, int target, int n) {
        int low = 0;
        int high = n - 1;
        int ans = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] <= target) {
                ans = arr[mid];
                low = mid + 1;

            } else {
                high = mid - 1;
            }
        }

        return ans;

    }

}
