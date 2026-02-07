import java.util.Scanner;

public class A_City_Day {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int x = scn.nextInt();
        int y = scn.nextInt();       
        scn.nextLine();
        int arr[]=new int[n];
        int ind =-1;
        for(int i =0;i<n;i++){
            arr[i]=scn.nextInt();
        }
        for(int i =0;i<n;i++){
            int xx = i-x;
            int yy = i+y;
            
            if(xx>=0&&yy<n&&arr[xx]>=arr[i]&&arr[yy]>=arr[i]){
                boolean find = true;
                for(int j =xx;j<=yy;j++){
                    if(arr[j]<arr[i]){
                        find = false;
                        break;
                    }
                }
                if(find){
                    ind = i+1;
                    break;
                }
            }
            else if(xx<0&&yy>=n){
                int mini =arr[0];
                ind =1;
                for(int j =1;j<n;j++){
                    if(arr[j]<mini){
                        mini =arr[j];
                        ind= j+1;
                    }
                }
                break;
            }
            else if(xx>=0&&arr[xx]>=arr[i]){boolean find = true;
                for(int j =xx;j<n;j++){
                    if(arr[j]<arr[i]){
                        find = false;
                        break;
                    }
                }
                if(find){
                    ind = i+1;
                    break;
                }
            }
            else if(yy<n&&arr[yy]>=arr[i]){ 
                boolean find = true;
                for(int j =0;j<=yy;j++){
                    if(arr[j]<arr[i]){
                        find = false;
                        break;
                    }
                }
                if(find){
                    ind = i+1;
                    break;
                }}
        }
        System.out.println(ind);
    }
}