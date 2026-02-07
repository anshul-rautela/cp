import java.util.Scanner;

public class A_Game_with_Integers {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int t  = scn.nextInt();
        while(t--!=0){
            scn.nextLine();
            int n= scn.nextInt();
            if(n%3==0) System.out.println("Second");
            else System.out.println("First");
        }
    }
}