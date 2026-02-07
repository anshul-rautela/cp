import java.util.Scanner;

public class B_Even_Array {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        while (t--!=0) {
            scn.nextLine();
            int n = scn.nextInt();
            scn.nextLine();
            int arr[] = new int[n];
            int oddcnt=0;
            int evencnt=0;
            for(int i =0;i<n;i++){
                arr[i] = scn.nextInt();
                if(i%2!=arr[i]%2){
                    if(arr[i]%2==0) evencnt++;
                    else oddcnt++;
                }
                            }
            if(oddcnt==evencnt){
                System.out.println(oddcnt);
            }
            else{
                System.out.println(-1);
            }






        }
    }
}