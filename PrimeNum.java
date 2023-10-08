import java.util.Scanner;

public class PrimeNum {
    public static void main ( String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Input the number: ");
        int n = sc.nextInt();
        int result = isPrime(n);
        System.out.println(result);
    }

    static int isPrime (int n){

        while ( n > 0 ){
            int fact = factofNumber(n);
            if (fact == n && fact == 1){
              System.out.println("Number is prime");
            }
            else{
                System.out.println("Number is not prime");
            }
        }

        return n;
    }
    static int factofNumber( int n ){
        for ( int i = 0; i<= n; i++){
            if ( n % i == 0 ){
                return i;
            }
        }

        return n;
    }
}
