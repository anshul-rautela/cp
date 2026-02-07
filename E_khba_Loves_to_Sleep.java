import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class E_khba_Loves_to_Sleep {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        while (t--!=0) {
            scn.nextLine();
            int n = scn.nextInt();
            int no_of_sol = scn.nextInt();
            int total_no = scn.nextInt();
        
            scn.nextLine();

            int arr[] = new int[n];
            for(int i =0;i<n;i++){
                arr[i] = scn.nextInt();
            }

            int low = 0;
            int high = total_no;
            int sol = 0;
            Arrays.sort(arr);
            while (low<=high) {
                int mid = (low+high)/2;
                
                if(check(mid,arr,no_of_sol,total_no)){
                    // System.out.println(mid);
                    sol = mid;
                    low = mid+1;
                }
                else high = mid-1;
            }
            // System.out.println("sol "+" "+sol);
         Set<Integer>set = new HashSet<>();

      int count =0;
        for(int i =1;i<arr.length;i++){
            if(arr[i]-arr[i-1]>=sol*2){

            count++;
            if(count>no_of_sol) break;
            set.add(arr[i]-sol);
            
        }
        }

        for(int i = arr[arr.length-1];i<total_no;i++){
            if(i-sol>=arr[arr.length-1]){

            count++;
            if(count>no_of_sol) break;
                set.add(i);
            }
        }

        for(int i =0;i<arr[0];i++){

            
            if(i+sol<=arr[0]){
                count++;
            if(count>no_of_sol) break;
         set.add(i);}
        }

        
        for(int x:set){
            System.out.print(x+" ");
        }
        System.out.println();
        
        }
    }

    static boolean check(int mid,int arr[],int no_of_sol,int total_no){

        Set<Integer>set = new HashSet<>();
        for(int i =1;i<arr.length;i++){
            if(arr[i]-arr[i-1]>=mid*2) set.add(arr[i]-mid);
            if(set.size()>=no_of_sol) return true;
        }

        for(int i = arr[arr.length-1];i<total_no;i++){
            if(i-mid>=arr[arr.length-1]){
                set.add(i);
            if(set.size()>=no_of_sol) return true;
            }
        }

        for(int i =0;i<arr[0];i++){
            if(i+mid<=arr[0]) set.add(i);
            
            if(set.size()>=no_of_sol) return true;
        }
        return set.size()>=no_of_sol;
    }
}