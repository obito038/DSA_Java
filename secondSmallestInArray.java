public class secondSmallestInArray {
    public static void main(String[] args) {
        int[] arr ={2,4,5,1,3};
        System.out.println(secondSmallest(arr));
    }
    public static int secondSmallest(int[] a){
        int n = a.length;
        int ss = -1;
        int s = a[0];
        for (int i =0; i < n; i++){
            if (s > a[i]){
                ss = s;
                s = a[i];
            }
        }
        return ss;
    }
}
