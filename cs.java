import java.util.Scanner;

public class cs {
    static void countSort(int arr[]){
        int n = arr.length;
        int maxi = Integer.MIN_VALUE;
        for(int i =0;i<n;i++){
            maxi = Math.max(maxi,arr[i]);
        }
        int freq[] = new int[maxi+1];
        int prefixsum[]= new int[maxi+1];
        for(int i =0;i<n;i++){
            freq[arr[i]]++;
        }
        int sum =0;
        for(int i =0;i<maxi+1;i++){
            sum+=freq[i];
            prefixsum[i]= sum;
        }
        int []copy = new int[n];
        for(int i= n-1;i>=0;i--){
            copy[--prefixsum[arr[i]]]= arr[i];
        }
        for(int i =0;i<n;i++){
            arr[i]= copy[i];
        }       
    
    }


    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[]= new int[n];
        for(int i =0;i<n;i++){
            arr[i]= scn.nextInt();
        }
        countSort(arr);
        for(int i =0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }    
}
