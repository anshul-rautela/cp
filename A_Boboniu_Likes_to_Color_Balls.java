import java.util.Scanner;

public class A_Boboniu_Likes_to_Color_Balls {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        while (n--!=0) {
            scn.nextLine();
            int arr[] = new int[4];
            for(int i =0;i<4;i++){
            arr[i] = scn.nextInt();
            }
            int cnt =0;
            for(int i =0;i<4;i++){
                if(arr[i]%2!=0) cnt++;
            }           
            if(cnt == 2||((cnt==3)&&(arr[0]==0||arr[1]==0||arr[2]==0))) System.out.println("No");
            else System.out.println("Yes");        
        }
    }
}