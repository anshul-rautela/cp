    import java.util.Scanner;

    public class A_Presents {

        public static void main(String[] args) {
            Scanner scn = new Scanner(System.in);
            int n = scn.nextInt();
            scn.nextLine();
            int arr[]=new int[n];
            for(int i =0;i<n;i++){
                arr[i]=scn.nextInt();
            }
            
            int ans[]=new int[n];
            for(int i =0;i<n;i++){
                ans[arr[i]-1]=i+1;
            }
            for(int i =0;i<n;i++){
                System.out.print(ans[i]+" ");
            }
            
        }
    }