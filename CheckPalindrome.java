import java.util.Scanner;

public class CheckPalindrome {
    static long reverse(long X) {
        long Y = 0;
        while (X > 0) {
            long digit = X % 10;
            Y = Y * 10 + digit;
            X = X / 10;
        }
        return Y;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input the number :");
        long X = sc.nextLong();
        long temp = X;
        long Y = reverse(X);
        if (temp == Y) {
            System.out.println("Palindrome Number");
        }
        else {
            System.out.println("Not Palindrome Number");
        }

    }
}
