import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class B_Set_of_Strangers {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int T = scn.nextInt();
        scn.nextLine();
        while (T--!=0) {
            int n= scn.nextInt();
            int m= scn.nextInt();
            scn.nextLine();
            int arr[][]= new int[n][m];
            int maxi =-1;   
            HashMap<Integer,Integer>map = new HashMap<>();

            for(int i =0;i<n;i++){
                for(int j =0;j<m;j++){
                    arr[i][j]= scn.nextInt();
                    int key = arr[i][j];
                    if(map.containsKey(key)){
                        map.put(key,map.get(key)+1);
                    }
                    else map.put(key,1);
                }
                scn.nextLine();
            }
            int maxikey = -1;
            for(int key:map.keySet()){
                if(maxi<map.get(key)){
                    Math.max(maxi,map.get(key));
                    maxikey  = key;
                }
            }

            HashSet <Integer> set = new HashSet<>();
            set.add(maxikey);
            int sol =0;

            for(int i =0;i<n;i++){
                for(int j =0;j<m;j++){
                    int key = arr[i][j];
                    if(!set.contains(key)){
                        set.add(key);
                        int cnt = dfs(arr,i,j,0);
                        sol+=cnt;
                    }
                    else{
                        arr[i][j]=maxikey;
                    }
                }
            }
            System.out.println(sol);
        }
    }
}