//Process1
public class ReverseString {
    public static void main(String[] args) {
        String str = "123";
        String reversedStr = reverseString(str);
        System.out.println("Reversed string: " + reversedStr);
    }

    static String reverseString(String str) {
        StringBuilder sb = new StringBuilder(str);
        sb.reverse();
        return sb.toString();
    }
}


//Process2
//public class ReverseString {
//    public static void main(String[] args) {
//        int num = 123;
//        int reversednum = 0;
//        while(num != 0){
//            int digit = num % 10;
//            reversednum = reversednum * 10 + digit;
//            num = num / 10;
//        }
//            System.out.println(reversednum);
//    }
//}

