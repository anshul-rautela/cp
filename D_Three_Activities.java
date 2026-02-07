import java.util.Scanner;

public class D_Three_Activities {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        while (t--!=0) {
            scn.nextLine();
            int n = scn.nextInt();
            int arr[][]= new int[3][n];
            for(int i =0;i<3;i++){
                scn.nextLine();
                for(int j =0;j<n;j++){
                    arr[i][j]= scn.nextInt();
                }
            }
            int maxi =-1;
            int maxj2 =-1;
            int maxj3 =-1;
            int j1 =-1;
            int j2 =-1;
            int j3 =-1;

            for(int i =0;i<3;i++){
                for(int j =0;j<n;j++){
                    if(arr[i][j]>maxi){
                        
                        if(j!=j2){
                            maxj3=maxj2;
                            j3=j2;
                        }
                        if(j!=j1){
                            maxj2=maxi;
                            j2=j1;
                        }
                        // maxj3= maxj2;
                        // maxj2 = maxi;
                        maxi =arr[i][j];
                        // j3=j2;
                        // j2 = j1;
                        j1=j;
                        // System.out.println("maxi "+maxi);
                    }
                    else if(arr[i][j]>maxj2&&j!=j1){
                        if(j!=j2){
                            maxj3=maxj2;
                            j3=j2;
                        }
                        maxj2 = arr[i][j];
                        j2 = j;
                        // System.out.println("maxi2 "+maxj2);
                    }
                    else if(arr[i][j]>maxj3&&j!=j1&&j!=j2){
                        maxj3= arr[i][j];
                        j3= j;
                        // System.out.println("maxi3 "+maxj3);
                    }
                }
            }
            System.out.println(maxi+maxj2+maxj3);
        }
    }
}