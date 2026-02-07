import java.util.Arrays;
import java.util.Scanner;

public class C_Isamatdin_and_His_Magic_Wand {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        while (t--!=0) {
            scn.nextLine();
            int n = scn.nextInt();
            int arr[] = new int[n];
            scn.nextLine();
            boolean even = false;
            boolean odd = false;
            
            for(int i =0;i<n;i++){
                arr[i]= scn.nextInt();
                if(arr[i]%2==0) even= true;
                else odd = true;
            }
            if(even&&odd){
                Arrays.sort(arr);
            }
for(int i =0;i<n;i++){
    System.out.print(arr[i]+" ");            
}
            System.out.println();

        }
    }
}