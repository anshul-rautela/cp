
import java.util.*;
public class B_Farmer_John_s_Card_Game {

    
        public static void main(String[] args) {
            Scanner scn = new Scanner(System.in);
            int t = scn.nextInt();     scn.nextLine();     while (t-- > 0)
                {solve(scn);}
               scn.close();
        }
    
        static void solve(Scanner scn){
            int n = scn.nextInt();
            int m = scn.nextInt();
            scn.nextLine();
            ArrayList<ArrayList<Integer>>arr2= new ArrayList<>();
           // ArrayList<Integer>arr = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                ArrayList<Integer> arr = new ArrayList<>(); // Create a new ArrayList for each row
                for (int j = 0; j < m; j++) {
                    arr.add(scn.nextInt());
                }
                Collections.sort(arr);
                scn.nextLine();
                arr2.add(arr);
            }
            Collections.sort(arr2,(l1,l2)->l1.get(0)-l2.get(0));
            
            boolean ans =false;
            int prev = -4;
            ArrayList<Integer>list = new ArrayList<>();
            ArrayList<Integer>mainlist = new ArrayList<>();
            int cur = -4;
            for(int j =0;j<m;j++){
                for(int i  =0;i<n;i++){
                    cur = arr2.get(i).get(j);
                    mainlist.add(i+1);
                    list.add(cur+1);

                    if(prev>cur){
                        ans = true;
                        break;
                    }
                }
                if(ans) break;
                prev = cur;
            }
            ArrayList<Integer> i= new ArrayList<>(list);
            Collections.sort(i);
            if(i.equals(list)){
                for(int j =0;j<n;j++){
                    System.out.print(mainlist.get(j)+" ");
                }
            }
            else System.out.print(-1);


            System.out.println();
        }
    }
