import java.util.Scanner;

public class A_Olympiad_Date {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        
        int t = scn.nextInt();
        while (t--!=0) {
            scn.nextLine();
            int n = scn.nextInt();
            scn.nextLine();
            int arr[]= new int[n];
            int freq[] = new int[6];
            freq[0]=3;
            freq[1]=1;
            freq[2]=2;
            freq[3]=1;            
            freq[5]=1;
            int sol = -1;
            boolean flag = true;

            for(int i =0;i<n;i++){
                arr[i]= scn.nextInt();
                if(arr[i]<6&&arr[i]!=4&&freq[arr[i]]!=0){
                    freq[arr[i]]--;
                }
                else if(flag){ sol = i;
                    flag = false;    
                }
                }
            boolean ans = true;
            for(int i =0;i<5;i++){
                if(freq[i]>0&&i!=4){
                    ans = false;
                    break;
                    // System.out.println(0);
                }
            }
            if(ans)
            System.out.println(sol);
            else System.out.println(0);
        }
        

    }
}