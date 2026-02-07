import java.util.Scanner;

public class D_Taxes {

public static boolean isPrime(long n) {
        // Handle edge cases
        if (n <= 1) return false;
        if (n == 2 || n == 3) return true;

        // Eliminate even numbers and multiples of 3
        if (n % 2 == 0 || n % 3 == 0) return false;

        // Check for factors from 5 to √n
        for (int i = 5; i * i <= n; i += 6) {
            if (n % i == 0 || n % (i + 2) == 0)
                return false;
        }

        return true;
    }
    static long findPrime(long n){
        for(long i =n;i>=2;i--){
            if(isPrime(i)){
                return i;
            }
        }
        return -1L;
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        long n = scn.nextLong();
        
        int sol =0;
        long p = findPrime(n);
        if(p==n) System.out.println(1);
        else if(p==n-1){

            p = findPrime(n-1);
            
            while (n!=0) {
                n-=p;
                if(n<8){sol+=2; break;}
                p = findPrime(n);
                sol++;
            }
            System.out.println(sol);            
        }
        else{
            sol++;
            while (n!=0) {
                n-=p;
                if(n<8){sol+=2; break;}
                p = findPrime(n);
                sol++;
            }
            System.out.println(sol);
        }

    }
}