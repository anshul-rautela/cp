import java.util.Scanner;

public class radixSort {
    static void countSort(int arr[],int ii){
        int n = arr.length;
        int freq[]= new int[10];
        int div = (int)Math.pow(10, ii-1);
        for(int i = 0;i<n;i++){
            freq[(arr[i]/div)%10]++;
        }
        int prefixsum[] = new int[10];
    
        int sum =0;
        for(int i =0;i<=9;i++){
            sum+=freq[i];
            prefixsum[i]= sum;
        }
        int copy[]= new int[n]; 
        for(int i=0;i<n;i++){
            copy[--prefixsum[(arr[i]/div)%10]]=arr[i];
        }
    
        for(int i=0;i<n;i++){
            arr[i]= copy[i];
        }
    }

    static void radixsort(int arr[]){
        int n = arr.length;

        int maxi = Integer.MIN_VALUE;
        for(int i =0;i<n;i++){
            maxi=Math.max(maxi,arr[i]);
        }
        int cnt = 0;
        while (maxi!=0) {
            maxi/=10;
            cnt++;
        }
        for(int i =2;i<=cnt;i++){
            countSort(arr,i);
        }
    }


    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[]= new int[n];
        for(int i =0;i<n;i++){
            arr[i]= scn.nextInt();
        }
        radixsort(arr);
        for(int i =0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}