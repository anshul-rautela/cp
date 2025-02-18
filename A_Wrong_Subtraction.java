import java.util.Scanner;

public class A_Wrong_Subtraction {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int k = scn.nextInt();
        while (k--!=0) {
            if(n%10==0){
                n/=10;
            }
            else{
                n--;
            }
        }
        System.out.println(n);
    }
}