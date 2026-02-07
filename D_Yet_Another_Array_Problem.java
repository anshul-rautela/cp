import java.util.Arrays;
import java.util.Scanner;
public class D_Yet_Another_Array_Problem {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        Long t = scn.nextLong();
        while (t--!=0) {
            scn.nextLine();
            int n = scn.nextInt();
            Long arr[]= new Long[n];
            for(int i =0;i<n;i++){
                arr[i]= scn.nextLong();
            }
            Arrays.sort(arr);
            Long[] primes = {2L, 3L, 5L, 7L, 11L, 13L, 17L, 19L, 23L, 29L, 
                            31L, 37L, 41L, 43L, 47L, 53L, 59L, 61L, 67L, 71L, 
                            73L, 79L, 83L, 89L, 97L, 101L, 103L, 107L, 109L, 113L, 
                            127L, 131L, 137L, 139L, 149L, 151L, 157L, 163L, 167L, 173L, 
                            179L};

            Long mini =Long.MAX_VALUE;

            for(int i =0;i<primes.length;i++){
                Long k = primes[i];
    
                for(int j =0;j<arr.length;j++){
                    Long l = arr[j];
                    boolean chotaval = gcd(k, l);
                    if(chotaval)mini = Math.min(mini,k);
                }
            }
            System.out.println(mini);
        }
    }
    
    public static boolean gcd(long a, long b) {
        while (b != 0) {
            long temp = b;
            b = a % b;
            a = temp;
        }
        return a == 1; // Returns true if GCD is 1 (coprime), false otherwise
    }
}