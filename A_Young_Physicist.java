import java.util.Scanner;

public class A_Young_Physicist {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = n;
        int arr[][]= new int[n][3];
        int i =0,j=0;
        
        while (n--!=0) {
            j=0;
            scn.nextLine();
            arr[i][j++]=scn.nextInt();
            arr[i][j++]=scn.nextInt();
            arr[i][j]=scn.nextInt();
        i++;
        }
        boolean sol = true;
        for(j =0;j<3;j++){
            int sum =0;
            for( i =0;i<m;i++){
                sum+=arr[i][j];
            }
            if(sum!=0){
                sol = false;
                break;
            }
        }
        if(sol){
            System.out.println("YES");
        }
        else System.out.println("NO");

    }
}