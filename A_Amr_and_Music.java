import java.util.Arrays;
import java.util.Scanner;

public class A_Amr_and_Music {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int d = scn.nextInt();
        scn.nextLine();
        int arr[]  = new int[n];
        for(int i = 0;i<n;i++){
            arr[i] = scn.nextInt();
        }
        int barr[] = arr.clone();
        Arrays.sort(arr);

        int sum=0;
        int last = -1;
        int solsize = 0;
        for(int i =0;i<n;i++){
            sum+=arr[i];
            if(sum>d){
                sum-=arr[i];
                last = i-1;
                break;
            }
            last = i;
            solsize++;
        }
        if(last<=-1){
            System.out.println(0);
        }else{
            System.out.println(solsize);
            for(int i =0;i<n;i++){
                if(barr[i]<arr[last]){
                    System.out.print(i+1+" ");
                    sum-=barr[i];
                }
            }
            
            for(int i =0;i<n;i++){
                if(barr[i]==arr[last]){
                    if(sum-barr[i]>-1)
                        System.out.print(i+1+" ");
                    else break;
                    sum-=barr[i];
                }
            }
        }



    }
}