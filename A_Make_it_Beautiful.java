import java.util.*;

public class A_Make_it_Beautiful {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();

        while(t--!=0){
            scn.nextLine();
            int n = scn.nextInt();
            scn.nextLine();
            Integer arr[] = new Integer[n];
            for(int i =0;i<n;i++){
                arr[i]= scn.nextInt();
            }boolean found = true;
            Arrays.sort(arr, Collections.reverseOrder());

            int j =n-1;
            int sum =0
            ,k =0;
            int karr[]= new int[n];
            for(int i =0;i<n;i++){
                if(sum%2==0){
                    karr[i] = arr[k]; k++;}
                else{ 
                    karr[i] = arr[j]; j--;}
                                    sum++;

            }
            

             sum =karr[0];
            for(int i =1;i<n;i++){
                if(sum == karr[i]){ System.out.println("NO"); found = false; break;}
                sum+=karr[i];
            }
            if(found){
                System.out.println("YES");
                for (int num : karr) {
                    System.out.print(num + " ");
                }
                System.out.println();
            }
        }


    }
}