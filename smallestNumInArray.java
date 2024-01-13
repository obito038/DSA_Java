public class smallestNumInArray {
    public static void main(String[] args) {
        int[] arr = {2,3,3,3,3,3,3};
        System.out.println(smallNum(arr));
    }

    public static int smallNum(int [] arr){
        int n = arr.length;
        int s = arr[0];
        for (int i = 1; i < n; i++){
            if (s > arr[i])  s=arr[i];
        }
        return s;
    }


}

