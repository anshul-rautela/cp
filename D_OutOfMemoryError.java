import java.util.Scanner;

public class D_OutOfMemoryError {

    public static void main(String[] args) {
        Scanner scn  = new Scanner(System.in);
        int t  = scn.nextInt();
        while (t--!=0) {
            scn.nextLine();
            int n = scn.nextInt();
            int m = scn.nextInt();
            int h = scn.nextInt();
            int arr[] = new int[n];
            int copy[] = new int[n];
            scn.nextLine();
            for(int i =0;i<n;i++){
                arr[i] = scn.nextInt();
            }
            for(int i =0;i<n;i++){
                copy[i] = arr[i];
            }
            int b[] = new int[m];
            int c[] = new int[m]; 
            int mark =0;
            for(int i =0;i<m;i++){
                scn.nextLine();
                int bi = scn.nextInt()-1;
                int ci = scn.nextInt();
                b[i] =bi;
                c[i] =ci;  
                if(ci+arr[bi]>h){
                    mark = i;
                }  
            }
            for(int i =mark;i<m;i++){
                copy[b[i]]+=c[i];
                if(copy[b[i]]>h){
                    for(int j =0;j<n;j++){
                        copy[j] = arr[j];
                    }
                }
            }
            for(int i =0;i<n;i++){
                System.out.print(copy[i]+" ");
            }
            System.out.println();
        }
    }
}