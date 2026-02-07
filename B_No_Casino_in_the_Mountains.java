import java.util.Scanner;

public class B_No_Casino_in_the_Mountains {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        while (t--!=0) {
            scn.nextLine();
            int n = scn.nextInt();
            int k = scn.nextInt();
        
            int arr[] = new int[n];
            scn.nextLine();
            for(int i =0;i<n;i++){
                arr[i] = scn.nextInt();
            }
        
            int cnt =0;
            for(int i =0;i<n;i++){
                boolean found = true;
                int intcount =0;
                int j =i;
                for(;j<n&&j<i+k;j++){
                    if(arr[j]!=0){
                        found = false;
                        break;
                    }                
                    intcount++;
                }
                
                i =j;
                if(intcount==k){ cnt++;
                }
                
            }
            System.out.println(cnt);
        }
    }
}