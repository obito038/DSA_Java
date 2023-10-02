import java.util.Scanner;

public class ceil {
    public static void main(String[] args) {
//        int[] arr = {10, 20, 30, 40, 50};
//        int n = arr.length;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int arr_size = 0;
        if (sc.hasNextInt()) {
            arr_size = sc.nextInt();
        }

        int[] arr = new int[arr_size];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < arr_size; i++) {
            if (sc.hasNextInt()) {
                arr[i] = sc.nextInt();
            }
        }
        System.out.println("ceil is: " + func(arr, 14));
    }
//6 6 7 12 16 18 19 22 30
    static int func(int[] arr, int target) {
        int n = arr.length;
        int low = 0;
        int high = n - 1;
        int ans = -1;

        while (low <= high) {
            int mid = low + high / 2;
            if (arr[mid] >= target) {
                ans = arr[mid];
                high = mid - 1;

            } else {
                low = mid + 1;

            }
        }

        return ans;

    }
}
