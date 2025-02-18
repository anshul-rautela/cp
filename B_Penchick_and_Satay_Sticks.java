import java.util.Scanner;

public class B_Penchick_and_Satay_Sticks {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int T = scn.nextInt();
        while(T--!=0){
            int n = scn.nextInt();
            int arr[]=new int[n];

            for(int i =0;i<n;i++){
                arr[i]=scn.nextInt();
            }
            boolean answered = false;

            for(int i =0;i<n;i++){
                if(arr[i]!=i+1&&arr[i]!=i&&arr[i]!=i+2){
                    System.out.println("NO");
                    answered=true;
                    break;
                }
            }
            if(!answered)
            System.out.println("YES");
        }
    }
    
}