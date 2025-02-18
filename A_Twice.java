import java.util.HashMap;
import java.util.Scanner;

public class A_Twice {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int T=scn.nextInt();

        while(T--!=0){
            int n = scn.nextInt();
            int m =n;
            int arr[]=new int[n];
            int i =0;
            while(n--!=0){
                arr[i++]=scn.nextInt();
            }
            n=m;
            HashMap<Integer,Integer>map = new HashMap<>();

            for( i=0;i<n;i++){
                int key = arr[i];
                if(!map.containsKey(key)){
                    map.put(arr[i], 1);
                }
                else{
                    map.put(key, map.get(key)+1);
                }
            }
            int sum=0;
            for(int x:map.keySet()){
                int y = map.get(x);
                if(y%2==0){
                    sum+=y/2;
                }
                else{
                    sum+=(y-1)/2;
                }
            }
            System.out.println(sum);
    
        }
    }
}