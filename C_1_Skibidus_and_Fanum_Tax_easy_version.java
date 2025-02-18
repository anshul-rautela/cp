import java.util.Scanner;

public class C_1_Skibidus_and_Fanum_Tax_easy_version {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int T = scn.nextInt();
        scn.nextLine();
        while (T--!=0) {
            int n = scn.nextInt();
            int m= scn.nextInt(); scn.nextLine();
            int arr[] = new int[n];
            for(int i =0;i<n;i++){
                arr[i]= scn.nextInt();
            }
            scn.nextLine();
            m = scn.nextInt();
            if(n<=2){
                System.out.println("YES");
            }
            else{
                boolean sorted = true;
                boolean ansisNo = false;
                for(int i =1;i<n;i++){
                    if(arr[i]<arr[i-1]){
                        sorted = false;
                        arr[i-1]= m-arr[i-1];
                        if(arr[i]<arr[i-1]){
                            ansisNo= true;   
                        }
                    }
                }
                if(sorted&&!ansisNo){
                    System.out.println("YES");
                }
                else System.out.println("NO");
            }
        }
    }
}