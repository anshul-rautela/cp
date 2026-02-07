import java.util.Scanner;

public class A_K_divisible_Sum {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        while (t--!=0) {
            scn.nextLine();
            Long n = scn.nextLong();
            Long k = scn.nextLong();
            
            Long i =2L;

            if(n>k){
                if(n%k==0) System.out.println(1);
                else System.out.println(2);
            }
            else{
            Long sol = k/n+1;
            if(k%n==0) sol--;
            System.out.println(sol);
            }
        }
    }
}