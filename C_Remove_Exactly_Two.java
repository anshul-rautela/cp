import java.util.*;

class DS{
int n;
ArrayList<Integer>parent;
ArrayList<Integer>rank;

    DS(int n){
        this.n = n;
        parent = new ArrayList<>(1+n);
        rank = new ArrayList<>(1+n);
        for(int i =0;i<=n;i++){
            parent.add(i);
            rank.add(0);            
        }
    }
    public int findP(int i){
        if(parent.get(i)!=i){
            return findP(parent.get(i));
        }
        //parent.get(i)=i;
        return i;
    }
    public void union(int u,int v){
        int pu = findP(u);
        int pv=  findP(v);
        if(pu==pv){
            if(rank.get(pv)<=rank.get(pu)){
                parent.set(pv,parent.get(pu));
                rank.set(pv, rank.get(pv)+1);    
            }
            else{
                parent.set(pu,parent.get(pv));
                rank.set(pu, rank.get(pu)+1);        
            }
        }
    }
    public void remove(int u){
        parent.set(u,-1);
        for(int i =1;i<=n;i++){
            if(parent.get(i)==u){
                parent.set(i,i);
            }
        }
    }
    
}

public class C_Remove_Exactly_Two {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        n++;  // Adjust n for 1-based indexing
        scn.nextLine();

        DS ds = new DS(n);
        int[] arr = new int[n + 1];  // Degree array to count the connections

        // Read the edges and apply union-find
        for (int i = 1; i < n; i++) {
            int u = scn.nextInt();
            int v = scn.nextInt();
            arr[u]++;
            arr[v]++;
            ds.union(u, v);
        }
            int maxi2 =0;
            int maxi2Ind=-1;
            int maxiInd=-1;
            int maxi =0;
            for(int i =1;i<=n;i++){
                if(maxi<arr[i]){
                    
                    maxi2=maxi;
                    maxi2Ind=maxiInd;
                    maxi = arr[i];
                    maxiInd=i;
                }
                else if(maxi2<=arr[i]){
                    maxi2=arr[i];
                    maxi2Ind=i;
                }
            }
            ds.remove(maxi2Ind);
            ds.remove(maxiInd);
            int sum =0;
            for(int i =1;i<=n;i++){
                if(ds.findP(i)==i){
                    sum++;
                }
            }
            System.out.println(sum);
        }
    }
