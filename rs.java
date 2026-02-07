import java.util.Scanner;

public class rs {
    static void cs(int arr[],int ii){
        int n = arr.length;
        int div = (int)Math.pow(10, ii-1);
        int freq[]= new int[10];
        int prefixsum[]= new int[10];
        for(int i =0;i<n;i++){
            freq[(arr[i]/div)%10]++;
        }

        int sum =0;
        for(int i =0;i<10;i++){
            sum+=freq[i];
            prefixsum[i]= sum;
        }

        int []copy = new int[n];
        for(int i= n-1;i>=0;i--){
            copy[--prefixsum[(arr[i]/div)%10]]=arr[i];
        }
        for(int i= 0;i<n;i++){
            arr[i]= copy[i];
        }   
    }
   
    static void radixSort(int arr[]){
        int n = arr.length;
        int maxi =Integer.MIN_VALUE;
        for(int i = 0;i<n;i++){
            maxi = Math.max(maxi,arr[i]);
        }
        int cnt =0;
        while (maxi!=0) {
            maxi/=10;cnt++;
        }
        for(int i =1;i<=cnt;i++){
            cs(arr,i);
        }
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[]= new int[n];
        for(int i=0;i<n;i++){
            arr[i]= scn.nextInt();
        }
        radixSort(arr);
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }      
    }
}