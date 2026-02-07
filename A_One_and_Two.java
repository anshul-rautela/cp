import java.util.Scanner;

public class A_One_and_Two {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        while (t--!=0) {
            scn.nextLine();
            int n = scn.nextInt();
            scn.nextLine();
            int twocount =0;
            int arr[]= new int[n];
            int sum =1;
            for(int i =0;i<n;i++){
                arr[i]=scn.nextInt();
                if(arr[i]==2) twocount++;
                // sum*=arr[i];
            }                                                                                       
            int k = 1;
            boolean found = false;
            int two=0;
            for(int i =0;i<n;i++){
                // k*=arr[i];
                if(twocount%2!=0) break;

                if(arr[i]==2)two++;

                if(two==twocount/2){
                    System.out.println(i+1);
                    found = true;
                    break;
                }
                // sum/=arr[i];
                // if(sum==k){
                //     System.out.println(i+1);
                //     found = true;
                //     break;
                // }
            }
        
            if(!found) System.out.println(-1);

        }
    }
}