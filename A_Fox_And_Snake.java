import java.util.Scanner;

public class A_Fox_And_Snake {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();

        boolean right = true;
        boolean changed = false;
        int arr[][]=new int[n][m];
        for(int i =0;i<n;i++){
            for(int j=0;j<m;j++){
                if(i%2==0){
                    System.out.print("#");
                }
                else if(j==m-1&&right&&!changed){
                    System.out.print("#");
                    right=false;
                    changed=true;
                }
                else if(j==0&&!right&&!changed){
                    System.out.print("#");
                    right=true;
                    changed=true;
                }
                else System.out.print(".");
            }System.out.println();
            changed=false;
        }
    }
}