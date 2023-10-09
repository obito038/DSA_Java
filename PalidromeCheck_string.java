public class PalidromeCheck_string {
    public static void main(String[] args) {
       String str = "ABCBA";
       boolean ans = isPalindrome(str);
       if(ans){
           System.out.println("Palindrome");
       }
       else{
           System.out.println("Not Palindrome");

       }
    }

    static boolean isPalindrome(String s){
        int left = 0;
        int right = s.length() - 1;
        while (left <= right){
            char l = s.charAt(left);
            char r = s.charAt(right);
            if (l != r) {
                return false;             }
            left++;
            right--;
        }
        return true;

    }
}
