public class sumOfElementsInArray {
    public static void main(String[] args) {
        int[] arr = {2, 4, 5, 6, 1};
        int n = arr.length;
        System.out.println(sumOfElements(arr,n));
    }

    public static int sumOfElements(int[] arr, int n){
        int sum = 0;
        for (int i = 0; i < n; i++){
            sum = sum + arr[i];
        }
        return sum;
    }
}
