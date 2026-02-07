import java.util.Scanner;

public class A_Halloumi_Boxes {

    public static boolean isSorted(int arr[]){
        for(int i =1;i<arr.length;i++){
            if(arr[i]<arr[i-1]) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner scn  = new Scanner(System.in);
        int t  = scn.nextInt();
        while (t--!=0) {
            scn.nextLine();
            int n = scn.nextInt(); 
            int k = scn.nextInt();
            int arr[]=new int[n];
            for(int i =0;i<n;i++){
                arr[i]=scn.nextInt();
            }
            if(k!=1){
                System.out.println("YES");
            }
            else{
                if(isSorted(arr)){
                    System.out.println("YES");
                }else System.out.println("NO");
            }
            
        }
    }
}